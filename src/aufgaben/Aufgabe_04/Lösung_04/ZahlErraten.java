package aufgaben.Aufgabe_04.Lösung_04;


import java.util.Random;
import java.util.Scanner;

public class ZahlErraten {
    
    public static void main( String[] args ) {
        System.out.println("==============================================================");
        System.out.println("                     Spiel: Zahl erraten");
        System.out.println("==============================================================");
        System.out.println("Eine Zahl zwischen 1 und 100 wurde generiert.");
        System.out.println("Sie sollen diese Zahl erraten");
        // ==========================================
        // Zufallszahl generieren
        // ==========================================
        Random rd = new Random();
        int zufallszahl = rd.nextInt(1, 100); // Zahl zwischen 1 und 100 generieren
        //System.out.println(zufallszahl); // Debug-Ausgabe
        // ==========================================
        int anzahlVersuche = 1;
        // ==========================================
        Scanner myScanner = new Scanner(System.in);
        while ( true ) {
            System.out.println("===============================");
            // Eingabe von Rateversuch
            System.out.println("Ihr " + anzahlVersuche + ". Versuch: ");
            int rateVersuch = myScanner.nextInt();
            // ==========================================
            // Auswertung
            // ==========================================
            if (zufallszahl == rateVersuch) {
                System.out.println("Gratulation !!! Sie haben Die Zahl erraten");
                break;
            } else if (zufallszahl > rateVersuch) {
                System.out.println("=> Größer");
            } else { // zufallszahl < rateVersuch
                System.out.println("=> Kleiner");
            }
            anzahlVersuche++;
        }
    }
}
