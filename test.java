// afiseaza hi si numele pe care l-ai introdus de la tastatura
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Te rog precizeaza numele: ");
        String name = sc.nextLine();

        System.out.println("Hi " + name + "!");

        sc.close();
    }
}
