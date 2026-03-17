import java.util.Scanner;

public class Student {
    private final String university = "Emanuel University of Oradea";
    private static int nrOfEnrolledStudents = 0;
    private String name;
    private  int yearOfStudies = 1;

public Student(String name, int yearOfStudies){
    this.name = name;
    this.yearOfStudies = yearOfStudies;
    nrOfEnrolledStudents++;
}

public Student(String name){
    this(name, 1);
}

public String toString(){
    return "Student: "+name+"{"+yearOfStudies+"}";
}


     public static void main(String[] args) throws Exception {
        Student student = new Student("Teo");
        System.out.println("Hello, "+student);

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
