package Java_Basics;

import java.util.Scanner;
public class Day3_task {
    public static void main(String[] args) {
        //Assignment: ATM Simulation (Beginner-Friendly Java Project)
        //🎯 Objective:
        //Build a simple console-based ATM system with the following features:
        //🧾 Functional Requirements:
        //1.	Ask for a 4-digit PIN (e.g., 1234)
        //2.	If PIN is correct, show this menu:
        //1. Check Balance
        //2. Deposit Money
        //3. Withdraw Money
        //4. Exit
        //3.	Perform the chosen operation and repeat the menu until user exits.
        //4.	Validate insufficient funds on withdrawal.
        Scanner scanner = new Scanner(System.in);
        int correctPin = 1234;
        int balance = 1000;


        // Ask for a PIN once
        System.out.print("Enter a 4-digit PIN: ");
        int pin = scanner.nextInt();
        if (pin != correctPin) {
            System.out.println("Incorrect PIN. Access Denied.");
            return;
        }

        int choice;
        do {
            // Display Menu
            System.out.println("\n===== ATM Menu =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is: " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    int deposit = scanner.nextInt();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit successful. New balance: " + balance);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    int withdraw = scanner.nextInt();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful. New balance: " + balance);
                    } else if (withdraw > balance) {
                        System.out.println("Insufficient balance.");
                    } else {
                        System.out.println("Invalid withdrawal amount.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);
    }
}
