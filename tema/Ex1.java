package tema;
// Sa se citeasca de la tastatura un numar. Daca este mai mare decat 5 sa se afiseze pe ecran
// cuvantul ADMIS iar daca e mai mic sa se afiseze RESPINS. Daca numarul este mai mic
// decat 1 si mai mare decat 10 sa se afiseze INVALID.

import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if(n < 1 || n > 10){
            System.out.println("INVALID");
        } 
        else if(n > 5){
            System.out.println("ADMIS");
        } 
        else{
            System.out.println("RESPINS");
        }
    }
}