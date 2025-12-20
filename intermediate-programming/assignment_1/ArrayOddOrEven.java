package assignment_1;

import java.util.Scanner;

public class ArrayOddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input size of array from user
        int arraySize = getNumberInput(input, "Enter the size of array from 5 to 10: ");

        // Forces user to only input value within given range
        while (arraySize < 5 || arraySize > 10) {
            System.out.println("Error: Number is not within the given range.");
            arraySize = getNumberInput(input, "Enter the size of array from 5 to 10: ");
        }

        // Creates array with given size
        int[] numberList = new int[arraySize];

        // Fill array with input
        for (int i = 0; i < numberList.length; i++) {
            numberList[i] = getNumberInput(input, "Enter a value: ");
        }

        // Check if numbers in array is even or odd then display
        for (int number : numberList) {
            if ((number % 2) == 0) {
                System.out.println(number + " - Even");
            } else {
                System.out.println(number + " - Odd");
            }
        }

        input.close();
    }

    // Forces user to enter correct value and avoids crash with other characters
    public static int getNumberInput(Scanner input, String message) {
        while (true) {
            try {
                System.out.print(message);
                return input.nextInt();
            } catch(Exception e) {
                System.out.println("Error: Number is out of bounds or incorrect.");
                input.nextLine();
            }
        }
    }
}
