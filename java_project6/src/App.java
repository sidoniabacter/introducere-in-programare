public class App {
    public static void main(String[] args) throws Exception {
        Pasare pinguin = new Pasare("Pinguin", 2, 1, "M", false, false);
        Pasare cioara = new Pasare("Cioara", 2, 2, "F", true, true);
        Domestic cal = new Domestic("Cal", 4, 7, "M", false, "Poiata");
        
        System.out.println(pinguin);
        System.out.println(pinguin.metodaDeplasare());
        System.out.println(cioara);
        System.out.println(cioara.metodaDeplasare());
        System.out.println(cal);
        System.out.println(cal.metodaDeplasare());

        
    }
}
