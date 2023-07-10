package aufgaben;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class EingabeAusgabeMitJOptionPane {
  
  public static void main( String[] args ) {
    // =============================================================================
    //                     Eingabe Mit JOptionPane
    // =============================================================================
    String gewichtAsString = JOptionPane.showInputDialog("Gewicht bitte eingeben: ");
    // String => int konvertieren
    int gewicht = Integer.parseInt(gewichtAsString);
    // =============================================================================
    //                     Ausgabe Mit JOptionPane
    // =============================================================================
    JOptionPane.showMessageDialog(null, gewicht);
    // =============================================================================
    Random rd = new Random();
    int generatedNummber = rd.nextInt(1, 100);
  }
  
}
