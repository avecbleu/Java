package p01_struktugramme.p04_schleifen.p02_while_dowhile;

public class WhileDoWhile {
  
  public static void main( String[] args ) {
    System.out.println("=================");
    whileTest();
    doWhileTest();
    System.out.println("=================");
  }
  
  private static void whileTest() {
    int a = 10;         // a deklarieren und den Wert 10 zuweisen
    while ( a < 100 ) { // solange a kleiner 100
      System.out.println(a);
      a = a + 10;       // a + 10 berechnen und Ergebnis zu a zuweisen
    }
  }
  
  private static void doWhileTest() {
    //do {
    //
    //} while ( bedingung );
    int a = 200;
    do {
      System.out.println(a);
      a = a + 10; // <=> a += 10;
    } while (a < 100);
  }
  
  
}
