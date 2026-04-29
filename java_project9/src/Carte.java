import java.util.Objects;

public class Carte implements Comparable<Carte>{

    private String nume;
private String autor;
private int id;
private Integer anPublicare;
public Carte(String nume, String autor, int id, int anPublicare){
    this.nume=nume;
    this.autor=autor;
    this.id=id;
    this.anPublicare=anPublicare;
}
  public String toString(){
    return "Nume: " + nume + " \nAutor: " + autor + " \nID: " + id + " \nAnul Publicarii: " + anPublicare+ "\n";
  }


@Override
public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carte)) return false;
        Carte carte = (Carte) o;
        return nume == carte.nume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume);
    }

@Override
    public int compareTo(Carte other) {
        return this.anPublicare.compareTo(other.anPublicare);
    }
}
