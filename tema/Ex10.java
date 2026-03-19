package tema;

// Care este cel mai mic numar prim mai mare ca 1000?

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        int n = 1001; 

        while(true){
            boolean prim = true;
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    prim = false;
                    break;
                }
            }
            if(prim){
                System.out.println("Cel mai mic numar prim mai mare ca 1000 este: " + n);
                break; 
            }
            n++; 
        }
    }
}