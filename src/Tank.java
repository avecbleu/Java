package comcave;

public class Tank {
    // Deklaration der Instanzvariablen
    private String bezeichner;
    private float fuellstand;
    private int fassungsvermoegen;

    // getter und setter Methoden
    public void setBezeichner(String b) {
        // Wenn der String b weniger als vier Zeichen hat => Exception (Programmabbruch)
        if(b.length() < 4) {
            throw new RuntimeException("Bezeichner muss mindestens vier Zeichen lang sein.");
        }
        bezeichner = b;
    }
    public String getBezeichner() {
        return bezeichner;
    }
    // getter und setter für fuellstand und fassungsvermoegen (4 Methoden)
    public float getFuellstand() {
        return fuellstand;
    }
    public void setFuellstand(float f) {
        // f ist kleiner als 0 oder f ist größer als 100
        if (f < 0 | f > 100) {
            throw new RuntimeException("fuellstand darf nicht kleiner als 0 oder groesser als 100 sein.");
        }
        fuellstand = f;
    }
    public int getFassungsvermoegen() {
        return fassungsvermoegen;
    }
    public void setFassungsvermoegen(int f) {
        if (f < 1000) {
            throw new RuntimeException("fassungsvermoegen darf nicht kleiner als 1000 Liter sein.");
        }
        fassungsvermoegen = f;
    }

    // Konstruktoren
    public Tank() {} // Standardkonstruktor
    public Tank(String bezeichner, float fuellstand, int fassungsvermoegen) {
        // Setzen der drei Instanzvariablen
        setBezeichner(bezeichner);
        setFuellstand(fuellstand);
        setFassungsvermoegen(fassungsvermoegen);
    }

    // Methode zur Berechnung des Füllstands in Liter
    public float berechneFuellstandInLiter() {
        return fassungsvermoegen * fuellstand / 100;
    }
}
