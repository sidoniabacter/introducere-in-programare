public class EMasina extends Vehicul implements EVehicul, TransportPersoane, TransportMarfa {


    private int capacitateBaterie;
    private int nrMaxPasageri;
    private int capacitateMaxima;

    public EMasina(int id, String producator, int vitezaMax, int capacitateBaterie, int nrMaxPasageri,int capacitateMaxima) {
        super(id, producator, vitezaMax);
        this.capacitateBaterie = capacitateBaterie;
        this.nrMaxPasageri = nrMaxPasageri;
        this.capacitateMaxima = capacitateMaxima;
    }

    public void incarcareBaterie(int nrKwh){
        this.capacitateBaterie +=nrKwh;
    }
    public int nivelBaterie(){
        return this.capacitateBaterie;
    }
    public int nrMaxPasageri(){
        return this.nrMaxPasageri;
    }
    public int capacitateMaxima(){
        return this.capacitateMaxima;
    }

    public String toString(){
     return "EMasina" + 
     "id"+getId()+ 
     " producator "+ getProducator() + 
     " viteza maxima " + getVitezaMax() + 
     " capacitate baterie " + capacitateBaterie +
     " nr maxim de pasageri "+ nrMaxPasageri +
     " capacitate maxima " + capacitateMaxima;
     
     
}
}
