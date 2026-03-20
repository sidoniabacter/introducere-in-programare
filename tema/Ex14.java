package tema;

// Sa se gaseasca perechile de numere a caror suma este 1000, primul sa fie divizibil cu 17
// sau cu 13 iar al doilea cu 19 sau cu 7.

public class Ex14 {
    public static void main(String[] args){
    for(int a = 0; a <= 1000; a++){
            if(a % 17 == 0 || a % 13 == 0){
                int b = 1000 - a;

                if(b % 19 == 0 || b % 7 == 0){
                    System.out.println("(" + a + ", " + b + ")");
                }
            }
        }
     }
    }
