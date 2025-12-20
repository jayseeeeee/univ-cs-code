package activity_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("CIRCLE");
        System.out.print("Input diameter: ");
        double diameter = input.nextDouble();

        Circle circle = new Circle(diameter);
        circle.displayRadius();
        circle.displayArea();
        circle.displayValue();

        System.out.println("----------------------------");
        System.out.println("RECTANGLE");
        System.out.print("Input length: ");
        double length = input.nextDouble();
        System.out.print("Input width: ");
        double width = input.nextDouble();

        Rectangle rectangle = new Rectangle(length, width);
        rectangle.displayPerimeter();
        rectangle.displayArea();
        rectangle.displayValue();

        input.close();
    }
}