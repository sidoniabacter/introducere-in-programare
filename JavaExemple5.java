// suma a 10 numere naturale folosind while loop
public class JavaExemple5 {

    public static void main(String[] args) {

       int num = 10, count = 1, total = 0;

       while(count <= num)
       {
           total = total + count;
           count++;
       }

       System.out.println("Sum of first 10 natural numbers is: "+total);
    }
}