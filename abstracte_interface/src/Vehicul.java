public abstract class Vehicul {

    private int id;
    private String producator;
    private int vitezaMax;

    public Vehicul(int id, String producator, int vitezaMax) {
        this.id = id;
        this.producator = producator;
        this.vitezaMax = vitezaMax;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducator() {
        return producator;
    }

    public int getVitezaMax() {
        return vitezaMax;
    }

    public void setVitezaMax(int vitezaMax) {
        this.vitezaMax = vitezaMax;
    }
public boolean equals(Vehicul v){
 return this.id == v.id;
}
    


}
