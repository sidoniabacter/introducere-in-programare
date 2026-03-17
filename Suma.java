import java.util.Scanner;
public class Suma {
    public static void main(String[] args){
    // suma a n numere naturale
Scanner scan =new Scanner(System.in);
int n=scan.nextInt();
 int suma = 0;
     for(int i=0;i<=n;i++){
        suma=suma +i;
     }
     System.out.println("suma primelor "+n+" numere este "+suma);
    }
}
