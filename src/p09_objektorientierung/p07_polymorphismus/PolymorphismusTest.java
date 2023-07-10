package p09_objektorientierung.p07_polymorphismus;

public class PolymorphismusTest {
    
    public static void main( String[] args ) {
      // =======================================
      //Person person = new Person();
      //Dozent dozent = new Dozent();
      //Teilnehmer teilnehmer = new Teilnehmer();
      // =======================================
      // Variable von einem bestimmten Typen
      // auf Objekte untersch. Typen referenzieren kann => Polymorphismus
      Person person;
      person = new Person();
      person = new Teilnehmer();
      person = new Dozent();
    }
    
}
