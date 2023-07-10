package p04_prozedural_vs_objektorientiert;

public class S01_Prozedural {
    
    public static void main( String[] args ) {
        prozedural();
    }
    
    private static void prozedural() {
        //                 0  1 ...
        int[] rechteck1 = {6, 2};
        int[] rechteck2 = {4, 3};
        int[] rechteck3 = {14, 5};
        int[][] rechecktListe = { rechteck1, rechteck2, rechteck3 };
        OtherClass.berechneFläche(rechteck1);
        OtherClass.berechneFläche(rechteck2);
        OtherClass.berechneFläche(rechteck3);
    
        System.out.println("Länge von rechteck1: " + rechteck1[0]);
    }

    
    
    
}
