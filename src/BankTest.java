package Hensel.Code.comcave;

import Hensel.Code.bank.Sparobjekt;

public class BankTest {

    public static void main(String[] args) {
        // Berechnung des Endkapitals
        Sparobjekt spar = new Sparobjekt(1000,5,5);
        System.out.println("Endkapital = " + spar.berechneEndkapital()); // 1276,28
        System.out.printf("Endkapital = %.2f €%n", spar.berechneEndkapital());
        spar.zeigeEntwicklung();
        System.out.println("****************");
        spar = new Sparobjekt(1000,5,10, false);
        System.out.println("Endkapital = " + spar.berechneEndkapital()); // 1628,89
        System.out.printf("Endkapital = %.2f €%n", spar.berechneEndkapital());
        spar.zeigeEntwicklung();
        // Berechnung der Laufzeit
        spar = new Sparobjekt(1000, 5, 2000, true);
        System.out.println("Laufzeit = " + spar.berechneLaufzeit()); // 14,21
        System.out.printf("Laufzeit = %.2f", spar.berechneLaufzeit()); // 14,21

    }
}
