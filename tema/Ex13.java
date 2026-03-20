package tema;

import java.util.Scanner;

// Sa se gaseasca perechile de numere a caror suma este 1000, primul sa fie divizibil cu 17
// iar al doilea cu 19.

public class Ex13 {
    public static void main(String[] args){
    for(int a = 0; a <= 1000; a++){
            if(a % 17 == 0){
                int b = 1000 - a;

                if(b % 19 == 0){
                    System.out.println("(" + a + ", " + b + ")");
                }
            }
        }
     }
    }