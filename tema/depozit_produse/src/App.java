public class App {
    public static void main(String[] args) {
        Depozit depozit = new Depozit();

        Produs p1 = new Compensat(1, "Medicament A", 100, 10, 0.5);
        Produs p2 = new Necompensat(2, "Produs B", 50, 5);
        Produs p3 = new Compensat(3, "Medicament B", 100, 20, 0.5);

        depozit.adaugaProdus(p1);
        depozit.adaugaProdus(p2);
        depozit.adaugaProdus(p3);

        depozit.tiparesteInventar();
    }
}