public class AngajatCuSalariuFix extends Angajat{

    public AngajatCuSalariuFix(String nume, double salariu) {
        super(nume, salariu);
    }

public double calculSalar() {
    return getSalariu();
};

}
