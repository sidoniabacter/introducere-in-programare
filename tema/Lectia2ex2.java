package tema;
public class Lectia2ex2 {

    // atribute nestatice private, neinitializate
    private int numar;
    private char caracter;

    public static void main(String[] args) {

        // cream un obiect al clasei
        Lectia2ex2 obj = new Lectia2ex2();

        // afisam valorile implicite
        System.out.println("Valoare int: " + obj.numar);
        System.out.println("Valoare char: [" + obj.caracter + "]");
    }
}