public abstract class Vagon {
 public abstract int getCapacitateColete();
    public abstract int getCapacitatePasageri();
    public abstract String getTip();

@Override
    public String toString() {
        return getTip() +
               " | Pasageri: " + getCapacitatePasageri() +
               " | Colete: " + getCapacitateColete();
    }

}
