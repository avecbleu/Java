package p09_objektorientierung.p07_polymorphismus;

public class Person /* extends Object */ {
    // =========================================
    //                Variablen
    // =========================================
    private String vorname;
    private String nachname; // Instanzvariable
    // =========================================
    //                Konstruktoren
    // =========================================
    public Person() { }
    
    public Person( String vorname, String nachname ) {
        this.vorname = vorname;
        this.nachname = nachname;
    }
    // =========================================
    //                Methoden
    // =========================================
    public String getVorname() {
        return vorname;
    }
    
    public void setVorname( String vorname ) {
        this.vorname = vorname;
    }
    
    public String getNachname() {
        return nachname;
    }
    
    public void setNachname( String nachname ) {
        this.nachname = nachname;
    }
    
    public void printInfo() {
        System.out.println(vorname + " " + nachname);
    }
    
}
