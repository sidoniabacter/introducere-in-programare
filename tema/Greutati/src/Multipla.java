import java.util.ArrayList;

public class Multipla extends Greutate {

    private ArrayList<Greutate> lista;

    public Multipla() {
        lista = new ArrayList<>();
    }

    public Multipla(ArrayList<Greutate> lista) {
        this.lista = lista;
    }

    public void adauga(Greutate g) {
        lista.add(g);
    }

    @Override
    public int capacitate() {
        int sum = 0;
        for (Greutate g : lista) {
            sum += g.capacitate();
        }
        return sum;
    }

     @Override
    public String toString() {
        String output = "Multipla -> [\n";

        for (Greutate g : lista) {
            output += "  " + g + "\n";
        }

        output += "] = " + capacitate();

        return output;
    }
}