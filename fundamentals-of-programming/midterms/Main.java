package midterms;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Computer myComputer = new Computer();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please input your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Please input your course/year/section: ");
        String course = scanner.nextLine();
        
        System.out.println("Welcome, " + name + "!" + " You are from " + course);
        
        System.out.println("1 - Area of Rectangle");
        System.out.println("2 - Area of Square");
        System.out.println("3 - Grade Computation");
        
        byte exitKey = 1;
        while (exitKey == 1) {
            System.out.print("Please select from the choices above: ");
            byte currentInput = scanner.nextByte();
            switch (currentInput) {
                case 1 -> myComputer.getRectangleArea();
                case 2 -> myComputer.getSquareArea();
                case 3 -> myComputer.getAverageGrade();
                default -> System.out.println("Please input a valid number!");
            }
            System.out.println("Would you like to go again? Enter \"1\" to go again.");
            exitKey = scanner.nextByte();
        }
        scanner.close();
    }
    
}
