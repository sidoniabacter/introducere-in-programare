public class Compensat extends Produs {
private double coeficient;

    public Compensat(int cod, String nume, double pretBaza, int cantitate, double coeficient) {
        super(cod, nume, pretBaza, cantitate);
        this.coeficient = coeficient;
    }

    @Override
    public double getPret() {
        return pretBaza * coeficient;
    }
}
