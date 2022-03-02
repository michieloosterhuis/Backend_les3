package nl.novi.opdrachten.lijsten;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static nl.novi.opdrachten.lijsten.GeheimeCode.encryptor;

public class VersleutelNamenLijst {

    /**
     * Bijgevoegd is verzetsleden.txt
     * Maak een programma dat verzetsleden.txt uitleest.
     * Versleutel de namen op dezelfde manier als in GeheimeCode.java
     * En sla de versleutelde namen op in secret.txt
     *
     */
    public static void main(String[] args) {
        try {
            List<String> names = new ArrayList<>();
            File file = new File("src/nl/novi/opdrachten/lijsten/verzetsleden.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                names.add(scanner.nextLine());
            }
            names = encryptor(names);

            File newFile = new File("src/nl/novi/opdrachten/lijsten/verzetsleden_encrypted.txt");
            FileWriter fileWriter = new FileWriter(newFile);
            BufferedWriter bw = new BufferedWriter(fileWriter);
            for (String name : names) {
                bw.write(name);
                bw.newLine();
            }
            bw.close();
            System.out.println(names);
        } catch (IOException e) {
            System.out.println("Inlezen bestand mislukt...");
            System.out.println(e);
        }
    }
}
