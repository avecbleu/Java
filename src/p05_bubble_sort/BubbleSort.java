package p05_bubble_sort;

import java.util.Arrays;

public class BubbleSort {
    
    public static void main( String[] args ) {
      // index         0   1   2  3  4
      int[] zahlen = { 9, 23, 15, 7, 8 };
      
      int len = zahlen.length; // hier 5
  
      System.out.println( Arrays.toString(zahlen) );
      System.out.println("============================================================");
      // (i=0, j=0..3), (i=1, j=0..3)
      for( int i = 0 ; i < len ; i++ ) { // i = 0..4
        for( int j = 0 ; j < len - 1 ; j++ ) { // j = 0..3
          int a = zahlen[j]; // aktuelles Element
          int b = zahlen[j + 1]; // nächstes Element
          if (b < a) {
            zahlen[j] = b;
            zahlen[j + 1] = a;
          }
          //System.out.println( Arrays.toString(zahlen) );
        } // inner loop
      } // outer
      System.out.println( Arrays.toString(zahlen) );
      
    } // end of main()
    
}
