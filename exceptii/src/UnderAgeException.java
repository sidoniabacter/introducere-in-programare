public class UnderAgeException extends Exception{

    public UnderAgeException(){
        super( "varsta pentru conducere este de 18 ani");
    }
    public UnderAgeException(String message){
        super(message);
    }

}
