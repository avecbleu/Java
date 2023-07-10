package p04_prozedural_vs_objektorientiert;

public class S02_Objektorientiert {
    
    public static void main( String[] args ) {
        objektorientiert();
    }
    
    private static void objektorientiert() {
        Rechteck re1 = new Rechteck(6,2);
        Rechteck re2 = new Rechteck(7,3);
        Rechteck re3 = new Rechteck(14,5);
        re1.flächeBerechnen();
        re2.flächeBerechnen();
        re3.flächeBerechnen();
        System.out.println("Länge von re1: " + re1.länge);
    }
}
// ========================================================
class Rechteck {
    int länge;
    int breite;
    //                   6       2
    public Rechteck( int l, int b ) {
        länge = l;
        breite = b;
    }
    
    public void flächeBerechnen() {
      int fläche = länge * breite;
        System.out.println("Berechnete Fläche: " + fläche);
    }
}
// ========================================================
