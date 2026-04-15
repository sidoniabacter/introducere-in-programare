public class Omnivor extends Animal{
    private boolean aripi;

    
    public Omnivor(String nume, int nr_picioare, int varsta, String sex, boolean aripi){
        super(nume, nr_picioare, varsta, sex);
        this.aripi = aripi;
    }

    public String toString(){
        return super.toString() + "\nAripi: " + aripi;
    }


}
