public abstract class Angajat {
    private String nume;
    private double salariu;

    public Angajat(String nume, double salar) {
        this.nume = nume;
        this.salariu = salar;
    }

    public abstract double calculSalar();

    public String getNume(){
        return nume;
    }

    public boolean equals(Angajat angajat) {
        return this.nume.equals(angajat.getNume());
    }

    public double getSalariu(){
        return salariu;
    }

    public void schimbaSalariu(double salariu){
        this.salariu = salariu;
    }



}
