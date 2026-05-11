public class Drona extends Vehicul implements EVehicul, TransportMarfa, Zburator{

    private int capacitateBaterie;
private int capacitateMarfa;
private boolean inAer = false;

    public Drona(int id, String producator, int vitezaMax, int capacitateBaterie, int capacitateMarfa) {
        super(id, producator, vitezaMax);
        this.capacitateBaterie = capacitateBaterie;
        this.capacitateMarfa=capacitateMarfa;
    }
    public void incarcareBaterie(int nrKwh){
capacitateBaterie +=nrKwh;
    }
    public int capacitateMaxima(){
        return this.capacitateMarfa;
    }

    public boolean decolare (){
        if(nivelBaterie() > 20){
            inAer = true;
            return true;
        }
        return false;
    }
    public boolean aterizare (){
        if(inAer){
            inAer = false;
            return true;
        }
        return false;
    }
    
}
