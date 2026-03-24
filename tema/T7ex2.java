package tema;

class Carte {
    int numarPagini;

    public Carte(int numarPagini) {
        this.numarPagini = numarPagini;
    }

    public boolean equals(Carte altaCarte) {
        return this.numarPagini == altaCarte.numarPagini;
    }
}

public class T7ex2 {
    public static void main(String[] args) {
        Carte c1 = new Carte(100);
        Carte c2 = new Carte(100);
        Carte c3 = new Carte(200);

        System.out.println("c1 și c2 identice: " + c1.equals(c2));
        System.out.println("c1 și c3 identice: " + c1.equals(c3));
    }
}