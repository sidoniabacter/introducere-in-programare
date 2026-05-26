public class TestException{
 public static void main(String[] args) {
    try{
        int varsta =19;
        //varsta = 15/0;
        checkDriving(varsta);
        System.out.println("varsta se va afisa daca varsta este de 18 ani sau mai mult");
    }catch(UnderAgeException e){
        System.out.println("eroare: "+e.getMessage());
    }
    catch(ArithmeticException e){
       System.out.println("eroarea e de la impartirea la 0");
    }
    finally{
        System.out.println("Acest bloc se execuat intotdeauna");
    }
 }

 public static void checkDriving (int age) throws UnderAgeException{
    if (age<18){
        throw new UnderAgeException();
    }else{
        System.out.println("permis de conducere acordat");
    }
 }
}
