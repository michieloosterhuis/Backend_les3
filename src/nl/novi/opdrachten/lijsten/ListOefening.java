package nl.novi.opdrachten.lijsten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOefening {

    public static void main(String[] uitlegList) {

        //We hebben een list die de namen van voetbalclubs bevat
        List<String> clubNames = new ArrayList<>();
        //Die vullen we alvast voor de opdracht
        clubNames.add("Ajax");
        clubNames.add("PSV");
        clubNames.add("Feyenoord");
        clubNames.add("Fc Utrecht");
        clubNames.add("Fc Groningen");
        clubNames.add("FC Twente");

        // Vraag -1: Maak een methode die al taak heeft om de list per regel uit te printen.
        printList(clubNames);

        // Vraag 0: Maak een methode die als taak heeft om de list uit te printen: positie + inhoud.
        // Bovenstaande list zou dan dit zijn:
        // 0 - Ajax
        // 1 - PSv
        // etc...
        printList2(clubNames);

        // Vraag 1: Maak een methode die checkt of een club al in de lijst zit en voeg deze anders toe.
        //clubNames = addClub(clubNames,"FC Barcelona");
        printList2(clubNames);

        // Vraag 2: Maak een methode die de positie van de club in de lijst teruggeeft.
        getPosition(clubNames, "Fc Utrecht");

        // Vraag 3: Maak een methode die de lijst alfabetisch sorteert. Wanneer Ajax niet op positie 1 staat, moeten de
        // clubs die voor Ajax staan verwijderd worden.
        // We voegen nog wat clubs toe om de code te kunnen testen.
        clubNames.add("AA Aachen");
        clubNames.add("AFC Amsterdam");
        clubNames.add("AFC");

        clubNames = sortClubList(clubNames);
        printList2(clubNames);

        // Vraag 4: Kun je hetzelfde doen als hierboven, maar PSV moet dan laatste zijn.
        clubNames.add("Zlotty FC");
        clubNames.add("SC Eindhoven");

    }

    static void printList(List<String> clubNames) {
        clubNames.forEach(clubName -> System.out.println(clubName));
    }

    static void printList2(List<String> clubnames) {
        for (int i = 0; i < clubnames.size(); i++) {
            System.out.println(i + " - " + clubnames.get(i));
        }
    }

    static List<String> addClub(List<String> clubNames, String clubName) {
        if (clubNames.contains(clubName)) {
            System.out.println("Deze club staat al in de lijst!");
        } else {
            clubNames.add(clubName);
            System.out.println(clubName + " is toegevoegd aan de lijst!");
        }
        return clubNames;
    }

    static int getPosition(List<String> clubnames, String club) {
        int position = clubnames.indexOf(club);
        System.out.println("De positie van " + club + " is: " + position);
        return position;
    }

    static List<String> sortClubList(List<String> clubnames) {
        Collections.sort(clubnames);
        int positionAjax = clubnames.indexOf("Ajax");
        if (positionAjax > 0) {
            return clubnames.subList(positionAjax, clubnames.size());
        }
        return clubnames;
    }

}
