package tema;

import java.util.Scanner;

// Sa se calculeze media aritmetica a n numere – ‘n’ citit de la tastatura

public class Ex7 {
    public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
         double sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i; 
        }

        if(n != 0){
            System.out.println(sum / n); 
        }
    }
}
      
