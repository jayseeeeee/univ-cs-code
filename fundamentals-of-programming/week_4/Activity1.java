import java.util.Scanner;

public class Activity1 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        float first = input.nextFloat();
        
        System.out.println("Enter second number");
        float second = input.nextFloat();
        
        System.out.println("Enter third number");
        float third = input.nextFloat();
        
        System.out.println("Enter fourth number");
        float fourth = input.nextFloat();
        
        System.out.println("Enter fifth number");
        float fifth = input.nextFloat();
        
        System.out.println("Enter sixth number");
        float sixth = input.nextFloat();
        
        System.out.println("Enter seventh number");
        float seventh = input.nextFloat();
        
        System.out.println("Enter eight number");
        float eight = input.nextFloat();
        
        System.out.println("Enter ninth number");
        float ninth = input.nextFloat();

        System.out.println("Enter tenth number");
        float tenth = input.nextFloat();

        float intSum = first + second + third + fourth + fifth + sixth + seventh + eight + ninth + tenth;
        float intAverage = intSum / 10; 

        int floatSum = (int) intSum; 
        int floatAverage = (int) intAverage;  
        System.out.println("The integer sum of the numbers you have entered is " + intSum);
        System.out.println("The average integer of the sum is " + intAverage);
        System.out.println("The sum of the numbers you have entered is " + floatSum);
        System.out.println("The average of the sum is " + floatAverage);
        
        input.close();
    }
         
}
