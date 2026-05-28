class Joc {
    private String echipa1;
    private String echipa2;
    private int goluriEchipa1;
    private int goluriEchipa2;
    private int totalOuturi;
    private int totalCornere;

    public Joc(String echipa1, String echipa2) {
        this.echipa1 = echipa1;
        this.echipa2 = echipa2;
        this.goluriEchipa1 = 0;
        this.goluriEchipa2 = 0;
        this.totalOuturi = 0;
        this.totalCornere = 0;
    }

    public void simuleaza() {
        // Mingea initiala se pune la centrul terenului
        Minge minge = new Minge(50, 25);

        for (int i = 1; i <= 1000; i++) {
            try {
                minge.suteaza();
                // Afisam pozitia pentru un sut normal (fara evenimente)
                System.out.println(echipa1 + " - " + echipa2 + " : Mingea se afla la coordonatele (" + minge.getX() + "," + minge.getY() + ")");
            } catch (GolException e) {
                // Afișăm mai întâi poziția la care a ajuns mingea (unde s-a produs golul)
                System.out.println(echipa1 + " - " + echipa2 + " : Mingea se afla la coordonatele (" + minge.getX() + "," + minge.getY() + ")");
                System.out.println("[EVENIMENT] " + e.getMessage());
                
                // Determinam cine a marcat (daca X=0 a marcat echipa 2, daca X=100 a marcat echipa 1)
                if (minge.getX() == 0) {
                    goluriEchipa2++;
                } else {
                    goluriEchipa1++;
                }
                
                // Regula: mingea revine la centru
                minge = new Minge(50, 25);
            } catch (OutException e) {
                // Afișăm poziția la care s-a dus în out
                System.out.println(echipa1 + " - " + echipa2 + " : Mingea se afla la coordonatele (" + minge.getX() + "," + minge.getY() + ")");
                System.out.println("[EVENIMENT] " + e.getMessage());
                totalOuturi++;
                
                // Regula: minge noua plasata in aceeasi pozitie
                minge = new Minge(minge.getX(), minge.getY());
            } catch (CornerException e) {
                // Afișăm poziția de la care s-a acordat corner
                System.out.println(echipa1 + " - " + echipa2 + " : Mingea se afla la coordonatele (" + minge.getX() + "," + minge.getY() + ")");
                System.out.println("[EVENIMENT] " + e.getMessage());
                totalCornere++;
                
                // Regula: plasare in coltul corespunzator
                int coltX = minge.getX(); // va fi 0 sau 100
                int coltY = (minge.getY() < 20) ? 0 : 50; 
                minge = new Minge(coltX, coltY);
            }
        }
    }

    @Override
    public String toString() {
        return "Meci: " + echipa1 + " vs " + echipa2 + "\n" +
               "Scor final: " + goluriEchipa1 + " - " + goluriEchipa2 + "\n" +
               "Statistici: Cornere: " + totalCornere + " | Out-uri: " + totalOuturi + "\n" +
               "---------------------------------------------";
    }
}