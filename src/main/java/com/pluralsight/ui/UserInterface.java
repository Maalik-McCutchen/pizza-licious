package com.pluralsight.ui;

import com.pluralsight.orders.Order;

import java.util.Scanner;

public class UserInterface {

    private Scanner myScanner;
    private Order currentOrder;

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
                case 1: currentOrder = new Order();
                    displayOrderScreen();
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

        boolean running = true;

        while (running) {

            System.out.println();
            System.out.println("===== ORDER SCREEN =====");
            System.out.println();

            if (currentOrder.isEmpty()) {
                System.out.println("Your current order is empty.");
                System.out.println();
            } else {
                System.out.println(currentOrder + "\n\nOrder Total: $" + currentOrder.getTotal());
            }

            System.out.println("1) Add Pizza");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Garlic Knots");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");
            System.out.println();

            System.out.print("Enter your choice: ");

            if (!myScanner.hasNextInt()) {
                System.out.println("\nInvalid selection. Please enter 1, 2, 3, 4, or 0.");
                myScanner.nextLine();
                continue;
            }

            int choice = myScanner.nextInt();

            switch (choice) {

                case 1: addPizza();
                    break;

                case 2: addDrink();
                    break;

                case 3: addGarlicKnots();
                    break;

                case 4: checkOut();
                    break;

                case 0: cancelOrder();
                    running = false;
                    break;

                default:
                    System.out.println("\nInvalid selection. Please enter 1, 2, 3, 4, or 0.");

            }
        }

    }

    public void addPizza() {

    }

    public void addDrink() {

    }

    public void addGarlicKnots() {

    }

    public void checkOut() {

    }

    public void cancelOrder() {

        currentOrder = null;
        System.out.println();
        System.out.println("Your order has been canceled.");
    }
}
