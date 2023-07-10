package p09_objektorientierung.p02_getter_setter;

public class AutoTest {
    
    public static void main( String[] args ) {
     
        // ================================
        Auto auto1 = new Auto();
        //auto1.hersteller = "Volkswagen"; // Fehler, da hersteller "private" ist
        auto1.setHersteller("Volkswagen");
        auto1.setModell("Golf 8");
        // ================================
        Auto auto2 = new Auto();
        auto2.setHersteller("BMW");
        auto2.setModell("520i");
        // ================================
        
    }
    
}
