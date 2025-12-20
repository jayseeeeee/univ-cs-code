package activity_4;

public class Rectangle extends Shapes {
    private double perimeter;
    
    Rectangle(double num1, double num2) {
        setNum1(num1);
        setNum2(num2);
    }

    void displayPerimeter() {
        this.perimeter = 2 * (getNum1() + getNum2());
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }

    @Override
    void displayArea() {
        this.area = getNum1() * getNum2();
        System.out.println("Area of Rectangle: " + area);
    }
}
