public class Carnivor extends Animal{
    private String tip;
    private String habitat;
    
    public Carnivor(String nume, int nr_picioare, int varsta, String sex, String tip, String habitat){
        super(nume, nr_picioare, varsta, sex);
        this.tip = tip;
        this.habitat = habitat;
    }

    public String toString(){
        return super.toString() + "\nTip: " + tip + "\nHabitat: " + habitat;
    }


}
