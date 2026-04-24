public class Necompensat extends Produs{
 public Necompensat(int cod, String nume, double pretBaza, int cantitate) {
        super(cod, nume, pretBaza, cantitate);
    }

    @Override
    public double getPret() {
        return pretBaza;
    }
}
