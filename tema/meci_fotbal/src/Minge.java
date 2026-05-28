class Minge {
    private int x;
    private int y;
    private static CoordinateGenerator generator = new CoordinateGenerator();

    public Minge(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void suteaza() throws OutException, GolException, CornerException {
        this.x = generator.generateX();
        this.y = generator.generateY();

        // 1. Verificare OUT: Y=0 sau Y=50
        if (this.y == 0 || this.y == 50) {
            throw new OutException("Mingea a iesit in out la pozitia (" + this.x + ", " + this.y + ").");
        }

        // 2. Verificare GOL: X=0 sau X=100 și Y este între 20 și 30 inclusiv
        if ((this.x == 0 || this.x == 100) && (this.y >= 20 && this.y <= 30)) {
            throw new GolException("GOL! Mingea a intrat in poarta la pozitia (" + this.x + ", " + this.y + ").");
        }

        // 3. Verificare CORNER: X=0 sau X=100, dar nu e gol (si nici out, conform conditiei anterioare)
        if (this.x == 0 || this.x == 100) {
            throw new CornerException("Corner de la pozitia (" + this.x + ", " + this.y + ").");
        }
    }
}
