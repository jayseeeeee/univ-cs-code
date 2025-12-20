package activity_1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        long number;
        Scanner input = new Scanner(System.in);

        // Forces correct input and avoid crash when user inputs other characters
        while (true) {
            try {
                System.out.print("Please enter a number: ");
                number = input.nextLong();
                break;
            } catch(Exception e) {
                System.out.println("Error: Enter value is either out of bounds or incorrect.");
                input.nextLine();
            }
        }

        // Create a multiplication table starting from 1 increasing to the input value.
        int i = 1;
        do {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        } while (i <= 10);

        input.close();
    }
}
