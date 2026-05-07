public class Tren {

    private Vagon[] vagoane;
    private int nrVagoane;

    public Tren() {
        vagoane = new Vagon[15];
        nrVagoane = 0;
    }

    public void adaugaVagon(Vagon v) {
        if (nrVagoane < 15) {
            vagoane[nrVagoane++] = v;
        }
    }

    public int totalColete() {
        int sum = 0;
        for (int i = 0; i < nrVagoane; i++) {
            sum += vagoane[i].getCapacitateColete();
        }
        return sum;
    }

   @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Tren t = (Tren) obj;

        return this.totalColete() == t.totalColete();
    }

    @Override
    public String toString() {
        String output = "Vagoane:\n";

        for (int i = 0; i < nrVagoane; i++) {
            output += vagoane[i].getTip() + "\n";
        }

        output += "Total colete: " + totalColete();

        return output;
    }
}

