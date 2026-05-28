import java.util.Random;
import java.util.Date;

// Clasa pusa la dispozitie in enunt
class CoordinateGenerator {
    private Random randomGenerator;

    public CoordinateGenerator() {
        Date now = new Date();
        long sec = now.getTime();
        randomGenerator = new Random(sec);
    }

    public int generateX() {
        int x = randomGenerator.nextInt(101);
        if (x < 5) {
            x = 0;
        } else if (x > 95) {
            x = 100;
        } else {
            x = randomGenerator.nextInt(99) + 1;
        }
        return x;
    }

    public int generateY() {
        int y = randomGenerator.nextInt(101);
        if (y < 5) {
            y = 0;
        } else if (y > 95) {
            y = 50;
        } else {
            y = randomGenerator.nextInt(49) + 1;
        }
        return y;
    }
}

// Clasa principala de test
public class Main {
    public static void main(String[] args) {
        System.out.println("--- START SIMULARE MECI 1 ---");
        Joc meci1 = new Joc("Steaua", "Dinamo");
        meci1.simuleaza();

        // O scurta pauza pentru ca generatorul bazat pe timp (Date.getTime()) sa primeasca seed diferit
        try { Thread.sleep(100); } catch (InterruptedException ignored) {}

        System.out.println("\n--- START SIMULARE MECI 2 ---");
        Joc meci2 = new Joc("Real Madrid", "Barcelona");
        meci2.simuleaza();

        System.out.println("\n================ REZULTATE FINALE ================");
        System.out.println(meci1);
        System.out.println(meci2);
    }
}