package tema;

import java.util.Scanner;

// Sa se afiseze toti divizorii numarului ‘n’ dat.

public class Ex11 {
     public static void main(String[] args){
Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
         System.out.print("Divizorii lui " + n + " sunt: ");
        for(int d = 1; d <= n; d++){
            if(n % d == 0){
                if(d != n){
                    System.out.print(d + ", ");
                } else {
                    System.out.print(d);
                }
            }
        }
    }
}
