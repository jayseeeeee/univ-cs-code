import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter a number: ");
        float first_number = input.nextFloat();
        
        System.out.print("Please enter another number: ");
        float second_number = input.nextFloat();

        System.out.println("====================================================================");
        System.out.println("1 - Addition\n2 - Substraction\n3 - Multiplication\n4 - Division");
        System.out.print("Please select an operation:");
        int operation = input.nextInt();
        
        float final_number = 0;
        switch (operation) {
            case 1 -> final_number = first_number + second_number;
            case 2 -> final_number = first_number - second_number;
            case 3 -> final_number = first_number * second_number;
            case 4 -> final_number = first_number / second_number;
        }
        System.out.println("The computed number is equal to " + final_number);

        input.close();

    }
}
