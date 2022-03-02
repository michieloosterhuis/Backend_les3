package nl.novi.opdrachten.lijsten;

import java.util.ArrayList;
import java.util.List;

public class  GeheimeCode {

    public static void main(String[] secret) {

        List<String> laResistanceMembers = new ArrayList<>();

        laResistanceMembers = addMembers(laResistanceMembers, "Arie");
        laResistanceMembers = addMembers(laResistanceMembers, "Sjaak");
        laResistanceMembers = addMembers(laResistanceMembers, "Henrie");
        laResistanceMembers = addMembers(laResistanceMembers, "Piet");
        laResistanceMembers = addMembers(laResistanceMembers, "LeDroitCestMoi");

        /*
        Opdracht 1: Hierboven zijn via de methode addMembers, leden aan de lijst toegevoegd. Pas de Methode zo aan dat
         er alleen unieke namen in voor mogen komen.
         */

        /*
        Opdracht 2: La Resistance wil niet dat de lijst met namen zo in handen komt te vallen van de bezetter. Versleutel
        Maak een methode die de lijst op de volgende manier versleuteld:
        a) Verander elke letter naar het nummer in het alfabet. Voeg na elke veranderde letter een - toe
        (behalve de laatste). Dus a wordt 1, b wordt 2 et cetera.
        Wanneer een letter een hoofdletter is, moet je beginnen met tellen bij 100. Dus A wordt 101, B wordt 102.
        Voorbeeld: Alex wordt versleuteld naar: 101-12-5-24
        b) Als de positie in de lijst een even getal is, dan moet de cijfercombinatie omgedraaid worden.
         */

        System.out.println(encryptor(laResistanceMembers));

        /*
        Opdracht 3:
        Schrijf een methode die de versleutelde lijst kan omzetten naar de ontsleutelde lijst.
         */
    }

    private static List<String> addMembers(List<String> members, String name) {
        if (!members.contains(name)) {
            members.add(name);
        }
        return members;
    }

    static List<String> encryptor(List<String> laResistanceMembers) {
        String alphabetLower = " abcdefghijklmnopqrstuvwxyz";
        String alphabetUpper = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        List<String> encryptedNames = new ArrayList<>();

        for (int i = 0; i < laResistanceMembers.size(); i++) {
            String memberName = laResistanceMembers.get(i);
            String[] memberNameArray = new String[laResistanceMembers.get(i).length()];
            for (int j = 0; j < memberNameArray.length; j++) {
                String currentCharacter = Character.toString(memberName.charAt(j));
                if(alphabetLower.contains(currentCharacter)) {
                    memberNameArray[j] = Integer.toString(alphabetLower.indexOf(currentCharacter));
                } else {
                    memberNameArray[j] = Integer.toString(alphabetUpper.indexOf(currentCharacter) + 100);
                };
                if (i % 2 == 0) {
                    StringBuilder sb = new StringBuilder(memberNameArray[j]);
                    memberNameArray[j] = sb.reverse().toString();
                }
            }
            encryptedNames.add(String.join("-", memberNameArray));
        }
        return encryptedNames;
    }
}
