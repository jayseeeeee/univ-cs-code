import java.util.*;

public class SumArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Float> myNumbers = new ArrayList<Float>();
        while (myNumbers.size() != 10) {
            System.out.print("Please enter a number: ");
            myNumbers.add(input.nextFloat());
        }
        System.out.println(myNumbers);
        float sum = 0;
        for (Float i : myNumbers) {
            sum = sum + i;
        }
        System.out.println("The total sum is equal to " + sum);
        input.close();
    }
} 