package activity_3;

import java.util.Scanner;

public class SortAndSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input size of array from user then create the array
        int arraySize = getIntNumber(input, "Define the size of the array: ");
        int[] numberList = new int[arraySize];

        // Fill array with elements by user
        for (int i = 0; i < numberList.length; i++)
            numberList[i] = getIntNumber(input, "Input array element: ");

        // Sort the array with method
        numberList = selectionSort(numberList);

        // Display the sorted array
        System.out.print("The sorted array is: ");
        for (int num : numberList)
            System.out.print(num + " ");
        System.out.println();
    
        // Input number to search from user
        int search = getIntNumber(input, "Enter number to search: ");
        // Search for the number in the array
        int result = binarySearch(numberList, search);

        // If the number is equal to -1, it means the number is not found
        if (result != -1) {
            System.out.println(search + " found at index: " + result);
        } else {
            System.out.println(search + " is not found in array");
        }

        input.close();
    }
    
    private static int[] selectionSort(int[] numberList) {
        // Start comparing numbers from the first value
        for (int i = 0; i < numberList.length; i++) {

            // Set the smallest minimum value as the current value
            // If there is no smaller number then the replacing value will just be itself
            int min = numberList[i];

            // Set the current position as the value of i
            int index = i;

            // For swapping variables
            int temp = numberList[i];
            
            // Start comparison starting from the first number
            for (int j = i + 1; j <= numberList.length - 1; j++) {

                // The comparing number should be LOWER than the current min
                if (numberList[j] < min) {

                // Replace the value of min with the new lower number IF it is much lower
                    min = numberList[j];
                    index = j;
                }
            }

            // Switch values
            numberList[i] = min;
            numberList[index] = temp;
        }
        return numberList;
    }

    private static int binarySearch(int[] numberList, int search) {
        int low = 0;

        // Decrement by one since array search starts from 0 (or it will be out of bounds)
        int high = numberList.length - 1;

        while (high >= low) {
            // Get the new center value by getting median of high and low
            int median = (high + low) / 2;
            
            // Check if the value is exactly the median
            if (search == numberList[median]) {
                return median;
            } 

            // Check if the value is HIGHER than the MEDIAN
            if (search > numberList[median]) {
                
                // Set a HIGHER LOW value since the search value is HIGH
                low = median + 1;
            
            // Check if the value is LOWER than the MEDIAN
            } else if (search < numberList[median]) {

                // Set a LOWER HIGH value since the search value is LOW
                high = median - 1;
            }
        }       
        return -1;
    } 

    private static int getIntNumber(Scanner input, String message) {
        // Forces user to enter the correct value and avoids crash with other characters
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