import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int arraySize = input.nextInt();
        
        int[] originalArray = new int[arraySize];
        int[] sortedArray = new int[arraySize];
        
        for(int i = 0; i < arraySize; i++) {
            System.out.print("Enter element: ");
            originalArray[i] = input.nextInt();
            sortedArray[i] = originalArray[i];
        }

        for(int i = 0; i < arraySize; i++) {
            for(int j = 0; j < arraySize - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                }
            }
        }

        System.out.print("Original Array: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(originalArray[i] + " ") ;
        }
        
        System.out.print("\nSorted Array: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(sortedArray[i] + " ");
        }

        input.close();
    }
}
