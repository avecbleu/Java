package aufgaben.Aufgabe_02.Lösung_02;

import java.util.Scanner;

public class BMIRechnerTeilB {
    
    public static void main( String[] args ) {
        //       Scanner =>
        //       while ( true ) {
        //          bisherigen Code hier plazieren
        //       }
        //       myScanner.close();
        Scanner myScanner = new Scanner(System.in); // Scanner-Objekt erstellen
        // Teil B: Wiederholung der Ausführung bis Eingabe von 0 bei Gewicht
        while ( true ) { // Start while-Schleife
            // ====================================================
            System.out.println("Gewicht in kg bitte eingeben: (0 für Beenden)");
            int gewicht = myScanner.nextInt();          // Eingabe von einer Ganzzahl
            if (gewicht == 0) break;
            // ====================================================
            System.out.println("Körpergröße in cm bitte eingeben:"); // Information
            int größe = myScanner.nextInt();  // // Eingabe von einer Ganzzahl
            // ====================================================
            double bmi = gewicht * 10000.0 / (größe * größe); // (* 10000.0) => erzwingt die Berechnung in double
            // ====================================================
            System.out.println("Body-Mass-Index: " + bmi);
            // ====================================================
            String ausgabe;
            if (bmi >= 40) {
                ausgabe = "Adipositas III";
            } else if (bmi >= 35) {  // 35 <= bmi < 40
                ausgabe = "Adipositas II";
            } else if (bmi >= 30) {  // 30 <= bmi < 35
                ausgabe = "Adipositas I";
            } else if (bmi >= 25) { // 25 <= bmi < 30
                ausgabe = "Übergewicht";
            } else if (bmi >= 20) {  // 20 <= bmi < 25
                ausgabe = "Normalgewicht";
            } else {                // bmi < 20
                ausgabe = "Untergewicht";
            }
            // ====================================================
            System.out.println("Diagnose: " + ausgabe);
            
        } // Ende while-Schleife
        // ====================================================
        myScanner.close(); // Resourcen freigeben
    }
    
}
