public class Produs {
    private String nume;
    private int greutate;
    private double pret;

public Produs(String nume, int greutate, double pret){
this.nume=nume;
this.greutate = greutate;
this.pret = pret;
}
public String toString(){
    return nume+ " , " +greutate+" , " +pret;
}

public double calculeazaPret(){
    return this.pret;
}
public double calculeazaPret(int cantitate){
return cantitate * this.pret;
}
}
