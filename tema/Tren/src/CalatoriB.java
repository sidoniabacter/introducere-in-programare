public class CalatoriB extends Vagon {

    public int getCapacitatePasageri() {
        return 50;
    }

    public int getCapacitateColete() {
        return 400;
    }

    public String getTip() {
        return "CalatoriB";
    }

    public void deschideUsi() {
        System.out.println("Usile s-au deschis");
    }

    public void inchideUsi() {
        System.out.println("Usile s-au inchis");
    }

    public void blocheazaGeamuri() {
        System.out.println("Geamurile s-au blocat");
    }
}

