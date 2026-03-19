package tema;

import java.util.Scanner;

// Sa se citeasca de la tastatura un numar. Daca este cuprins intre 1 si 5 sa se afiseze
// numarul respectiv dar in litere. Daca este in afara intervalului sa se afiseze INVALID.
// a. Ex. Pt 3 se afiseaza TREI --- Pt 2 se afiseaza DOI ---- Pentru 8 se afiseaza
// INVALID

public class Ex2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if(n < 1 || n > 5){
            System.out.println("INVALID");
        } 
        else{
            switch(n){
                case 1:
                    System.out.println("UNU");
                    break;
                case 2:
                    System.out.println("DOI");
                    break;
                case 3:
                    System.out.println("TREI");
                    break;
                case 4:
                    System.out.println("PATRU");
                    break;
                case 5:
                    System.out.println("CINCI");
                    break;
            }
        }
    }
}
