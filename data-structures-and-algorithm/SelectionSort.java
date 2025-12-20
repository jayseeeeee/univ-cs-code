import java.util.Scanner;

public class SelectionSort {
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
            for(int j = i + 1; j < arraySize; j++) {
                if (sortedArray[j] < sortedArray[i]) {
                    int temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
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
