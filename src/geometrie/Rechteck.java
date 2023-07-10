package geometrie;

public class Rechteck {
    // Deklaration der Instanzvariablen
    private int breite;
    private int hoehe;

    // Konstruktor mit Parametern
    public Rechteck(int breite, int hoehe) {
        setBreite(breite);
        setHoehe(hoehe);
    }

    // getter und setter-Methoden
    public int getBreite() {
        return breite;
    }
    public void setBreite(int breite) {
        if (breite <= 0) {
            throw new RuntimeException("Breite muss positiv sein: " + breite);
        }
        this.breite = breite;
    }
    public int getHoehe() {
        return hoehe;
    }
    public void setHoehe(int hoehe) {
        if (hoehe <= 0) {
            throw new RuntimeException("Höhe muss positiv sein: " + hoehe);
        }
        this.hoehe = hoehe;
    }

    // geometrischen Methoden aus dem Klassendiagramm
    public int getUmfang() {
        return 2 * (breite + hoehe);
    }
    public int getFlaeche() {
        return breite * hoehe;
    }
    public double getDiagonale() {
        // Wurzel aus breite zum Quadrat plus höhe zum Quadrat
        // return Math.sqrt(breite * breite + hoehe * hoehe);
        return Math.sqrt(Math.pow(breite, 2) + Math.pow(hoehe, 2));
    }
    public boolean isQuadrat() {
        // Ausführlich
        // if (breite == hoehe) {
        //    return true;
        // }
        // return false;
        // Kürzer
        return breite == hoehe;
    }
    public void ausgabe() {
        System.out.println("Rechteck: Breite: " + breite + " LE, Höhe: " + hoehe + " LE");
    }

}


















