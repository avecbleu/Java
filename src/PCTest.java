package Aufgabe_10;

public class PCTest {
    
    public static void main( String[] args ) {
        PC pc1 = new PC("HP Pavillon", 3.5, 16, 1000);
        PC pc2 = new PC("Acer Sonnerschirm 510", 2.4, 8, 650);
        PC pc3 = new PC("IBM Super Tech 12", 1.9, 32, 2500);
        
        pc1.printInfo();
        pc2.printInfo();
        pc3.printInfo();
        
        System.out.println("============================================================");
        pc1.starten();
        pc1.runterfahren();
        pc2.runterfahren();
        pc3.inSchlafModusGehen();
        
        
    }
}
