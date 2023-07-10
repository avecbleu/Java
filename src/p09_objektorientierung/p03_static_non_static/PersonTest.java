package p09_objektorientierung.p03_static_non_static;

public class PersonTest {
    
    public static void main( String[] args ) {
        Person person1 = new Person("Peter","Schmidt");
        Person person2 = new Person("Hans","Meyer");
    
        System.out.println("person1.vorname: " + person1.vorname);
        System.out.println("person2.vorname: " + person2.vorname);
        System.out.println("============================================================");
        
        person1.counter = 10; // OK, aber nicht zu empfehlen
        System.out.println("person1.counter: " + person1.counter);
        System.out.println("person2.counter: " + person2.counter);
        System.out.println("Person.counter : " + Person.counter); // OK
    }
}
