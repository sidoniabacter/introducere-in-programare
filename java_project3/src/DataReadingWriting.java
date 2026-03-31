
import java.io.*;

public class DataReadingWriting {
     public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br= new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\introducere in programare\\input.txt.txt"));
            bw= new BufferedWriter(new FileWriter("C:\\Users\\HP\\Desktop\\introducere in programare\\output.txt.txt"));

            String line;
            while((line = br.readLine())!=null){
                bw.write(line);
                bw.newLine();
                System.out.println(line);
            }
            br.close();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
}
}

