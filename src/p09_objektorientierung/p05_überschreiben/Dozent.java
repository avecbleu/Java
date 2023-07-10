package p09_objektorientierung.p05_überschreiben;

public class Dozent extends Person { // Vererbung
    // =========================================
    //                Variablen
    // =========================================
    private int personalNummer;
    // =========================================
    //                Konstruktoren
    // =========================================
    public Dozent() { }
    
    public Dozent( String vorname, String nachname ) {
        super(vorname, nachname);  // Aufruf des Person-Konstruktors
    }
    
    public Dozent( String vorname, String nachname, int personalNummer ) {
        super(vorname, nachname); // Aufruf des Person-Konstruktors
        this.personalNummer = personalNummer;
    }
    // =========================================
    //                Methoden
    // =========================================
    public int getPersonalNummer() {
        return personalNummer;
    }
    
    public void setPersonalNummer( int personalNummer ) {
        this.personalNummer = personalNummer;
    }
    
    @Override // Überschreiben der Methode printInfo() von Person
    public void printInfo() {
        super.printInfo(); // Person.printInfo()
        System.out.println("Personalnummer: " + personalNummer);
    }
    
    
    
}
