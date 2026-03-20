package tema;

import java.util.Scanner;

// Sa se afiseze separat cifrele unui numar.

public class Ex16 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n!=0){
            int l=n%10;
            System.out.println(l);
            n=n/10;
        }
    }
}