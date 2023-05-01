package org.example;

import java.util.List;
import java.util.Scanner;

import static org.example.Inventory.*;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        // Display the application information
        System.out.println("Inventory Management System v1.0 (Created on April 29, 2023)");
        System.out.println("Developer: John Smith (johnsmith@example.com)");  // Oybek...


        // Display the available commands
        System.out.println("\nAvailable commands:");
        System.out.println("1. Search products");
        System.out.println("2. List all products");
        System.out.println("3. Exit");

        List<Product> products = loadInventory();
        // Wait for user input and process the command
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("\nEnter command (1-3): ");
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    searchProducts(products);
                    break;
                case 2:
                    listProducts(products);
                    break;
                case 3:
                    System.out.println("Exiting application...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid command. Please enter a valid command (1-3).");
                    break;
            }
        }
    }
}