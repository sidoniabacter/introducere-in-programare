package tema;

// Sa se afiseze cifra maxima a unui numar.

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int maxi=-1;
         while(n != 0){
            int l = n % 10;

            if(l > maxi){
                maxi = l;
            }

            n = n / 10;
        }

        System.out.println("Cifra maxima este: " + maxi);
    }
}