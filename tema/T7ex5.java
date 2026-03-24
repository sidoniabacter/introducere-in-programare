package tema;

class Suma {

    // a) suma dintre 2 numere
    public static int suma(int a, int b) {
        return a + b; // o singura adunare
    }

    // b) suma dintre 3 numere
    public static int suma(int a, int b, int c) {
        return a + b + c; // o singura adunare
    }

    // c) suma dintre 4 numere
    public static int suma(int a, int b, int c, int d) {
        return a + b + c + d; // o singura adunare
    }
}

public class T7ex5 {
    public static void main(String[] args) {
        int suma2 = Suma.suma(2, 3);
        int suma3 = Suma.suma(1, 2, 3);
        int suma4 = Suma.suma(1, 2, 3, 4);

        System.out.println("Suma a doua numere: " + suma2);
        System.out.println("Suma a trei numere: " + suma3);
        System.out.println("Suma a patru numere: " + suma4);
    }
}