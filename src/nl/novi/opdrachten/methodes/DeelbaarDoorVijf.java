package nl.novi.opdrachten.methodes;

import nl.novi.uitleg.week2.ondersteunend.People;

/**
 * Schrijf een methode die een Integer ontvangt.
 * Wanneer het getal deelbaar is door 5, laat hem de volgende tekst returnen:
 * 'deelbaar door vijf'
 * Wanneer het getal niet deelbaar is door vijf:
 * 'ondeelbaar door vijf'
 */
public class DeelbaarDoorVijf {

    public static void main(String[] sammieKijkOmhoog) {
        int chosenNumber = 44;
        isDeelbaarDoorVijf(chosenNumber);
    }

    public static void isDeelbaarDoorVijf(int getal) {
        if (getal % 5 > 0) {
            System.out.println("Ondeelbaar door vijf.");
        } else {
            System.out.println("Deelbaar door vijf.");
        }
    }
}
