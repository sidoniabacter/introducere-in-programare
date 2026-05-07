public class Dubla extends Greutate {

    private Greutate g1;
    private Greutate g2;

    public Dubla(Greutate g1, Greutate g2) {
        this.g1 = g1;
        this.g2 = g2;
    }

    public void setGreutate1(Greutate g) {
        this.g1 = g;
    }

    public void setGreutate2(Greutate g) {
        this.g2 = g;
    }

    @Override
    public int capacitate() {
        return g1.capacitate() + g2.capacitate();
    }

      @Override
    public String toString() {
        return "Dubla -> (" + g1 + " + " + g2 + ") = " + capacitate();
    }
}