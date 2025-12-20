package activity_4;

public class Circle extends Shapes {
    private double radius;
    
    Circle(double diameter) {
        setNum1(diameter);
    }

    void displayRadius() {
        this.radius = getNum1() / 2;
        System.out.println("Radius of Circle: " + radius);
    }

    @Override
    void displayArea() {
        this.area = 3.14159265359 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
