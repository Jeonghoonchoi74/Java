// Description:
// This is bank account program that allows the user to check
// balance, withdraw, and deposit money and view their transaction history.
// There are five options for the user to choose from. The user can choose to
// check their balance, withdraw money, deposit money, view their transaction and exit.
// The user can only withdraw money if they have enough money in their account.
// The user can only deposit money if they have enough money in their wallet.
// The user can only view their transaction history if they have made a transaction.
// The user can only exit the program if they have made a transaction.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount account = new BankAccount();
        int choice = 0;
        while (choice != 5) {
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. View transaction");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    account.checkBalance();
                    break;
                case 2:
                    account.withdraw();
                    break;
                case 3:
                    account.deposit();
                    break;
                case 4:
                    account.viewTransaction();
                    break;
                case 5:
                    account.exit();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

}

class BankAccount {
    Scanner input = new Scanner(System.in);
    int balance = 0;
    int wallet = 100000000;
    String transaction = "";

    //check balance
    void checkBalance() {
        System.out.println("Your balance is: " + balance);
    }
    //withdraw
    void withdraw() {
        System.out.print("Enter the amount you want to withdraw: ");
        int amount = input.nextInt();
        if (amount <= 0) {
            System.out.println("You can't withdraw a negative amount!");
        } else if (amount > balance) {
            System.out.println("You don't have enough money in your account!");
        } else {
            balance -= amount;
            System.out.println("You have withdrawn " + amount + " from your account.");
            System.out.println("Your balance is: " + balance);
            transaction += "You have withdrawn " + amount + " from your account.\n";
        }
    }
    //deposit
    void deposit() {
        System.out.print("Enter the amount you want to deposit: ");
        int amount = input.nextInt();
        if (amount <= 0) {
            System.out.println("You can't deposit a negative amount!");
        } else if (amount > wallet) {
            System.out.println("You don't have enough money in your wallet!");
        } else {
            balance += amount;
            System.out.println("You have deposited " + amount + " to your account.");
            System.out.println("Your balance is: " + balance);
            transaction += "You have deposited " + amount + " to your account.\n";
        }
    }
    //view transaction
    void viewTransaction() {
        if (transaction.isEmpty()) {
            System.out.println("You don't have any transaction!");
        } else {
            System.out.println(transaction);
        }
    }
    //exit
    void exit() {
        if (transaction.isEmpty()) {
            System.out.println("You can't exit the program without making a transaction!");
        } else {
            System.out.println("Thank you for using our service!");
        }
    }

}