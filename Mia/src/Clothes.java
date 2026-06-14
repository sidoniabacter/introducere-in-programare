public class Clothes {
private String haine;
    public Clothes(String haine) {
        this.haine = haine;
    }
    public String getHaine() {
        return haine;
    }
    public void setHaine(String haine) {
        this.haine = haine;
    }
@Override
    public String toString() {
        return "Clothes [haine=" + haine + "]";
    }
    
}
