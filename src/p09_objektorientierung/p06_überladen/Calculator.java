package p09_objektorientierung.p06_überladen;

public class Calculator {
    
    public static void main( String[] args ) {
        System.out.println( summe(3, 5) );
        System.out.println( summe(3, 5, 8) );
    }
    
    // Methode summe() wurde hier überladen (overload)
    // d.h. gleicher Name und unterschiedliche Paramterliste
    public static int summe( int a, int b ) {
        return a + b;
    }

    public static int summe(int a, int b, int c ) {
        return a + b + c;
    }
}
