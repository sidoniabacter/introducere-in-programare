public class Autobuz extends Vehicul implements TransportPersoane{
private int nrMaxPasageri;
public Autobuz(int id, String producator, int vitezaMax, int nrMaxPasageri){
    super(id, producator, vitezaMax);
    this.nrMaxPasageri=nrMaxPasageri;
}
public int nrMaxPasageri(){
    return nrMaxPasageri;
}

}
