import java.util.Scanner;

public class ATMMachine {
    private static float initialSavings = 0;
    private static final long myAccountNumber = 123456789L;
    private static final int myPinNumber = 123456;
    private static final Scanner input = new Scanner(System.in);

    private static byte getInput(Scanner input) {
        System.out.println("1 - Check Balance\n2 - Withdrawal\n3 - Deposit");
        System.out.println("--------------------------");
        System.out.print("Please enter your choice: ");
        byte choice = input.nextByte();
        while(choice > 3 && choice < 0) {
            System.out.println("--------------------------");
            System.out.print("Invalid choice, please enter correct choice: ");
            choice = input.nextByte();
        }
        System.out.println("--------------------------");
        return choice;
    }
    private static void checkBalance() {
        System.out.println("Your balance is " + initialSavings);
        System.out.println("--------------------------");
    }

    private static void withdrawal() {
        System.out.print("Enter amount to withdraw: ");
        float withdrawAmount = input.nextFloat();
        while(withdrawAmount > initialSavings && withdrawAmount < 0) {
            System.out.println("--------------------------");
            System.out.print("Invalid withdrawal amount. Enter correct amount: ");
            System.out.println("--------------------------");
            withdrawAmount = input.nextFloat();
        }
        initialSavings = initialSavings - withdrawAmount;
        checkBalance();
    }

    private static void deposit() {
        System.out.print("Enter amount to deposit: ");
        float depositAmount = input.nextFloat();
        while(depositAmount < 0) {
            System.out.println("--------------------------");
            System.out.print("Invalid deposit amount. Enter correct amount: ");
            System.out.println("--------------------------");
            depositAmount = input.nextFloat();
        }
        initialSavings = initialSavings + depositAmount;
        checkBalance();
    }

    public static void main(String[] args) {
        long accountNumber = 0, pinNumber = 0;
        while(!(accountNumber == myAccountNumber && pinNumber == myPinNumber)) {
            System.out.print("Enter your Account Number: ");
            accountNumber = input.nextLong();
            System.out.print("Enter your PIN Number: ");
            pinNumber = input.nextInt();
            System.out.println("--------------------------");
            if (!(accountNumber == myAccountNumber) || !(pinNumber == myPinNumber)) {
                System.out.println("Incorrect account details, please try again.");
                System.out.println("--------------------------");
            }
        }
        
        byte choice = 1;
        while(!(choice == 0)) {
            choice = getInput(input);
            switch (choice) {
                case 1 -> checkBalance();
                case 2 -> withdrawal();
                case 3 -> deposit();
            }
            System.out.print("Press any number to continue (0 to exit): ");
            choice = input.nextByte();
            System.out.println("--------------------------");
        }
        input.close();
    }    
}
