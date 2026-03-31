import java.io.*;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // citire dimensiuni
            System.out.print("N = ");
            int N = sc.nextInt();
            System.out.print("M = ");
            int M = sc.nextInt();
            System.out.print("P = ");
            int P = sc.nextInt();

            // declarare matrici cu Double
            Double[][] A = new Double[N][M];
            Double[][] B = new Double[M][P];
            Double[][] C = new Double[N][P];

            // citire matrice A
            System.out.println("Introdu matricea A:");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                     A[i][j] = sc.nextDouble(); //citeste elementele si le pune in matrice pe pozitia i, j
                }
            }

            // citire matrice B
            System.out.println("Introdu matricea B:");
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < P; j++) {
                    B[i][j] = sc.nextDouble();
                }
            }

            // inmultire matrici
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < P; j++) {
                    C[i][j] = 0.0;
                    for (int k = 0; k < M; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            // scriere in fisier
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("C:\\Users\\HP\\Desktop\\introducere in programare\\rezultat.txt.txt")
            );

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < P; j++) {
                    System.out.print(C[i][j] + " ");      
                    bw.write(String.valueOf(C[i][j]));    
                    bw.write(" ");
                }
                System.out.println();  
                bw.newLine();          
            }
//  forteaza tot ce  in buffer sa fie scris in fisier
            bw.flush(); 

            bw.close();   
            System.out.println("Rezultatul a fost scris in fisier.");

        } catch (Exception e) {
            e.printStackTrace();
        }

        sc.close();
    }
}