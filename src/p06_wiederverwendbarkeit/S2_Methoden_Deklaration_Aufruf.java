package p06_wiederverwendbarkeit;

public class S2_Methoden_Deklaration_Aufruf {
    
    // <access modifier>    : public, protected, - (default), private
    // <non-access modifier>: static, abstract, final, ...
    // <access modifier> <non-access modifier> <return type> methodname( [parameter] ) { ... }
    //    public                static            void         printTitle( String title) { ... }
    public static void main( String[] args ) {
        System.out.println("main()-Start");
        // ==============================
        //methodeA();
        // ==============================
        //methodeB(15);
        // ==============================
        //methodeC(); // Möglich, aber Rückgabewert ist damit verloren
        //int a = methodeC();
        //System.out.println("a: " + a);
        // ==============================
        //methodeD(7); // Möglich, aber Rückgabewert ist damit verloren
        int b = methodeD(7);
        System.out.println("b: " + b);
        // ==============================
        System.out.println("main()-Ende");
    }
    // ==================================
    public static int methodeD( int zahl) {
        System.out.println("methodeD(int)");
        return zahl * zahl;
    }
    // ==================================
    public static int methodeC() {
        System.out.println("methodeC()");
        return 10;
    }
    // ==================================
    public static void methodeB( int zahl) {
        System.out.println("methodeB(int)");
    }
    // ==================================
    public static void methodeA() {
        System.out.println("methodeA()");
    }
    // ==================================
}
