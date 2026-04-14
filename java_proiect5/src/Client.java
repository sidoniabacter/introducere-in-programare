public class Client {
public static void main(String[] args) {
    Facultate facultate = new Facultate("informatica", 3);
    Persoana student = new Student("Ion Popescu", "Strada mare", facultate, 1);

    if(student instanceof Student){
        System.out.println("persoana este student");
    }else{
        System.out.println("persoana este profesor");
    }
    System.out.println((Student)student);
}
    
}
