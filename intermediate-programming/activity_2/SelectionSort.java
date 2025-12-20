package activity_2;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input size of array from user then create the array
        int arraySize = getIntNumber(input, "Define the size of the array: ");
        int[] numberList = new int[arraySize];

        // Fill array with elements by user
        for (int i = 0; i < numberList.length; i++) {
            numberList[i] = getIntNumber(input, "Input array element: ");
        }
        
        // Start comparing numbers from the first value
        for (int i = 0; i < numberList.length; i++) {
            // Start comparison starting from the first number
            for (int j = i + 1; j < numberList.length; j++) {
                if (numberList[j] < numberList[i]) {
                    int temp = numberList[i];
                    numberList[i] = numberList[j];
                    numberList[j] = temp;
                }
            }
        }
        input.close();
        
        System.out.print("The sorted array is: ");
        for (int num : numberList) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Forces user to enter correct value and avoids crash with other characters
    public static int getIntNumber(Scanner input, String message) {
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
