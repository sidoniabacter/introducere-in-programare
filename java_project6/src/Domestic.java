public class Domestic extends Omnivor{
    private String adresa;

    public Domestic(String nume, int nr_picioare, int varsta, String sex, boolean aripi, String adresa){
        super(nume, nr_picioare, varsta, sex, aripi);
        this.adresa = adresa;
    }

    @Override
    public String metodaDeplasare(){
        return "Animalele domestice de curte se deplaseaza in pamant."; 
    }
}
