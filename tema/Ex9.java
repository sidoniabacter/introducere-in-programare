package tema;

// Sa se verifice daca un numar n diferit de 0 sau 1 este prim sau nu.

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if(n <= 1){ 
            System.out.println("Nu este prim");
        } else {
            boolean prim = true; 
            for(int i = 2; i <= Math.sqrt(n); i++){ 
                if(n % i == 0){
                    prim = false;
                    break; 
                }
            }

            if(prim){
                System.out.println("Numarul este prim");
            } else {
                System.out.println("Numarul nu este prim");
            }
        }
    }
}