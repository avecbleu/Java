package comcave;

public class TankTest {
    public static void main(String[] args) {
        Tank tank1 = new Tank(); // Erzeugen eines neues Objekts
        // tank1.bezeichner = "Tank 1"; // Compiler-Fehler, da bezeichner private
        tank1.setBezeichner("Tank 1");
        System.out.println(tank1.getBezeichner());
        tank1.setFuellstand(67.77f); // 67.77 als float speichern
        System.out.println(tank1.getFuellstand());
        tank1.setFassungsvermoegen(4523);
        System.out.println(tank1.getFassungsvermoegen());
        // Erzeugen eines Objekst mit dem überladenenen Konstruktor
        Tank tank2 = new Tank("Tank 2", 55.45f, 2347);
        System.out.println(tank2.getBezeichner() + " " + tank2.getFuellstand() + " " + tank2.getFassungsvermoegen());
        float fuellstandInLiter = tank1.berechneFuellstandInLiter(); // 3.065
        System.out.println("Tank 1: " + fuellstandInLiter);
        // Ausgabe mit 2 Nachkommastelle (%.2f) und Zeilenumbruch (%n)
        System.out.printf("Tank 1: %.2f %n", fuellstandInLiter);
        fuellstandInLiter = tank2.berechneFuellstandInLiter(); // 1.301
        System.out.println("Tank 2: " + fuellstandInLiter);
        // Ausgabe mit 1 Nachkommastelle und Tausendertrennzeichen (%,.1f) und Zeilenumbruch(%n)
        System.out.printf("Tank 2: %,.1f %n", fuellstandInLiter);
    }
}
