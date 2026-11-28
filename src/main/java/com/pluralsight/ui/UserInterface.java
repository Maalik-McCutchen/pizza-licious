package com.pluralsight.ui;

import java.util.Scanner;

public class UserInterface {

    private Scanner myScanner;

    public UserInterface() {
        myScanner = new Scanner(System.in);
    }

    public void displayHomeScreen() {

        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("===== PIZZA-LICIOUS =====");
            System.out.println();

            System.out.println("1) New order");
            System.out.println("0) Exit");
            System.out.println();

            System.out.print("Enter your choice: ");

            if (!myScanner.hasNextInt()) {
                System.out.println("\nInvalid selection. Please enter 1, or 0.");
                myScanner.nextLine();
                continue;
            }

            int choice = myScanner.nextInt();

            switch (choice) {
                case 1: displayOrderScreen();
                    break;

                case 0: running = false;
                    System.out.println("\nThank you for visiting PIZZA-LICIOUS!");
                    break;

                default:
                    System.out.println("\nInvalid selection. Please enter 1 or 0.");
            }
        }

    }

    public void displayOrderScreen() {

    }
}
