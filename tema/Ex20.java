package tema;

import java.util.Scanner;

// Sa se determine daca un numar este palindrom sau nu (palindrom = care citit de la stânga
// la dreapta sau de la dreapta la stânga rămâne neschimbat ex 4334).

public class Ex20 {
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int original = n;
        int invers = 0;

        while(n != 0){
            int l = n % 10;
            invers = invers * 10 + l;
            n = n / 10;
        }

        if(original == invers){
            System.out.println(original + " ESTE palindrom.");
        } else {
            System.out.println(original + " NU este palindrom.");
        }
    }
}
