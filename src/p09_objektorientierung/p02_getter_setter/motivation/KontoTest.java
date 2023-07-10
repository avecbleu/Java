package p09_objektorientierung.p02_getter_setter.motivation;

public class KontoTest {
    
    public static void main( String[] args ) {
      Bankkonto konto1 = new Bankkonto();
      //konto1.kontostand = 1_000_000; // Geht nicht, da konstand "private" ist.
        konto1.einzahlen(1000);
    }
    
}
