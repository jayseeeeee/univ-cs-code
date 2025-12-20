import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Enter the radius of circle");
        float radius = input.nextFloat();

        float pi = 3.1415926f; 
        float area = radius * radius * pi;
        int intArea = (int) area;
       
        System.out.println("The area of the circle in float is " + area);
        System.out.println("The area of the circle in integer is " + intArea);
        input.close();
    }
    
}
