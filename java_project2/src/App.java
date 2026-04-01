import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
      Produs p1 = new Produs("branza", 12, 5);
      System.out.println(p1);
      System.out.println(p1.calculeazaPret());
      System.out.println(p1.calculeazaPret(7));

      Comanda c1 = new Comanda();
      c1.setNrComanda("1");
     Comanda.setNrProduse();
     List<Produs> list1 = new ArrayList<>();
     list1.add(p1);
     c1.setProduse(list1);
     System.out.println(c1);
     c1.getProduseInfo();
    }
    
}
