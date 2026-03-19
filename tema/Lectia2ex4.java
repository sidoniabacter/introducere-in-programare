package tema;

// prima clasa
class Sertar {
    private int latime;
    private int lungime;
    private int inaltime;

    public Sertar(int latime, int lungime, int inaltime) {
        this.latime = latime;
        this.lungime = lungime;
        this.inaltime = inaltime;
    }

    public void tipareste() {
        System.out.println("Sertar " + latime + " " + lungime + " " + inaltime);
    }
}

// a doua clasa
class Birou {
    private int latime;
    private int lungime;
    private int inaltime;
    private Sertar sertar1;
    private Sertar sertar2;

    public Birou(int latime, int lungime, int inaltime, Sertar s1, Sertar s2) {
        this.latime = latime;
        this.lungime = lungime;
        this.inaltime = inaltime;
        this.sertar1 = s1;
        this.sertar2 = s2;
    }

    public void tipareste() {
        System.out.println("Birou " + latime + " " + lungime + " " + inaltime);
        sertar1.tipareste();
        sertar2.tipareste();
    }
}

public class Lectia2ex4 {
    public static void main(String[] args) {
        Sertar s1 = new Sertar(50, 40, 20);
        Sertar s2 = new Sertar(60, 45, 25);

        Birou birou = new Birou(120, 60, 75, s1, s2);

        birou.tipareste();
    }
}