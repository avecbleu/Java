package aufgaben.Aufgabe_08.Lösung_08;

public class PersonTest {
    
    public static void main( String[] args ) {
        //Person person1 = new Person();
        Person person1 = new Person("Peter", "Schmidt");
        Person person2 = new Person("Hans", "Meyer");
        Person person3 = new Person("Stefan", "Kunz");
    
        new Person("Thomas", "Lehmann");
        new Person("...", "...");
        //Person.counter = 12; // Fehler, da counter "private" ist
        Person.printCounter();
        
    }
}
