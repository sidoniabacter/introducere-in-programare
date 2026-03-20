package tema;

import java.util.Scanner;

// Sa se afiseze inversul unui numar dat (124 -> 421).

public class Ex19 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
       int invers = 0;

        while(n != 0){
            int l = n % 10;
            invers = invers * 10 + l;
            n = n / 10;
        }

        System.out.println("Inversul este: " + invers);
    }
}
