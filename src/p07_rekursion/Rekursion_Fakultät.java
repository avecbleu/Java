package p07_rekursion;

public class Rekursion_Fakultät {
    
    public static void main( String[] args ) {
        // Gegeben ist eine Zahl n, Berechnet soll 1*2*3*....*n
        // n!
        int ergebnis = fakultät(5);
        System.out.println(ergebnis); // 1*2*3*4*5
        
    }
    
    // ===============================================================================
    //public static int fakultät( int n ) {
    //    int fakultät = 1;
    //    for( int i = 2 ; i <= n ; i++ ) {
    //        fakultät = fakultät * i;
    //    }
    //    return fakultät;
    //}
    
    // ===============================================================================
    // Die Rekursive Variante: n! = (n-1)! * n;
    // ===============================================================================
    public static int fakultät( int n ) {
        if (n >= 1)
            return fakultät(n - 1) * n;
        else
            return 1;
    }
    
}
