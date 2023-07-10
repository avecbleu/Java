package geometrie;

public class Kreis {

    // Deklaration der statischen Konstante PI
    private static final double PI = 3.14159265359;
    // Deklaration der Instanzvariablen
    private double radius;

    // Konstruktor
    public Kreis(double radius) {
        this.radius = radius;
    }

    // getter und setter
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Geometrische Methoden
    public double getUmfang() {
        return 2 * radius * PI;
    }
    public double getFlaeche() {
        return Math.pow(radius, 2) * PI;
    }
    public double getDurchmesser() {
        return 2 * radius;
    }
    public void ausgabe() {
        System.out.println("Kreis mit Radius " + radius);
    }

}
