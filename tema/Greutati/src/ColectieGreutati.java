public class ColectieGreutati {

    private Greutate[] greutati;
    private int nr;
    private int capacitateMaxima;

    public ColectieGreutati(int capacitateMaxima) {
        this.capacitateMaxima = capacitateMaxima;
        this.greutati = new Greutate[capacitateMaxima];
        this.nr = 0;
    }

    
    public void adauga(Greutate g) {
        if (nr < capacitateMaxima) {
            greutati[nr++] = g;
        }
    }

    
    public double medie() {
        if (nr == 0) return 0;

        double suma = 0;

        for (int i = 0; i < nr; i++) {
            suma += greutati[i].capacitate();
        }

        return suma / nr;
    }

    
    public int total() {
        int sum = 0;

        for (int i = 0; i < nr; i++) {
            sum += greutati[i].capacitate();
        }

        return sum;
    }

     
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        ColectieGreutati c = (ColectieGreutati) obj;

        return this.total() == c.total();
    }

    
    @Override
    public String toString() {
        String output = "ColectieGreutati:\n";

        for (int i = 0; i < nr; i++) {
            output += greutati[i] + "\n";
        }

        output += "Media: " + medie();

        return output;
    }
}