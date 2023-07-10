package p09_objektorientierung.p04_vererbung;

public class PersonTest {
    
    public static void main( String[] args ) {
      System.out.println("============================================================");
      Person person = new Person("Peter", "Schmidt");
      person.printInfo();
      System.out.println("============================================================");
      Dozent dozent = new Dozent("Salah","Lejmi",817);
      dozent.printInfo();
      System.out.println("============================================================");
    }
    
}
