import javax.swing.*;
import java.util.Scanner;

public class EingabeAusgabeMitJOptionPane {
  
  public static void main( String[] args ) {
    Scanner myScanner = new Scanner(System.in);
    /*
     =============================================================================
    System.out.println("Gewicht bitte eingeben: ");
    int gewicht1 = myScanner.nextInt();
    System.out.println("gewicht1 (Konsole): " + gewicht1);
     =============================================================================
                         Eingabe Mit JOptionPane
     =============================================================================
    */
    String gewichtAsString = JOptionPane.showInputDialog("Gewicht bitte eingeben: ");
    // String => int konvertieren
    int gewicht2 = Integer.parseInt(gewichtAsString);
    //System.out.println("gewicht2 (GUI): " + gewicht2);
    // =============================================================================
    //                     Ausgabe Mit JOptionPane
    // =============================================================================
    JOptionPane.showMessageDialog(null, gewicht2);
  }
  
}
