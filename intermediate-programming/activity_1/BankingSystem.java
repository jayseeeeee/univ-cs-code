package activity_1;

import java.util.Scanner;

public class BankingSystem {
    float balance = 0;
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        BankingSystem system = new BankingSystem();

        // Introduction and display prompt choices to user
        System.out.println("Welcome to Simple Banking System");
        System.out.println("1: Check Balance\n2: Deposit Money\n3: Withdraw Money\n4: Exit");
        
        // Exit variable that will stop loop if user wants
        boolean exit = false;

        // Ensures user enters correct input only
        while (!exit) {
            // Avoids crash when user inputs other characters or out of bounds number
            try {
                System.out.print("\nEnter your choice: ");
                byte choice = system.input.nextByte();
                // Goes to selected methods depending on user prompt
                switch (choice) {
                    case 1 -> system.checkBalance();
                    case 2 -> system.depositMoney();
                    case 3 -> system.withdrawMoney();
                    case 4 -> exit = true;
                    // Error when user chooses number not on the list
                    default -> System.out.println("Error: Entered value is not within list.");
                }
            } catch(Exception e) {
                System.out.println("Error: Number is out of bounds or incorrect.");
                system.input.nextLine();
            }
        }
        System.out.println("Thank you for using our system!");
        system.input.close();
    }

    // Force correct user input to avoid crash
    private float getUserInput(String messagePrompt) {
        while (true) {
            try {
                System.out.print(messagePrompt);
                return input.nextFloat();
            } catch(Exception e) {
                System.out.println("Error: Number is out of bounds or incorrect");
                input.nextLine();
            }
        }
    }

    // Check current balance
    private void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Get user input then adds deposit to total balance then display new balance
    private void depositMoney() {
        float deposit = getUserInput("Enter amount to deposit: ");
        balance += deposit;
        System.out.println("New Balance: " + balance);
    }

    // Get user input then deduct withdrawal amount to total balance then display new balance
    private void withdrawMoney() {
        float withdraw = getUserInput("Enter amount to withdraw: ");
        while (withdraw > balance) {
            System.out.println("Error: Insufficient cash\n");
            withdraw = getUserInput("Enter amount to withdraw: " );
        }
        balance -= withdraw;
        System.out.println("New Balance: " + balance);
    }
}
