package nl.novi.opdrachten.methodes;


import nl.novi.opdrachten.lijsten.ListOefening;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Schrijf een methode  die een List<Integer> ontvangt.
 *
 * Check in de methode of deze list 3 entries heeft.
 *
 * Wanneer dit niet zo is: return de foutmelding: "Er zijn te veel of te weinig getallen in de lijst."
 * BONUS: Kun je een foutmelding voor te veel en een foutmelding voor te weinig maken?
 *
 * Wanneer er wel drie getallen in zijn:
 * Return het volgende:
 * Een list met getallen gesorteerd van laag naar hoog.
 *
 * Je mag hier geen Collections.sort of java.streams gebruiken.
 *
 */
public class SorteerLijst {

    public static void main(String[] argeblabla) {

        List<Integer> wrongList = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6, 7, 8));
        List<Integer> correctList = new ArrayList<>(Arrays.asList(88, 888, 909909));
        List<Integer> correctList2 = new ArrayList<>(Arrays.asList(9999, 888, 909909));

        System.out.println(hasThreeEntries(correctList2));

    }

    public static List<Integer> hasThreeEntries(List<Integer> list) {
        List<Integer> originalList = list;
        List<Integer> sortedList = new ArrayList<>();
        if (list.size() == 3) {
            System.out.println("De lijst heeft 3 getallen.");

            while (originalList.size() > 0) {
                int minNumber = list.get(0);
                for (int i = 0; i < list.size(); i++) {
                    int currentNumber = list.get(i);
                    if (currentNumber < minNumber) {
                        minNumber = currentNumber;
                    }
                }
                sortedList.add(minNumber);
                originalList.remove(originalList.indexOf(minNumber));
            }

        } else {
            if (list.size() < 3) {
                System.out.println("Er zijn te weinig getallen in de lijst.");
            } else {
                System.out.println("Er zijn te veel getallen in de lijst.");
            }
        }
        return sortedList;
    }

}
