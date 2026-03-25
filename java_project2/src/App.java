public class App {
    public static void main(String[] args) throws Exception {
      Produs p1 = new Produs("branza", 12, 5);
      System.out.println(p1);
      System.out.println(p1.calculeazaPret());
      System.out.println(p1.calculeazaPret(7));

    }
    
}
