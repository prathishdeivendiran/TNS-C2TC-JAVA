package com.tnsifDAY8;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Country {
    private Map<String, String> countryMap;

    public Country() {
        this.countryMap = new HashMap<>();
    }

    public void add(String countryName, String capitalName) {
        countryMap.put(countryName.toLowerCase(), capitalName);
    }

    public String search(String countryName) {
        return countryMap.getOrDefault(countryName.toLowerCase(), "Data not found");
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        Country country = new Country();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Country and Capital");
            System.out.println("2. Search Capital");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter country name: ");
                    String countryName = scanner.nextLine();
                    System.out.print("Enter capital name: ");
                    String capitalName = scanner.nextLine();
                    country.add(countryName, capitalName);
                    System.out.println("Country and capital added successfully.");
                    break;
                case 2:
                    System.out.print("Enter country name to search capital: ");
                    String searchCountry = scanner.nextLine();
                    String capital = country.search(searchCountry);
                    System.out.println("Capital: " + capital);
                    break;
                case 3:
                    System.out.println("Thank you for using the application.");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
            }
        }
    }
}


