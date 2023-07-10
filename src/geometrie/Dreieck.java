package geometrie;

public class Dreieck {
    // Deklaration der Instanzvariablen
    private int a;
    private int b;
    private int c;

    // Konstruktor mit setter-Methoden anstatt direkten Zuweisung
    public Dreieck(int a, int b, int c) {
        checkDreieck(a,b,c);
        setA(a);
        setB(b);
        setC(c);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        checkSeitenlaenge(a);
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        checkSeitenlaenge(b);
        this.b = b;
    }
    public int getC() {
        return c;
    }
    public void setC(int c) {
        checkSeitenlaenge(c);
        this.c = c;
    }
    // Seitenlänge darf nicht negativ sein
    private void checkSeitenlaenge(int s) {
        if (s <= 0) {
            throw new RuntimeException("Seitenlänge muss positiv sein: " + s);
        }
    }
    // Ergeben die drei Seiten überhaupt ein Dreieck?
    private void checkDreieck(int a, int b, int c) {
        // if (!(a + b > c && a + c > b && b + c > a)) {
        if (a + b <= c || a + c <= b || b + c <= a) {
                throw new RuntimeException("Seitenlängen ergeben kein Dreieck: " + a + ", " + b + ", " + c);
        }
    }

    // Umfang des Dreiecks
    public int getUmfang() {
        return a + b + c;
    }
    // Fläche des Dreiecks
    public double getFlaeche() {
        double s = getUmfang() / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    // Ist Dreieck gleichseitig?
    public boolean isGleichseitig() {
        return a == b && a == c && b == c;
    }
    // Ist Dreieck gleichschenklig?
    public boolean isGleichschenklig() {
        return a == b || a == c || b == c;
    }
    // Ist Dreieck rechtwinklig?
    public boolean isRechtwinklig() {
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) ||  Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)
                ||  Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2);
    }

    // Ausgabe des Dreiecks
    public void ausgabe() {
        System.out.println("Dreieck mit Seitenlängen a = " + a + ", b = " + b + ", c = " + c);
    }
}
