public class App {
    public static void main(String[] args) throws Exception {
        Elev elev = new Elev("Popa", "Marcel",  15,  7);
        String info = elev.getInfo();
        System.out.println(info);

    }
}
