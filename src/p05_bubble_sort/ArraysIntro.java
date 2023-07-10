package p05_bubble_sort;

public class ArraysIntro {
    
    public static void main( String[] args ) {
        // int[] zahlen = { 7, 8, 9, 15, 23 }; // index: 0..4
        // ===============>
        //  Index:       0  1   2   3  4
        int[] zahlen = { 9, 23, 15, 7, 8 }; // index: 0..4
        int e0 = zahlen[0];
        zahlen[2] = 44;
        for( int i = 0 ; i < zahlen.length ; i++ ) {
            int zahl = zahlen[i];
            System.out.println(zahl);
        }
        System.out.println("============================================================");
        for( int zahl : zahlen ) {
            System.out.println(zahl);
        }
    }
    
}
