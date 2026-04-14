public class Persoana {
private String nume;
private String adresa;
private Facultate facultate;

public Persoana (String nume, String adresa, Facultate facultate){
    this.nume = nume;
    this.adresa=adresa;
    this.facultate=facultate;
}
public String toString(){
    return " Nume: " +nume+ " Adresa "+adresa+ " Facultate "+facultate;
}
}
