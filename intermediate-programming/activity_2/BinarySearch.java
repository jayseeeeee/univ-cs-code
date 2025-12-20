package activity_2;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input size of array from user then create the array
        int arraySize = getIntNumber(input, "Define the size of the array: ");
        int[] numberList = new int[arraySize];

        // Fill array with input
        for (int i = 0; i < numberList.length; i++) {
            numberList[i] = getIntNumber(input, "Input array element: ");
        }

        // Input number to search from user
        int search = getIntNumber(input, "Enter number to search: ");

        // The center value as the starting number
        int median = 0;

        int low = 0;

        // Must be decrement by one since array search starts from 0 (or it will be out of bounds)
        int high = numberList.length - 1;

        // Check if search value is within the high and low values
        while (true) {
            // Get the new center value by getting median of high and low
            median = (high + low) / 2;

            // Check if value is exactly the median
            if (search == numberList[median]) {
                System.out.println(search + " is found at the index " + (median));
                break;

            // Display not found if value is out of range
            } else if (search > numberList[high] || search < numberList[low]) {
                System.out.println(search + " is not found in the array");
                break;

            // Check if the value is HIGHER than the MEDIAN
            } else if (search > numberList[median]) {
                
                // Set a HIGHER LOW value since the search value is HIGH
                low = median + 1;
            
            // Check if the value is LOWER than the MEDIAN if (search < numberList[median])
            } else {

                // Set a LOWER HIGH value since the search value is LOW
                high = median - 1;
            }
        }
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
