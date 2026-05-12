public class Autobuz extends Vehicul implements TransportPersoane{
private int nrMaxPasageri;
public Autobuz(int id, String producator, int vitezaMax, int nrMaxPasageri){
    super(id, producator, vitezaMax);
    this.nrMaxPasageri=nrMaxPasageri;
}
public int nrMaxPasageri(){
    return nrMaxPasageri;
}

public String toString(){
     return "Autobuz" + 
     "id"+getId()+ 
     " producator "+ getProducator() + 
     " viteza maxima " + getVitezaMax() + 
     " nr maxim de pasageri "+ nrMaxPasageri;
}

}
