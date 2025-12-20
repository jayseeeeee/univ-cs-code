package week_8;
import java.util.Scanner;

public class AccountHandler {
    private final String accountHolder = "John Christian B. Dacasin";
    private final long myAccountNumber = 1234567890L;
    private final int myAccountPin = 123456;
    private float myBalance = 10000L;
    
    private boolean checkBalance() {
        System.out.println("==============================================");
        System.out.println("Your current balance is " + myBalance);
        return true;
    }
    
    private boolean withdraw(Scanner input) {
        boolean correctInput = false;
        System.out.println("==============================================");
        while (!correctInput) {
            System.out.print("Please enter withdrawal amount: ");
            float withdrawAmount = input.nextFloat();
            if (withdrawAmount > myBalance) {
                System.out.println("You have insufficient funds, please try again!");
            } else {
                myBalance = myBalance - withdrawAmount;
                System.out.println("Your new current balance is " + myBalance);
                correctInput = true;
            }
        }
        return true;
    }
    
    private boolean deposit(Scanner input) {
        System.out.println("==============================================");
        System.out.print("Please enter the deposit amount: ");
        float depositAmount = input.nextFloat();
        
        myBalance = myBalance + depositAmount;
        System.out.println("Your new balance is " + myBalance);
        return true;
    }
    
    private boolean exit() {
        System.out.println("==============================================");
        System.out.println("Goodbye, " + accountHolder + "!");
        System.out.println("If you would like to go again, please insert the card.");
        return true;
    }
    
    public boolean loginAccount(long accountNumber, int accountPin, Scanner input) {
        boolean validAccount = true;
        if (myAccountNumber == accountNumber && myAccountPin == accountPin) {
            System.out.println("Welcome, " + accountHolder + "!");
            boolean correctInput = false;
            while (!correctInput) {
                System.out.println("==============================================");
                System.out.println("1 - Check Balance");
                System.out.println("2 - Withdraw");
                System.out.println("3 - Deposit");
                System.out.println("4 - Exit");
                System.out.print("Please select from the following options: ");
                byte choice = input.nextByte();
                switch (choice) {
                    case 1 -> checkBalance();
                    case 2 -> withdraw(input);
                    case 3 -> deposit(input);
                    case 4 -> correctInput = exit();
                    default -> System.out.println("You have entered the incorrect number, please try again!");
                }
            }
        } else if (myAccountNumber == accountNumber) {
            System.out.println("Wrong pin number! Please try again.");
            validAccount = false;
        } else {
            System.out.println("Invalid account number! Please try again.");
            validAccount = false;
        }
        return validAccount;
    }
}
