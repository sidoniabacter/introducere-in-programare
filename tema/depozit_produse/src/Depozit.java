import java.util.*;

public class Depozit {
 private List<Produs> listaProduse = new ArrayList<>();

    public void adaugaProdus(Produs p) {
        for (Produs produs : listaProduse) {
            if (produs.getCod() == p.getCod()) {
                produs.adaugaCantitate(p.cantitate);
                return;
            }
        }
        listaProduse.add(p);
    }

    public void tiparesteInventar() {
        for (Produs p : listaProduse) {
            System.out.println(p);
        }
    }
}
