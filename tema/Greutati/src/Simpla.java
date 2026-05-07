public class Simpla extends Greutate {
private int capacitate;

    public Simpla(int capacitate) {
        this.capacitate = capacitate;
    }

    @Override
    public int capacitate() {
        return capacitate;
    }

    @Override
    public String toString() {
        return "Simpla -> " + capacitate();
    }
}
