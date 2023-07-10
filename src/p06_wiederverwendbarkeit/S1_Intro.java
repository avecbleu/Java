package p06_wiederverwendbarkeit;

public class S1_Intro {
    
    public static void main( String[] args ) {
        mitWiederholung();
        ohneWiderholung(); // Wiederverwendbarkeit
    }
    
    private static void mitWiederholung() {
        System.out.println("==========================");
        System.out.println("         Grundlagen");
        System.out.println("         Positionen");
        System.out.println("==========================");
        System.out.println(".\n.\n.");
        
        System.out.println("==========================");
        System.out.println("         Variablen");
        System.out.println("         Deklaration");
        System.out.println("==========================");
        System.out.println(".\n.\n.");

        System.out.println("==========================");
        System.out.println("         Klassen");
        System.out.println("         Syntax");
        System.out.println("==========================");
        System.out.println(".\n.\n.");
    }
    
    private static void ohneWiderholung() {
        printTitle("Grundlagen");
        System.out.println(".\n.\n.");
        
        printTitle("Variablen");
        System.out.println(".\n.\n.");
        
        printTitle("Klassen");
        System.out.println(".\n.\n.");
    }
    
    public static void printTitle(String title) {
        System.out.println("==========================");
        System.out.println("         " + title);
        System.out.println("==========================");
    }
}
