package midterms;

import java.util.Scanner;

public class Computer {
    private final Scanner scanner = new Scanner(System.in);
    
    // To compute for area of rectangle
    public void getRectangleArea() {
        
        System.out.println("You have selected \"Area of Rectangle \"");
        
        System.out.print("Please input the length of rectangle: ");
        float length = scanner.nextFloat();
        
        System.out.print("Please input the width of rectangle: ");
        float width = scanner.nextFloat();
        
        float area = length * width;
        
        System.out.println("The area of rectangle is: " + area);
    }
    
    // To compute for area of square
    public void getSquareArea() {
        System.out.println("You have selected \"Area of Square \"");

        System.out.print("Please input the side of square: ");
        float side = scanner.nextFloat();

        float area = side * side;

        System.out.println("The area of square is: " + area);
    }
    
    // To compute for average grades
    public void getAverageGrade() {
        System.out.println("You have selected \"Grade Computation\"");
        
        System.out.print("Please input the first grade: ");
        float firstGrade = scanner.nextFloat();
        System.out.print("Please input the second grade: ");
        float secondGrade = scanner.nextFloat();
        System.out.print("Please input the third grade: ");
        float thirdGrade = scanner.nextFloat();
        
        float averageGrade = (firstGrade + secondGrade + thirdGrade) / 3;
        String remark;
        if (averageGrade >= 60) {
            remark = "Passed";
        } else {
            remark = "Failed";
        }
        
        System.out.println(">> GRADES << " + averageGrade + "\n>> REMARK << " + remark);
    }
}
