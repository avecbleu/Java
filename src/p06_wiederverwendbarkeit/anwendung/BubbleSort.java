package p06_wiederverwendbarkeit.anwendung;

import java.util.Arrays;

public class BubbleSort {
    
    public static void main( String[] args ) {
        System.out.println("============================================================");
        int[] zahlen = { 9, 23, 15, 7, 8 };
        sort(zahlen);
        System.out.println("============================================================");
        zahlen = new int[] { 78, 9, 150, 77, 66, 25, 14, 57, 8 };
        sort(zahlen);
        System.out.println("============================================================");
        
    } // end of main()
    
    public static void sort( int[] zahlen ) {
        System.out.println(Arrays.toString(zahlen)); // Ausgabe des Arrays VORHER
        // ==============================================
        int len = zahlen.length;
        for( int i = 0 ; i < len ; i++ ) {
            for( int j = 0 ; j < len - 1 ; j++ ) {
                int a = zahlen[j]; // aktuelles Element
                int b = zahlen[j + 1]; // nächstes Element
                if (b < a) {
                    zahlen[j] = b;
                    zahlen[j + 1] = a;
                }
            } // inner loop
        } // outer
        // ==============================================
        System.out.println(Arrays.toString(zahlen)); // Ausgabe des Arrays NACHHER
    } // end of sort()
    
}
