package tema;

// Sa se genereze toate numerele de 4 cifre de forma 3a2b care se divid cu 9.

public class Ex15 {
     public static void main(String[] args){

        for(int a = 0; a <= 9; a++){
            for(int b = 0; b <= 9; b++){
                int numar = 3000 + a * 100 + 20 + b;

                if(numar % 9 == 0){
                    System.out.println(numar);
                }
            }
        }
    }

}
