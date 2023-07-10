package p01_struktugramme.p04_schleifen.p01_for_schleife;

import java.util.List;

public class ForSchleife {
  
  public static void main( String[] args ) {
    //standardForSchleife();
    erweiterteForSchleife(); // foreach
  }
  
  public static void erweiterteForSchleife() {
    List<String> namensListe = List.of("Conrad", "Gustav", "Zeppelin", "Heinrich");
    
    for( String name : namensListe ) {
      System.out.println(name);  // sout + tab
    }
  
    for (int  zahl: List.of(23, 12, 78) ) { // 23, 12, 78
      System.out.println(zahl);
      //System.out.println("Zahl: " + zahl + " - Zahl²: " + zahl * zahl );
    }
  }
  
  public static void standardForSchleife() {
    //for( int i = 0 ; i < 10 ; i++ ) {
    //  System.out.println( "Hallo Welt!");
    //}
    
    for( int i = 10 ; i <= 100 ; i = i + 10 ) {
      System.out.println( i + " - Hallo Welt!");
    }
  }
  
}
