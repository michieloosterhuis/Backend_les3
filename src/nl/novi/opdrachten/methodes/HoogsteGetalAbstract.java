package nl.novi.opdrachten.methodes;

import java.util.ArrayList;
import java.util.List;

/**
 * Schrijf een methode  die een List<Integer> ontvangt.
 *
 * Wanneer er twee getallen of meer in zijn:
 * Return het volgende:
 * "Het hoogste getal van de gegeven getallen is: %GETAL%"
 *
 * Je mag hier geen Collections.sort of java.streams gebruiken.
 *
 */
public class HoogsteGetalAbstract {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(100);
        numberList.add(200);
        numberList.add(45);
        highestNumber(numberList);
    }

    public static void highestNumber(List<Integer> numberList) {

        int maxNumber = numberList.get(0);
        for (int i = 0; i < numberList.size(); i++) {
            int currentNumber = numberList.get(i);
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
        }
        System.out.println("Het hoogste getal van de gegeven getallen is: " + maxNumber);
    }
}
