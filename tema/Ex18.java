package tema;

// Sa se afiseze cifra minima a unui numar.

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int mini=9;
         while(n != 0){
            int l = n % 10;

            if(l < mini){
                mini = l;
            }

            n = n / 10;
        }

        System.out.println("Cifra minima este: " + mini);
    }
}