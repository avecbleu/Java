package p06_wiederverwendbarkeit.anwendung;

public class ReverseString {
    
    public static void main( String[] args ) {
        // ============================================================
        // String str = "Hallo";
        // str.charAt(0) => 'H';  str.length() => 4 (Länge des Strings)
        // + Operator ist mit Strings anwendbar
        // ============================================================
        // ============================================================
        // Methode erstellen, die aus einem String den Reverse-String zurückgibt
        // ============================================================
        String str = "Schönes Wochenende";
        System.out.println(str);
        System.out.println(reverse(str));
     }
    /* Algorithmus
        // Output String deklarieren
        // Wiederhole von hinten nach vorne
            // Zeichen auslesen und zum Output addieren
        // Wiederhole-Ende
        // Output zurückgeben
     */
    public static String reverse(String input) {
        String output = ""; // "" Leere Zeichenkette
        int len = input.length(); // String-Länge
        for( int i = len - 1 ; i >= 0 ; i--) { // vom letztem zum ersten Zeichen iterieren
            char myChar = input.charAt(i); // Zeichen am Index i
            output = output + myChar;   // Hallo
        }
        return output;
    }
}
