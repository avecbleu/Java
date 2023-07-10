package p09_objektorientierung.p03_static_non_static;

public class Person {
    /*non-static*/ String vorname;  // Instanzvariable
    /*non-static*/ String nachname; // Instanzvariable
    static int counter;             // Klassenvariable (statische)
    
    public Person( String vorname, String nachname ) {
        this.vorname = vorname;
        this.nachname = nachname;
    }
    
    public /*non-static*/ void printInfo() { // Instanzmethode
        System.out.println(vorname + " " + nachname);
    }
    
    public static void printCounter() {      // Klassenmethode
        System.out.println("Anzahl von Personen: " + counter);
    }
}
