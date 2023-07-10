package comcave;

import java.time.LocalDate;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Peter Meier", LocalDate.of(1977, 11, 22));
        Person person2 = new Person("Ilse Schmidt", LocalDate.of(1983, 2, 6));
        Person person3 = new Person("Udo Berger", LocalDate.of(1966, 1, 1));

        System.out.println("Hat Peter Geburtstag? " + person1.hatGeburtstag()); // false
        System.out.println("Hat Ilse Geburtstag? " + person2.hatGeburtstag()); // true

        System.out.println("Alter von Peter: " + person1.getAlter()); // 45
        System.out.println("Alter von Ilse: " + person2.getAlter()); // 40
        System.out.println("Alter von Udo: " + person3.getAlter()); // 57

        System.out.println(LocalDate.now()); // heute
    }
}
