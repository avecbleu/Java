package comcave;

import java.time.LocalDate;

public class Person {
    // Deklaration der Instanzvariablen name und gebdat
    private String name;
    private LocalDate gebdat;

    // Konstruktor mit Initialisierung der Instanzvariablen
    // ACHTUNG: dadurch kein Standardkonstruktor mehr vorhanden!
    public Person(String name, LocalDate gebdat) {
        setName(name);
        setGebdat(gebdat);
    }

    // getter und setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name.length() < 2) {
            throw new RuntimeException("name muss mindestens zwei Zeichen enthalten: " + name);
        }
        this.name = name;
    }
    public LocalDate getGebdat() {
        return gebdat;
    }
    public void setGebdat(LocalDate gebdat) {
        // Geburtsjahr muss mindestens 1920 sein und darf nicht größer als 2022 sein
        if (gebdat.getYear() < 1920 || gebdat.getYear() > 2022) {
            throw new RuntimeException("Geburtsjahr muss zwischen 1920 und 2022 liegen: " + gebdat);
        }
        this.gebdat = gebdat;
    }

    // Hat die Person Geburtstag?
    // Lösung mit den drei Methoden now(), getMonth() und getDayOfMonth()
    public boolean hatGeburtstag() {
        LocalDate heute = LocalDate.now();
        return heute.getMonthValue() == gebdat.getMonthValue() &&
                heute.getDayOfMonth() == gebdat.getDayOfMonth();
    }

    // Wie alt ist die Person?
    public int getAlter() {
        LocalDate heute = LocalDate.now();
        int alter = heute.getYear() - gebdat.getYear();
        // Hatte die Person schon Geburtstag oder nicht? Falls nicht, vom alter 1 abziehen.
        if (heute.getMonthValue() < gebdat.getMonthValue()) {
            alter = alter - 1;
        }
        if (heute.getMonthValue() == gebdat.getMonthValue() &&
                    heute.getDayOfMonth() < gebdat.getDayOfMonth()) {
            alter = alter - 1;
        }
        return alter;
    }
}
