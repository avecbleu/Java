import javax.swing.*;

public class BMIRechnermitjoptionPane {
    public static void main( String[] args ) {
        String gewichtAsString = JOptionPane.showInputDialog("Gewicht bitte eingeben: ");
        int gewicht = Integer.parseInt(gewichtAsString);
        JOptionPane.showMessageDialog(null, gewicht);

        String größeAsString = JOptionPane.showInputDialog("Größe bitte eingeben: ");
        int größe = Integer.parseInt(größeAsString);
        JOptionPane.showMessageDialog(null, größe);

        double bmi = gewicht * 10000.0 / (größe * größe); // (* 10000.0) => erzwingt die Berechnung in double

        String ausgabe;
        if (bmi >= 40) {
            ausgabe = "Adipositas III";
        } else if (bmi >= 35) {  // 35 <= bmi < 40
            ausgabe = "Adipositas II";
        } else if (bmi >= 30) {  // 30 <= bmi < 35
            ausgabe = "Adipositas I";
        }  else if (bmi >= 25) { // 25 <= bmi < 30
            ausgabe = "Übergewicht";
        } else if (bmi >= 20) {  // 20 <= bmi < 25
            ausgabe = "Normalgewicht";
        } else  {                // bmi < 20
            ausgabe = "Untergewicht";
        }
        System.out.println("Diagnose (GUI): " + ausgabe);
        
    }
}
