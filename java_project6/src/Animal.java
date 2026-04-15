public class Animal {
    private String nume;
    private int nr_picioare;
    private int varsta;
    private String sex;

    public Animal(String nume, int nr_picioare, int varsta, String sex){
        this.nume = nume;
        this.nr_picioare = nr_picioare;
        this.varsta = varsta;
        this.sex = sex;
    }

    public String toString(){
        return "Nume: " + nume + "\nNumar de picioare: " + nr_picioare + "\nVarsta: " + varsta + "\nSex: " + sex;
    }

    public String metodaDeplasare(){
        return "Animalul se deplaseaza."; 
    }
}
