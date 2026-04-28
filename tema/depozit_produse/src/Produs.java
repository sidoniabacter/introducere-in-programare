public class Produs {
private int cod;
private String nume;
public double pretBaza;
public int cantitate;

public Produs(int cod, String nume, double pretBaza, int cantitate){
    this.cod=cod;
    this.nume=nume;
    this.pretBaza=pretBaza;
    this.cantitate=cantitate;
}
 public double getPret(){
    return pretBaza;
}

    public int getCod() {
        return cod;
    }

    public void adaugaCantitate(int c) {
        this.cantitate += c;
    }

     @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Produs)) return false;
        Produs p = (Produs) obj;
        return this.cod == p.cod;
    }

    @Override
    public String toString() {
        return "Cod: " + cod +
               ", Nume: " + nume +
               ", Pret: " + getPret() +
               ", Cantitate: " + cantitate;
    }
}

