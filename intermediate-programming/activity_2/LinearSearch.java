package activity_2;

import java.util.Scanner;

public class LinearSearch {
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
        int elementSearch = getIntNumber(input, "Enter number to search: ");

        // Set starting index at null to check 
        Integer index = null;
        for (int i = 0; i < numberList.length; i++) {
            if (numberList[i] == elementSearch) {
                System.out.println(i);
                index = i + 1;
                break;
            }
        }

        // If index is not filled with number then return not found
        if (index == null) {
            System.out.println(elementSearch + " is not found.");
        // If there is value in index then state element and index
        } else {
            System.out.println("The element " + elementSearch + " is found at index " + index);
        }

        input.close();
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
