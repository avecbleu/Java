package p08_fehlerkorrektur.p01_log_ausgaben;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

import java.util.Scanner;

public class BMIRechner_Mit_Log4j {
    
    static Logger logger = LogManager.getLogger(BMIRechner_Mit_Log4j.class);
    
    public static void main( String[] args ) {
        Configurator.setAllLevels(logger.getName(),Level.ALL);
        logger.trace("Trace");
        logger.debug("Debug");
        logger.info("Info");
        logger.warn("Warning");
        logger.error("Error");
        logger.fatal("Fatal");
        int a = 10, b = 20;
        logger.info("a: {}, b:{}", a, b);
        // =============================================================================
        Scanner myScanner = new Scanner(System.in); // Scanner-Objekt erstellen
        // ====================================================
        // Gewicht eingeben
        // ====================================================
        // Information   [sout + tab]
        System.out.println("Gewicht in kg bitte eingeben:");
        int gewicht = myScanner.nextInt(); // Eingabe von einer Ganzzahl
        logger.trace("Gewicht: {}", gewicht);
        // ====================================================
        // Körpergröße in cm eingeben
        // ====================================================
        System.out.println("Körpergröße in cm bitte eingeben:"); // Information
        int größe = myScanner.nextInt();  // // Eingabe von einer Ganzzahl
        logger.trace("Körpergröße: {}", größe);
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