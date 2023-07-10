package p01_struktugramme.p03_cases;

public class Switch_Case_Anweisung {
  
  public static void main( String[] args ) {
    int wochenTag = 6; // 0..6
    String ausgabe = ""; // Zeichenkette

    //if (wochenTag == 0) {
    //  ausgabe = "Sonntag";
    //} else if (wochenTag == 1) {
    //  ausgabe = "Montag";
    //} else if (wochenTag == 2) {
    //  ausgabe = "Dienstag";
    //} else if (wochenTag == 3) {
    //  ausgabe = "Mittwoch";
    //} else if (wochenTag == 4) {
    //  ausgabe = "Donnerstag";
    //} else if (wochenTag == 5) {
    //  ausgabe = "Freitag";
    //} else if (wochenTag == 6) {
    //  ausgabe = "Samstag";
    //}
    //System.out.println(ausgabe);
    
    // Alternative mit switch
    ausgabe = switch (wochenTag) {
      case 0 -> "Sonntag";
      case 1 -> "Montag";
      case 2 -> "Dienstag";
      case 3 -> "Mittwoch";
      case 4 -> "Donnerstag";
      case 5 -> "Freitag";
      case 6 -> "Samstag";
      default -> "Ungültig";
    };
    System.out.println(ausgabe);
    
  }
}
