import java.util.Scanner;

// prozedurale_oo_programmierung.t01_refresh_grundlagen.p01_struktugramme.p05_aufgabe_bmi.BMIRechner
public class BMIRechner {
  // psvm + tab
  public static void main( String[] args ) {
    //       Scanner =>
    //       while ( true ) {
    //          bisherigen Code hier plazieren
    //       }
    //       myScanner.close();
    Scanner myScanner = new Scanner(System.in); // Scanner-Objekt erstellen
    
    while(true) { // Endlos-Schleife
      // ====================================================
      // Gewicht eingeben
      // ====================================================
      // Information   [sout + tab]
      System.out.println("Gewicht in kg bitte eingeben: (0 für Beenden)");
      int gewicht = myScanner.nextInt();          // Eingabe von einer Ganzzahl
      if (gewicht == 0)
        break;
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
      //              Fallunterscheidungc (Teil A)
      // ====================================================
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
      System.out.println("Diagnose: " + ausgabe);
  
    }
    
    
    
    
  
  
  
  
  
    // ====================================================
    // Resourcen freigeben
    // ====================================================
    myScanner.close();
  }
}
