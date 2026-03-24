package tema;

class Patrat {
    int latura;

    // Constructor fără parametri
    public Patrat() {
        this.latura = 10;
    }

    // Constructor cu parametru
    public Patrat(int latura) {
        this.latura = latura;
    }

    // Metodă pentru calculul ariei
    public int calculeazaAria() {
        return latura * latura;
    }

    // Metodă pentru afișare
    public void afisare() {
        System.out.println("Patrat l=" + latura + " Aria=" + calculeazaAria());
    }
}

public class T7ex3 {
    public static void main(String[] args) {
        Patrat p1 = new Patrat();     
        Patrat p2 = new Patrat(5);
        Patrat p3 = new Patrat(7);

        p1.afisare();
        p2.afisare();
        p3.afisare();
    }
}
