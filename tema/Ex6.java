package tema;

import java.util.Scanner;

// Sa se determine suma primelor n numere impare – ‘n’ citit de la tastatura

public class Ex6 {
    public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int suma = 0;
       for(int i = 0; i < n; i++){ 
            int numarImp = 2 * i+1;    
            suma += numarImp;
        }
     System.out.println("suma primelor "+n+" numere este "+suma);
    }
    }


