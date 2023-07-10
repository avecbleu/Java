package aufgaben;

import java.util.Random;
import java.util.Scanner;

public class EingabeMitScanner {
    
    public static void main( String[] args ) {
        Scanner myScanner = new Scanner(System.in);
        // =============================================================================
        int zahl = myScanner.nextInt(); // Ganzahl
        double note = myScanner.nextDouble(); // Fließkommazahl
        boolean offen = myScanner.nextBoolean(); // true/false
        String name = myScanner.nextLine(); // Zeichenkette (String)
        // =============================================================================
        Random rd = new Random();
        int generatedNummber = rd.nextInt(1, 100);
        // =============================================================================
        
    }
    
}
