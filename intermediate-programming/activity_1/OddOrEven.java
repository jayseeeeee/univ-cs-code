package activity_1;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte number = getByteInput(input, "Enter a number ranging from 1 to 50: ");

        // Forces user to input a number within the given range.
        while (number < 1 || number > 50) {
            System.out.println("Error: Number is not within the given range.");
            number = getByteInput(input, "Enter a number ranging from 1 to 50: ");
        }

        // Display even if 1 or odd if 0 depending on modulo output
        for (byte i = 1; i <= number; i++) {
            if ((i % 2) == 0) {
                System.out.println(i + " - Even");
            } else {
                System.out.println(i + " - Odd");
            }
        }
        input.close();
    }

    // Forces user to enter correct value and avoids crash with other characters
    public static byte getByteInput(Scanner input, String message) {
        while (true) {
            try {
                System.out.print(message);
                return input.nextByte();
            } catch(Exception e) {
                System.out.println("Error: Number is out of bounds or incorrect.");
                input.nextLine();
            }
        }
    }
}