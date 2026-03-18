public class Elev {
    private String nume;
    private String prenume;
    private int vasta;
    private int clasa;

    public Elev(String nume, String prenume, int vasta, int clasa){
        this.nume = nume;
        this.prenume = prenume;
        this.vasta = vasta;
        this.clasa = clasa;

    }

    public String getInfo(){
        return "Nume " + this.nume + "Prenume " + this.prenume + "Varsta " + this.vasta + "Clasa " + this.clasa;
    }
}