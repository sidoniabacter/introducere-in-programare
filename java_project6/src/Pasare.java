public class Pasare extends Omnivor{
    private boolean zboara;

    public Pasare(String nume, int nr_picioare, int varsta, String sex, boolean aripi, boolean zboara){
        super(nume, nr_picioare, varsta, sex, aripi);
        this.zboara = zboara;
    }

    @Override
    public String metodaDeplasare(){
        return "Pasarile se deplaseaza in zbor."; 
    }

    public String toString(){
        return super.toString() + "\nZburator: " + zboara + "\n";
    }
}
