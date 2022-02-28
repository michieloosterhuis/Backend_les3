package nl.novi.opdrachten.methodes;

import java.util.ArrayList;
import java.util.List;

/**
 * Gegeven: een lijst met namen zonder hoofdletters van klanten.
 * Opdracht: Een luie stagiair heeft alle klanten in het systeem gezet, maar deze kon de Shift-knop niet vinden.
 * Het is aan jou om alle namen van een hoofdletter aan het begin te voorzien. Maak een methode die een List als
 * parameter ontvangt en de inhoud vervolgens van hoofdletters voorziet.
 *
 * Bonus 1: Zorg ervoor dat tussenvoegsels geen hoofdletter krijgen.
 * Bonus 2: Zorg ervoor dat de eerste letter na een '-' wel een hoofdletter krijgt.
 *
 *
 */

public class Hoofdletters {

    public static void main(String[] args) {
        List<String> customerNames = new ArrayList<>();

        customerNames.add("nick piraat");
        customerNames.add("michael jackson");
        customerNames.add("glennis grace");
        customerNames.add("dreetje hazes");
        customerNames.add("robbie williams");
        customerNames.add("michiel de ruyter");
        customerNames.add("sjaak polak");
        customerNames.add("jan van jansen");
        customerNames.add("henk den hartog");
        customerNames.add("mo el-mecky");
        customerNames.add("fredje kadetje");

        System.out.println(capitalizeFirstLetters(customerNames));
    }

    public static List<String> capitalizeFirstLetters(List<String> customerNames) {
        List<String> capitalizedNames = new ArrayList<>();

        for (String customerName : customerNames) {

            // Split full name into separate names
            String separateNames[] = customerName.split(" ");

            // Loop over only first and last name
            for (int i = 0; i < separateNames.length; i += separateNames.length - 1) {

                // split separate names with "-" characters into sub-names
                String[] subNames = separateNames[i].split("-");

                // capitalize (sub-)names
                for (int j = 0; j < subNames.length; j++) {
                    subNames[j] = subNames[j].substring(0, 1).toUpperCase() + subNames[j].substring(1);
                }

                // join sub-names with a "-" character
                separateNames[i] = String.join("-", subNames);
            }

            // join separate names with a space
            capitalizedNames.add(String.join(" ", separateNames));
        }
        return capitalizedNames;
    }
}
