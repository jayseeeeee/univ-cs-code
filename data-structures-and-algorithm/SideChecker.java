import java.util.Scanner;

public class SideChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        byte sides = input.nextByte();

        switch (sides) {
            case 3 -> System.out.println("Shape: TRIANGLE");
            case 4 -> System.out.println("Shape: QUADRILATERAL");
            case 5 -> System.out.println("Shape: PENTAGON");
            case 6 -> System.out.println("Shape: HEXAGON");
            case 7 -> System.out.println("Shape: HEPTAGON");
            case 8 -> System.out.println("Shape: OCTAGON");
            case 9 -> System.out.println("Shape: NONAGON");            
            case 10 -> System.out.println("Shape: DECAGON");      
            default -> System.out.println("Error: Invalid input");
        }

        input.close();
    }   
}
