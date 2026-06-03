public class AngajatCuOra extends Angajat{
private int nrOre;
private int nrOreSuplimentare = 0;

public AngajatCuOra(String nume, double salariu, int nrOre) {
    super(nume, salariu);
    this.nrOre = nrOre;
}

public void  adaugaOre(int oreSuplimentare){
    nrOreSuplimentare = nrOre + oreSuplimentare;
}


public double calculSalar() {
    return getSalariu() * (nrOreSuplimentare+nrOre);
}

public int getNrOre() {
    return nrOre;
}

public void setNrOre(int nrOre) {
    this.nrOre = nrOre;
}

public int getNrOreSuplimentare() {
    return nrOreSuplimentare;
}

public void setNrOreSuplimentare(int nrOreSuplimentare) {
    this.nrOreSuplimentare = nrOreSuplimentare;
}



}
