import java.util.ArrayList;

public class Firma {
    private ArrayList<Angajat> angajats;

    public Firma(){
        this.angajats = new ArrayList<>();
    }

    public Firma(ArrayList<Angajat> angajats){
        this.angajats = angajats;
    }

    public boolean angajeaza(Angajat angajat){
        for( Angajat a : angajats){
            if(a.equals(angajat)){
                return false;
            }
        }
        this.angajats.add(angajat);
        return true;
    }

    public double salariuMediu(){
        if(angajats.isEmpty()){
            return 0;
        } else {
            double salarSum = 0;
            for(Angajat angajat : angajats){
                salarSum += angajat.calculSalar();
            }
            return salarSum / this.angajats.size();
        }
    }
}
