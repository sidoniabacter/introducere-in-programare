import java.util.ArrayList;

public class Contribuabil {
private String nume, cnp;
private ArrayList<Proprietate> proprietate;

public Contribuabil(String nume, String cnp) {
    this.nume = nume;
    this.cnp = cnp;
    this.proprietate = new ArrayList<>();
}
public void addProprietate(Proprietate p){
    proprietate.add(p);
}

 public String toString(){
    String output= "Contribuabil: " +nume+ " ,CNP "+cnp+"\n\n";
    double sumaTotala=0;
    output += "Proprietati:\n";
    for(Proprietate p: proprietate){
output +=p;
sumaTotala += p.calculImpozit();
    }
    output+= "\nSuma totala: "+sumaTotala+ " lei\n";
    return output;
 }
}
