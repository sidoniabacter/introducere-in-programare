import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
         Record record1 = new Record("Marius", 134, "mate" );
         Record record2 = new Record("Maria", 13, "mate" );
         Record record3 = new Record("Mihai", 140, "mate" );
        LinkedList <Record> lista = new LinkedList<>();
         lista.addFirst(record1);
         lista.add(record2);
         lista.addLast(record3);
         System.out.println(lista);
    }
}
