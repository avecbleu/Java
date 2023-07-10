package aufgaben.Aufgabe_10;

public class PC {
    
    private String bezeichung;
    private double prozessorGeschwindigkeit; // 2.5 GHz
    private int ram; // 16 GB (Arbeitsspeicher)
    private double festplattengröße; // 620 GB
    
    public PC() { }
    
    public PC(String bezeichung, double prozessorGeschwindigkeit, int ram, double festplattengröße) {
        this.bezeichung = bezeichung;
        this.prozessorGeschwindigkeit = prozessorGeschwindigkeit;
        this.ram = ram;
        this.festplattengröße = festplattengröße;
    }
    
    public String getBezeichung() {
        return bezeichung;
    }
    
    public void setBezeichung( String bezeichung ) {
        this.bezeichung = bezeichung;
    }
    
    public double getProzessorGeschwindigkeit() {
        return prozessorGeschwindigkeit;
    }
    
    public void setProzessorGeschwindigkeit( double prozessorGeschwindigkeit ) {
        this.prozessorGeschwindigkeit = prozessorGeschwindigkeit;
    }
    
    public int getRam() {
        return ram;
    }
    
    public void setRam( int ram ) {
        this.ram = ram;
    }
    
    public double getFestplattengröße() {
        return festplattengröße;
    }
    
    public void setFestplattengröße( double festplattengröße ) {
        this.festplattengröße = festplattengröße;
    }
    
    public void starten() {
        System.out.println("[" + bezeichung + "] wird gestartet ...");
    }
    public void runterfahren() {
        System.out.println("[" + bezeichung + "] wird heruntergefahren ...");
    }
    public void inSchlafModusGehen() {
        System.out.println("[" + bezeichung + "] übergeht in den Schlafmodus ...");
    }
    
    public void printInfo() {
        System.out.println("============================================================");
        System.out.println("                   " + bezeichung);
        System.out.println("============================================================");
        System.out.println("Prozessor      : " + prozessorGeschwindigkeit + " GHz");
        System.out.println("Arbeitsspeicher: " + ram + " GB");
        System.out.println("Festplatte     : " + festplattengröße + " GB");
    }
}











