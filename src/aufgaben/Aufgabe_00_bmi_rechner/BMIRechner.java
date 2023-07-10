package aufgaben.Aufgabe_00_bmi_rechner;

import java.util.Scanner;

public class BMIRechner {
    
    // [psvm + tab]
    public static void main( String[] args ) {
        Scanner myScanner = new Scanner(System.in); // Scanner-Objekt erstellen
        // ====================================================
        // Gewicht eingeben
        // ====================================================
        // Information   [sout + tab]
        System.out.println("Gewicht in kg bitte eingeben:");
        int gewicht = myScanner.nextInt(); // Eingabe von einer Ganzzahl
        System.out.println("Ihr Gewicht: " + gewicht); // Für Testzwecke
        // ====================================================
        // Körpergröße in cm eingeben
        // ====================================================
        System.out.println("Körpergröße in cm bitte eingeben:"); // Information
        int größe = myScanner.nextInt();  // // Eingabe von einer Ganzzahl
        System.out.println("Körpergröße: " + größe); // Für Testzwecke
        // ====================================================
        // BMI berechnen: BMI = Körpergewicht in kg : (Körpergröße in cm)²
        // ====================================================
        // byte -> short -> int -> long -> float -> double
        double bmi = gewicht * 10000.0 / (größe * größe); // (* 10000.0) => erzwingt die Berechnung in double
        // ====================================================
        // BMI Ausgeben
        // ====================================================
        System.out.println("Body-Mass-Index: " + bmi);
        // ====================================================
        myScanner.close(); // Resourcen freigeben
    }
    
}
