public class Ghiseu {
 public static void main(String[] args) {
        Contribuabil c1 = new Contribuabil("Popescu Ion", "1234567890123");
        Proprietate p1 = new Cladire(new Adresa("Mihai Eminescu", 11), 100);
        Proprietate p2 = new Teren(new Adresa("Adrei Covaci", 731), 243, Rang.III);
        c1.addProprietate(p1);
        c1.addProprietate(p2);
        System.out.println(c1);
    }
}
