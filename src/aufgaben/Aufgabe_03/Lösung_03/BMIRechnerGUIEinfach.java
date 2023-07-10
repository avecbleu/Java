package aufgaben.Aufgabe_03.Lösung_03;

import javax.swing.*;

public class BMIRechnerGUIEinfach {
    
    public static void main( String[] args ) {
        while ( true ) {
            // ====================================================
            String gewichtInput = JOptionPane.showInputDialog("Gewicht in kg bitte eingeben: (0 für Beenden)");
            int gewicht = Integer.parseInt(gewichtInput);
            // ====================================================
            if ( gewicht == 0 )
                break;
            // ====================================================
            String größeInput = JOptionPane.showInputDialog("Körpergröße in cm bitte eingeben:");
            int größe = Integer.parseInt(größeInput);
            // ====================================================
            double bmi = gewicht * 10000.0 / (größe * größe); // (* 10000.0) => erzwingt die Berechnung in double
            // ====================================================
            String ausgabe = "Body-Mass-Index: " + bmi + "\n"; // \n Zeilenumbruch
            ausgabe += "Diagnose: ";
            // ====================================================
            if (bmi >= 40) {
                ausgabe += "Adipositas III";
            } else if (bmi >= 35) {  // 35 <= bmi < 40
                ausgabe += "Adipositas II";
            } else if (bmi >= 30) {  // 30 <= bmi < 35
                ausgabe += "Adipositas I";
            } else if (bmi >= 25) { // 25 <= bmi < 30
                ausgabe += "Übergewicht";
            } else if (bmi >= 20) {  // 20 <= bmi < 25
                ausgabe += "Normalgewicht";
            } else {                // bmi < 20
                ausgabe += "Untergewicht";
            }
            // ====================================================
            JOptionPane.showMessageDialog(null, ausgabe);
        } // Ende while-Schleife
        // ====================================================
    }
    
}
