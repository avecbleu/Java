package comcave;

public class AlterTest {

    static int[] alter = {22, 67, 34, 56, 42, 81, 77, 27, 23, 37, 48, 56, 61, 50, 20, 21};

    public static void main(String[] args) {
        int anzahlU30 = 0;
        int summe = 0;
        int i = 0;
        while(i < alter.length) {
            summe = summe + alter[i];
            if (alter[i] < 30) {
                anzahlU30 = anzahlU30 + 1;
            }
            i = i + 1;
        }
        double durchschnitt = summe / alter.length;
        double prozentualerAnteil = (anzahlU30 * 100) / alter.length;
        System.out.println("Durchschnitt: " + durchschnitt);
        System.out.println("Prozentualer Anteil: " + prozentualerAnteil);
    }
}
