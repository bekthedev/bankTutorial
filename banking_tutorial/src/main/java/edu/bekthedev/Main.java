package edu.bekthedev;

import java.util.Scanner;



public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Simple Banking Program

        // DECLARE VARIABLES
        double balance = 0;
        boolean isRunning = true;
        int choice;

        System.out.println("Banking Program");
        while (isRunning) {
            // DISPLAY MENU
           
            System.out.println("1. Show Balance, 2. Deposit, 3. Withdrawl or 4. Exit: ");

            // GET AND PROCESS USER CHOICE
            System.out.println("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdrawl(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invaid choice!");
            }
        }

        // EXIT MESSAGE
        System.out.println("Thanks! Have a nice day!");

        scanner.close();

    }

    // SHOWBALANCE() METHOD
    static void showBalance(double balance) {
        System.out.printf("$%.2f\n", balance);
    }

    // DEPOSIT() METHOD
    static double deposit() {
        double amount;

        System.out.println("Enter amount to be deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }
    }

    // WITHDRAWL() METHOD
    static double withdrawl(double balance) {

        double amount;

        System.out.println("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient Funds");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }
    }

}
