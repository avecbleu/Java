package p09_objektorientierung.p02_getter_setter.motivation;

public class Bankkonto {
    private double kontostand;
    
    public void einzahlen( double betrag ) {
        // Prüfung, ob erlaubt oder nicht
        kontostand = kontostand + betrag;
    }

    public void abbuchen( double betrag ) {
        // Prüfung, ob erlaubt oder nicht
        kontostand = kontostand - betrag;
    
    }
}
