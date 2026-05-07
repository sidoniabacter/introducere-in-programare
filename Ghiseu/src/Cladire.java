
public class Cladire extends Proprietate{
public Cladire (Adresa adresa, double suprafata){
    super(adresa, suprafata);
}

@Override
public double calculImpozit(){
    return getSuprafata()*5;
}

public String toString(){
    String output= "\tCladire: " + getAdresa() + "\n";
    output+= "\t\tSuprafata: " + getSuprafata() + "mp\n";
    output+= "\t\tCost: " + calculImpozit() + "lei\n";
    return output;
}
}
