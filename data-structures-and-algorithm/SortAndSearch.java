import java.util.Scanner;

public class SortAndSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int arraySize = input.nextInt();

        int[] myArray = new int[arraySize];
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter element for array: ");
            myArray[i] = input.nextInt();
        }

        System.out.print("Enter target: ");
        int target = input.nextInt();

        for(int i = 0; i < arraySize; i++) {
            for(int j = 0; j < arraySize - 1; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }
        
        int high = myArray.length - 1;
        int low = 0;
        while (true) {
            System.out.println(myArray.length);
            int mid = (high + low) / 2;
            if (target == myArray[mid]) {      
                System.out.println("Value found at index: " + mid);
                break;
            } else if (target < myArray[mid]) {
                high = mid - 1;
            } else if (target > myArray[mid]) {
                low = mid + 1;
            } 
            if (low > high) {
                System.out.println("Value not found");
                break;
            }
        }
        
        input.close();
    }
}
