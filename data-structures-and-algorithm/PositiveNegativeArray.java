import java.util.Scanner;

public class PositiveNegativeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int arraySize = input.nextInt();
        
        int[] myArray = new int[arraySize];
        for(int i = 0; i < arraySize; i++) {
            System.out.print("Enter number: ");
            myArray[i] = input.nextInt();
        }

        int[] positiveArray = new int[arraySize];
        int[] negativeArray = new int[arraySize];
        int positivePos = 0;
        int negativePos = 0;
        
        for(int i = 0; i < myArray.length; i++) {
            if (myArray[i] >= 0 ) {
                positiveArray[positivePos] = myArray[i];
                positivePos++;
            } else {
                negativeArray[negativePos] = myArray[i];
                negativePos++;
            }
        }

        System.out.print("Array: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ") ;
        }
        
        System.out.print("\nPositive: ");
        for (int i = 0; i < positivePos; i++) {
            System.out.print(positiveArray[i] + " ");
        }

        System.out.print("\nNegative: ");
        for (int i = 0; i < negativePos; i++) {
            System.out.print(negativeArray[i] + " ");
        }

        input.close();
    }
}