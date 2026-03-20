package tema;

// Sa se afiseze toti divizorii primi ai numarului ‘n’ dat.

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args){
Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
         System.out.print("Divizorii primi ai lui " + n + " sunt: ");

        boolean primul = true;

        for(int d = 2; d <= n; d++){
            if(n % d == 0 && estePrim(d)){
                if(!primul){
                    System.out.print(", ");
                }
                System.out.print(d);
                primul = false;
            }
        }
    }

    public static boolean estePrim(int x){
        if(x < 2) return false;

        for(int i = 2; i <= x / 2; i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
}
