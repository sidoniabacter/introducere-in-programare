public class Main {
   
    public static void main(String[] args) {

        Tren t1 = new Tren();
        
        t1.adaugaVagon(new Marfa());

        Tren t2 = new Tren();
        t2.adaugaVagon(new CalatoriB());

        System.out.println("Vagoanele sunt egale ?  " + t1.equals(t2));

        System.out.println("\nTren 1:");
        System.out.println(t1);

        System.out.println("\nTren 2:");
        System.out.println(t2);
    }
}
