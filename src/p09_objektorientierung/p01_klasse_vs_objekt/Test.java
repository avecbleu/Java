package p09_objektorientierung.p01_klasse_vs_objekt;

import java.util.List;

public class Test {
    
    public static void main( String[] args ) {
        int zahl = 10;
        // ======================
        Auto auto1  = new Auto();
        auto1.hersteller = "Volkswagen";
        auto1.modell = "Golf 8";
        // ======================
        Auto auto2  = new Auto();
        auto2.hersteller = "BMW";
        auto2.modell = "520i";
        // ======================
        auto1.printInfo();
        auto2.printInfo();
        
        
    }
    

}
