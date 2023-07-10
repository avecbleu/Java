package aufgaben.Aufgabe_05.Lösung_05;


import java.util.Scanner;

public class ZahlErratenUmgekehrt {
    
    public static void main( String[] args ) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("==============================================================");
        System.out.println("                     Spiel: Zahl erraten aber anders");
        System.out.println("==============================================================");
        System.out.println("Sie wählen eine Zahl zwischen 1 und 100.");
        System.out.println("Und ich Computer, werde diese Zahl erraten.");
        System.out.println("Drücken Sie auf <ENTER> um loszulegen ...");
        myScanner.nextLine();
        // ==========================================
        int anzahlVersuche = 1;
        // ==========================================
        int rateVersuch = 50;
        int from= 1;
        int to = 100;
        String auswertung ="";
        while ( true ) {
            System.out.println("===============================");
            // Rateversuch vom Computer
            rateVersuch = from + (to - from + 1) / 2; // Hälfte des möglichen Intervalls [from,to]
            if (to == 2 && auswertung.equals("k")) // Kleine Justierung wegen 1
                rateVersuch = 1;
            System.out.println("Mein Rateversuch: " + rateVersuch);
            System.out.println("Ist Ihre Zahl (g)rößer, (k)leiner, oder e(r)raten?");
            // ==========================================
            // Auswertung durch Benutzereingabe
            // ==========================================
            auswertung = myScanner.nextLine().toLowerCase();
            if (auswertung.equals("g")) {
                from = rateVersuch;
            } else if (auswertung.equals("k")) {
                to = rateVersuch;
            } else {
                System.out.println("OK ich habe die Zahl nach " + anzahlVersuche + " Versuchen  erraten ");
                break;
            }
            System.out.format("(%d, %d)%n ",from, to);
            anzahlVersuche++;
        }
    }
}
