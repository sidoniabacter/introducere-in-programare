
public class Teren extends Proprietate{
private Rang rang;

public Teren(Adresa adresa, double suprafata, Rang rang){
    super(adresa, suprafata);
    this.rang = rang;
}
 public double calculImpozit() {
        return getSuprafata() * 3.5 / rang.getValue();
    }
    public String toString() {
        String  output = "\tTeren: " + getAdresa() + "\n";
        output += "\t\tSuprafata: " + getSuprafata() + "mp,\n";
        output += "\t\tRang: " + rang + ",\n";
        output += "\t\tCost: " + calculImpozit() + " lei\n";
        return output;
    }

}
