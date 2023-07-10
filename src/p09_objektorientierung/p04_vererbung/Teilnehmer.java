package p09_objektorientierung.p04_vererbung;

import java.time.LocalDate;

public class Teilnehmer extends Person {
    // =========================================
    //                Variablen
    // =========================================
   private LocalDate startDatum;
    // =========================================
    //                Konstruktoren
    // =========================================
    public Teilnehmer() { }
    
    public Teilnehmer( String vorname, String nachname ) {
        super(vorname, nachname);
    }
    
    public Teilnehmer( String vorname, String nachname, LocalDate startDatum ) {
        super(vorname, nachname);
        this.startDatum = startDatum;
    }
    // =========================================
    //                Methoden
    // =========================================
    public LocalDate getStartDatum() {
        return startDatum;
    }
    
    public void setStartDatum( LocalDate startDatum ) {
        this.startDatum = startDatum;
    }
    
    @Override // Überschreiben der Methode printInfo() von Person
    public void printInfo() {
        super.printInfo();
        System.out.println("StartDatum: " + startDatum);
    }
    
}
