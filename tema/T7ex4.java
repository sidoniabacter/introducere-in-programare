package tema;
import java.util.Scanner;

class Piramida {
    int n;

    public Piramida(int n) {
        this.n = n;
    }

    public void afisare() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(i);
                if (j < n - i + 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
// pentru n=4 - se afiseaza piramida asta

 public class T7ex4 {
     public static void main(String[] args) {
         Piramida p1 = new Piramida(4);
    Piramida p2 = new Piramida(5);
    Piramida p3 = new Piramida(10);

    p1.afisare();
    System.out.println();
    p2.afisare();
    p3.afisare();
  }
 }

// pentru n citit de la tastaturs - se afiseaza piramida asta

// public class T7ex4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Introdu n: ");
//         int n = sc.nextInt();

//         Piramida p = new Piramida(n);
//         p.afisare();
//     }
// }