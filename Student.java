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

public static void setYearOfStudies(Student student, int yearOfStudies){
    student.yearOfStudies = yearOfStudies;
}

public static boolean parameterManagement(int value){
    value=10;
    System.out.println("value inside method "+value);
    return true;
}

public boolean equals(Student student){
    return this.name.equals(student.name) && this.yearOfStudies ==student.yearOfStudies;
}

     public static void main(String[] args) throws Exception {
        Student s1=new Student("John");
        Student s2=new Student("John");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        // System.out.println(s1);
        // setYearOfStudies(s1,3);
        // System.out.println(s1);
        // int value =5;
        // System.out.println("Value before method call "+value);
        // parameterManagement(value);
        // System.out.println("Value after method call "+value);
        // System.out.println(parameterManagement(value));
        // Student student = new Student("Teo");
        // System.out.println("Hello, "+student);

// // suma a n numere naturale
// Scanner scan =new Scanner(System.in);
// int n=scan.nextInt();
//  int suma = 0;
//      for(int i=0;i<=n;i++){
//         suma=suma +i;
//      }
//      System.out.println("suma primelor "+n+" numere este "+suma);
   
}
}