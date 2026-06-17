import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    static class Tara {
        String nume;
        String urlDetalii;
        String populatie = "N/A";
        String procentEvanghelici = "N/A";

        Tara(String nume, String urlDetalii) {
            this.nume = nume;
            this.urlDetalii = urlDetalii;
        }
    }

    public static void main(String[] args) {
        String urlPrincipala = "https://operationworld.org/locations/europe/";
        List<Tara> listaTari = new ArrayList<>();

        try {
            System.out.println("Faza 1: Conectare la Operation World...");
            String htmlPrincipal = descarcaPaginaCompleta(urlPrincipala);

            if (htmlPrincipal.isEmpty()) {
                System.out.println("Eroare: Nu s-a putut citi site-ul. Verifica conexiunea la internet.");
                return;
            }

            // Pasul 1: Găsim toate link-urile către țări din codul sursă
            Pattern patternLink = Pattern.compile("href=\"/locations/([a-z\\-]+)/?\"");
            Matcher matcherLink = patternLink.matcher(htmlPrincipal);

            while (matcherLink.find()) {
                String slug = matcherLink.group(1);
                
                if (!slug.equals("europe") && !slug.equals("locations")) {
                    String urlTara = "https://operationworld.org/locations/" + slug + "/";
                    
                    // Transformăm din "romania" -> "Romania", "san-marino" -> "San Marino"
                    String[] bucati = slug.split("-");
                    StringBuilder numeFrumos = new StringBuilder();
                    for (String b : bucati) {
                        if (!b.isEmpty()) {
                            numeFrumos.append(Character.toUpperCase(b.charAt(0))).append(b.substring(1)).append(" ");
                        }
                    }
                    String numeFinal = numeFrumos.toString().trim();

                    boolean exista = false;
                    for (Tara t : listaTari) {
                        if (t.urlDetalii.equals(urlTara)) { exista = true; break; }
                    }
                    if (!exista) {
                        listaTari.add(new Tara(numeFinal, urlTara));
                    }
                }
            }

            // Dacă din motive de securitate site-ul blochează lista, adăugăm manual principalele țări din Europa ca să fim siguri că ai date în fișier!
            if (listaTari.isEmpty()) {
                System.out.println("[Sistem de Urgență] Folosim lista predefinită de țări din Europa...");
                String[] tariUrgenta = {"romania", "moldova", "france", "germany", "italy", "spain", "united-kingdom", "poland", "ukraine", "greece", "austria", "hungary", "bulgaria"};
                for (String t : tariUrgenta) {
                    String nume = Character.toUpperCase(t.charAt(0)) + t.substring(1);
                    listaTari.add(new Tara(nume, "https://operationworld.org/locations/" + t + "/"));
                }
            }

            System.out.println("\nSe procesează " + listaTari.size() + " țări...");
            System.out.println("---------------------------------------------------------------------------------");

            // Faza 2: Intram pe fiecare țară și extragem cifrele brute
            for (Tara tara : listaTari) {
                System.out.print("Se descarcă: " + tara.nume + " ... ");
                String htmlTara = descarcaPaginaCompleta(tara.urlDetalii);

                // Curățăm tagurile HTML ca să rămână doar textul curat și cifrele
                String textCurat = htmlTara.replaceAll("<[^>]*>", " ").replaceAll("\\s+", " ");

                // Căutare Populație în textul curat (Caută numărul de după cuvântul Population)
                Pattern pPop = Pattern.compile("Population:\\s*([0-9,\\s]+)");
                Matcher mPop = pPop.matcher(textCurat);
                if (mPop.find()) {
                    tara.populatie = mPop.group(1).trim();
                } else {
                    // Căutare secundară în format JSON din spatele paginii
                    Pattern pPopJson = Pattern.compile("\"population\"\\s*:\\s*\"?([0-9,\\.]+)\"?");
                    Matcher mPopJson = pPopJson.matcher(htmlTara);
                    if (mPopJson.find()) {
                        tara.populatie = mPopJson.group(1).trim();
                    }
                }

                // Căutare % Evanghelici în textul curat
                Pattern pEv = Pattern.compile("Evangelical:\\s*([0-9\\.,\\s]+%?)");
                Matcher mEv = pEv.matcher(textCurat);
                if (mEv.find()) {
                    tara.procentEvanghelici = mEv.group(1).trim();
                } else {
                    // Căutare secundară în format JSON
                    Pattern pEvJson = Pattern.compile("\"evangelicalPct\"\\s*:\\s*\"?([0-9\\.]+)\"?");
                    Matcher mEvJson = pEvJson.matcher(htmlTara);
                    if (mEvJson.find()) {
                        tara.procentEvanghelici = mEvJson.group(1).trim() + "%";
                    }
                }

                System.out.println("[Populație: " + tara.populatie + " | Evanghelici: " + tara.procentEvanghelici + "]");
                Thread.sleep(100); 
            }

            // Faza 3: Scrierea garantată în fișier pe desktop-ul tău
            File file = new File("C:/Users/HP/Desktop/introducere in programare/tema/output.csv");
            if (file.getParentFile() != null) {
                file.getParentFile().mkdirs();
            }

            FileWriter writer = new FileWriter(file, false);
            writer.write("sep=;\n");
            writer.write("Country;Population;% Evangelical\n");

            for (Tara tara : listaTari) {
                // Înlocuim eventualele puncte/virgule ce pot strica fișierul Excel
                String pop = tara.populatie.replace(";", "").trim();
                String ev = tara.procentEvanghelici.replace(";", "").trim();
                writer.write(tara.nume + ";" + pop + ";" + ev + "\n");
            }

            writer.close();
            System.out.println("\n---------------------------------------------------------------------------------");
            System.out.println("SUCCES! Fișierul CSV a fost creat cu date salvate la adresa:");
            System.out.println(file.getAbsolutePath());

        } catch (Exception e) {
            System.out.println("\nA apărut o eroare.");
            e.printStackTrace();
        }
    }

    private static String descarcaPaginaCompleta(String urlString) {
        StringBuilder continut = new StringBuilder();
        try {
            URL url = new URL(urlString);
            HttpURLConnection conexiune = (HttpURLConnection) url.openConnection();
            conexiune.setRequestMethod("GET");
            // Setăm exact headerele pe care un server securizat le cere în 2026 pentru a nu ne da pagini goale
            conexiune.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
            conexiune.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
            conexiune.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
            conexiune.setConnectTimeout(5000);
            conexiune.setReadTimeout(5000);

            if (conexiune.getResponseCode() == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(conexiune.getInputStream(), "UTF-8"));
                String linie;
                while ((linie = reader.readLine()) != null) {
                    continut.append(linie).append("\n");
                }
                reader.close();
            }
            conexiune.disconnect();
        } catch (IOException e) {
            // Lăsăm programul să meargă mai departe dacă o pagină dă timeout
        }
        return continut.toString();
    }
}