package tema;

import java.util.Scanner;

// Sa se citeasca de la tastatura 2 numere. Daca ambele numere sunt pare sa se afiseze
// media artimetica. Daca ambele sunt impare sa se afiseze produsul lor. Daca unul este par
// si unul impar atunci sa se afiseze suma lor.

public class Ex3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y =  scan.nextInt();
        int ma=0;
        int p=0;
        int sum=0;
        if(x%2==0 && y%2==0){
            ma=(x+y)/2;
            System.out.println(ma);
        }
        else if(x%2!=0 && y%2!=0){
             p = x * y;
            System.out.println(p);
        }
        else{
            sum = x + y;
            System.out.println(sum);
        }
    }
}