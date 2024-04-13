package com.tnsifDAY9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class PetName {
    public String findPetName(String fileName) {
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (countVowels(line) == 2) {
                    return line;
                }
            }

        } catch (FileNotFoundException e) {
            return "Please give the correct file name";
        } catch (IOException e) {
            return "Error occurred while reading the names from file";
        }

        return "No pet name found with exactly two vowels";
    }

    private int countVowels(String name) {
        int count = 0;
        for (char ch : name.toLowerCase().toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        PetName ui = new  PetName();
        String fileName = "C:/B.Tech/VI SEM/Java/names.txt"; // Change this to the actual file name
        System.out.println(ui.findPetName(fileName));
    }
}
