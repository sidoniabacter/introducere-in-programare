public class Main {
    public static void main(String[] args) {

        // Creăm colecția cu o capacitate maximă (ex: 10 elemente)
        ColectieGreutati colectie = new ColectieGreutati(10);

        // Greutăți simple
        Greutate g1 = new Simpla(5);
        Greutate g2 = new Simpla(10);

        // Greutăți duble
        Dubla gd1 = new Dubla(
                new Simpla(9),
                new Simpla(7)
        );

        Dubla gd2 = new Dubla(
                new Simpla(2),
                new Simpla(8)
        );

        // Greutate multiplă (poate conține alte greutăți)
        Multipla gm1 = new Multipla();
        gm1.adauga(g1);
        gm1.adauga(gd1);

        Multipla gm2 = new Multipla();
        gm2.adauga(g2);
        gm2.adauga(gd2);
        gm2.adauga(new Simpla(4));

        // Adăugăm în colecție
        colectie.adauga(g1);
        colectie.adauga(g2);
        colectie.adauga(gd1);
        colectie.adauga(gd2);
        colectie.adauga(gm1);
        colectie.adauga(gm2);

        // Afișăm media
        System.out.println("Media greutătilor din colectie este: " + colectie.medie());
    }
}