/*
 * Program: Simple Bank Management System
 * Description:
 * This program simulates basic banking operations such as
 * account selection, deposit, withdrawal, and balance checking.
 *
 * Concepts Used:
 * - Class and Object
 * - Constructor
 * - Methods
 * - Loop Control
 * - Conditional Statements
 * - User Input using Scanner
 *
 * Author: Sanketh S
 */

import java.util.Scanner;

public class Bank {

    // Instance variables
    String accountHolderName;
    double balance;

    // Constructor to initialize account details
    Bank(String name, double balance) {
        this.accountHolderName = name;
        this.balance = balance;
    }

    // Method to deposit money
    double deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
            return balance;
        }

        balance += amount;
        System.out.println("Deposited Amount: " + amount);
        return balance;
    }

    // Method to withdraw money
    double withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
            return balance;
        }

        if (amount > balance) {
            System.out.println("Low Balance!");
            return balance;
        }

        balance -= amount;
        System.out.println("Withdrawn Amount: " + amount);
        return balance;
    }

    // Method to display balance
    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank bankAccount = null;
        while (true) {
            
        

        // Account selection
        System.out.println("***** Welcome to Canara Bank *****");
        System.out.println("Choose Account:");
        System.out.println("1. Account 103 (Sanketh)");
        System.out.println("2. Account 104 (Sangeetha)");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                bankAccount = new Bank("Sanketh", 100);
                break;

            case 2:
                bankAccount = new Bank("Sangeetha", 100);
                break;

            default:
                System.out.println("Invalid Account Selection");
                sc.close();
                return;
        }

        boolean running = true;

        // Banking menu
        while (running) {

            System.out.println("\nChoose Option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int option = sc.nextInt();

            switch (option) {

                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = sc.nextDouble();
                    bankAccount.deposit(depositAmount);
                    bankAccount.displayBalance();
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = sc.nextDouble();
                    bankAccount.withdraw(withdrawAmount);
                    bankAccount.displayBalance();
                    break;

                case 3:
                    bankAccount.displayBalance();
                    break;

                case 4:
                    System.out.println("Thank You For Visiting!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid Option");
            }
        }
    }
   

       
    }

}