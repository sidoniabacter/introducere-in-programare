package tema;

import java.util.Scanner;

// Sa se afiseze factorialul unui numar n citit de la tastatura. (FACT=1*2*3*...*n)

public class Ex8 {
     public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int fact=1;
        for(int i = 1; i <= n; i++){
            fact=fact*i;
        }

        System.out.println(fact);
}
}
