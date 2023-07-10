package aufgaben.Aufgabe_07.Lösung_07;

public class Palindrome {

  public static void main(String[] args) {
    //String input = "Egale Lage";
    //String input = "Hallo";
    String input = "Die Liebe ist Sieger; stets rege ist sie bei Leid";
    // ===============================================================
    boolean erg = isPalindrom1(input);
    //boolean erg = isPalindrom2(input);
    //boolean erg = isPalindrom3(input);
    if (erg)
      System.out.println("Es ist ein Palindrom");
    else
      System.out.println("Es ist kein Palindrom");
  }
  
  private static boolean isPalindrom1( String input ) {
    String forward = "";
    String reverse = "";
    input = input.toLowerCase();
    for( int i = 0; i < input.length(); i++ ) {
      char myChar = input.charAt(i);
      boolean istBuchstabe = (myChar >= 'a' && myChar <= 'z')
                        || myChar == 'ä' || myChar == 'ö'
                        || myChar == 'ü' || myChar == 'ß';
      if ( istBuchstabe ) {
        forward = forward + myChar;
        reverse = myChar + reverse;
      }
    }
    System.out.println("forward: " + forward);
    System.out.println("reverse: " + reverse);
    return forward.equals(reverse);
  }
  
  private static boolean isPalindrom2( String input) {
    String forward = input.toLowerCase().replaceAll("[^a-zäöüß]", "");
    String reverse = new StringBuilder(forward).reverse().toString();
    System.out.println("forward: " + forward);
    System.out.println("reverse: " + reverse);
    return forward.equals(reverse);
  }
  
  
  public static boolean isPalindrom3( String input) {
    input = input.toLowerCase().replaceAll("[^a-zäüöß]", ""); // Entfernt alle Nicht-Buchstaben
    final int len = input.length();
    for( int i = 0 ; i < len / 2 ; i++ ) {       // Array bis zur Mitte durchlaufen
      if ( input.charAt(i) != input.charAt((len - 1) - i) ) { // beide Seiten vergleichen
        return false;   // sobald ein Zeichen unterschiedlich ist, kein Palindrom
      }
    }
    return true;
  }
}


