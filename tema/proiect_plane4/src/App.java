public class App {
    public static void main(String[] args) {

        Plane p1 = new Boeing("B1", 5000, 200);
        Plane p2 = new Concorde("C1", 7000, 100);
        Plane p3 = new Mig("M1", 3000);
        Plane p4 = new TomCat("T1", 3500);

        p1.takeOff();
        p2.fly();
        p3.land();

        // downcasting pentru metode specifice
        ((Concorde)p2).goSuperSonic();
        ((Mig)p3).highSpeedGeometry();
        ((TomCat)p4).refuel();
    

    }
}
