package aufgaben.Aufgabe_08.Lösung_08;

public class Person {
    
     private        String vorname;
     private        String nachname;
     private static int counter;
    
    // NUR bei Nicht-Vorhandensein von anderen Konstruktoren,
    // wird der Default-Konstruktor vom Compiler zur Verfügung gestellt,
    //public Person() { } // Default-Konstruktor: Implizit vorhanden
    
    
    
    // Konstruktor
    public Person() {
        counter++;
    }
    
    // Konstruktor
    public Person( String vorname, String nachname ) {
        System.out.println("Person(String,String)-Konstruktor");
        this.vorname = vorname;
        this.nachname = nachname;
        counter++;
    }
    
    public void printInfo() {
        System.out.println(vorname + " " + nachname);
    }
    
    public static void printCounter() {
        System.out.println("Anzahl der Instanzen: " + counter);
        //System.out.println(vorname); // FEHLER
    }
    
    
}
