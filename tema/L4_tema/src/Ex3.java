// 3. Scriet ̧i un program Java care cite ̧ste de la tastatur ̆a o linie de text  ̧si numele unui
// fi ̧sier. Programul trebuie s ̆a determine  ̧si s ̆a afi ̧seze pe ecran num ̆arul de linii de text
// din fi ̧sierul indicat care sunt egale cu linia de text citit ̆a de la tastatur ̆a.

import java.io.*;

public class Ex3 {
//  new BufferedReader(new InputStreamReader(System.in)  pentru a putea scrie de la tastatura
    public static void main(String[] args) {
        BufferedReader tastatura = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = null;

        try {
            // citire linie de la tastatura
            System.out.print("Introdu linia de cautat: ");
            String textCautat = tastatura.readLine();

            // citire nume fisier
            System.out.print("Introdu numele fisierului: ");
            String numeFisier = tastatura.readLine();

            br = new BufferedReader(new FileReader(numeFisier));

            String linie;
            int contor = 0;

            while ((linie = br.readLine()) != null) {
                if (linie.equals(textCautat)) {
                    contor++;
                }
            }

            System.out.println("Linia apare de " + contor + " ori.");

            br.close();
            tastatura.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
