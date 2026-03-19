package tema;

import java.util.Scanner;

// Sa se determine suma primelor n numere pare – ‘n’ citit de la tastatura

public class Ex5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int suma = 0;
       for(int i = 0; i < n; i++){ 
            int numarPar = 2 * i;    
            suma += numarPar;
        }
     System.out.println("suma primelor "+n+" numere este "+suma);
    }
    }
