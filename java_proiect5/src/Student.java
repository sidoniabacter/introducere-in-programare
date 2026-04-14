public class Student extends Persoana {
private int anStudiu;

public Student (String nume, String adresa, Facultate facultate, int anStudiu){
    super(nume, adresa, facultate);
    this.anStudiu=anStudiu;
}
public String toString(){
    return super.toString()+" ,An studiu "+anStudiu;
}
}
