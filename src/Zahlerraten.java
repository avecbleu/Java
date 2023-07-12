import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zahlerraten {
    public static void main(String[] args) {
        Random  rd = new Random();
        int zufallszahl = rd.nextInt(1,100);
        int anzahlVersuch = 1;
        Scanner myScanner = new Scanner (System.in);
        while (true) {
            System.out.println("Versuch Nr. " + anzahlVersuch);
            System.out.println("Ihr Rateversuch bitte" );
            int rateVersuch = myScanner.nextInt();
            if (zufallszahl == rateVersuch) {
                System.out.println("Gratulieren" );
                break;
            } else if (zufallszahl > rateVersuch) {
                System.out.println("Größer" );
            } else {
                System.out.println("kleiner" );
            }
            anzahlVersuch++;

        }

    }
}
