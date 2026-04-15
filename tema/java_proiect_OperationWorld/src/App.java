import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {

        String[][] countries = {
                {"Albania", "2772000", "0.5"},
                {"Andorra", "83000", "0.4"},
                {"Austria", "9114000", "0.5"}
        };

        try {
            File file = new File("C:/Users/HP/Desktop/introducere in programare/tema/output.csv");

            System.out.println("Writing to: " + file.getAbsolutePath());

            FileWriter writer = new FileWriter(file);

            writer.write("sep=;\n");
            writer.write("Country;Population;% Evangelical\n");

            for (String[] c : countries) {
                writer.write(c[0] + ";" + c[1] + ";" + c[2] + "\n");
            }

            writer.close();

            System.out.println("CSV created successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}