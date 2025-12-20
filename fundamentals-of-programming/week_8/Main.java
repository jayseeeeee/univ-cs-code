package week_8;

import java.util.Scanner;

public class Main {
    public static boolean getUserInfo(Scanner input) {
        AccountHandler handler = new AccountHandler();
        System.out.print("Please insert card and enter account number: ");
        long accountNumber = input.nextLong();
        System.out.print("Please enter account PIN: ");
        int accountPin = input.nextInt();
        return handler.loginAccount(accountNumber, accountPin, input);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loginSuccesful = getUserInfo(input);
        while (!loginSuccesful) {
            loginSuccesful = getUserInfo(input);
        }
    }
    
}
