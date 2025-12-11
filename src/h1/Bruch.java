package h1;

public class Bruch {
    private int zaehler;
    private int nenner;

    public Bruch(int zaehler, int nenner) {
        if (nenner == 0) {
            throw new IllegalArgumentException("Nenner darf nicht 0 sein.");
        }
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    private int ggT(int x, int y) {
        int gZahl = 0;
        int kZahl = 0;
        if (x > y) {
            gZahl = x;
            kZahl = y;
        }
        if (x < y) {
            gZahl = y;
            kZahl = x;
        }
        if (x == y) {
            gZahl = x;
            kZahl = y;
        }
        if (kZahl == 0) {
            return gZahl;
        }

        int rest = 1;
        while (rest > 0) {
            rest = gZahl % kZahl;
            gZahl = kZahl;
            kZahl = rest;
        }
        rest = gZahl;
        return rest;
    }

    public void shorten() {
        int teiler = ggT(this.zaehler, this.nenner);
        this.zaehler /= teiler;
        this.nenner /= teiler;
    }

    public boolean hasSameValueAs(Bruch b) {
        return this.zaehler * b.nenner == this.nenner * b.zaehler;
    }

    public int getZaehler() {
        return zaehler;
    }

    public int getNenner() {
        return nenner;
    }
}
