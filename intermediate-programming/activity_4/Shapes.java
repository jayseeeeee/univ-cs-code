package activity_4;

public abstract class Shapes {
    private double num1;
    private double num2;
    double area;

    double getNum1() {
        return num1;
    }

    double getNum2() {
        return num2;
    }

    void setNum1(double num1) {
        this.num1 = num1;
    }
    
    void setNum2(double num2) {
        this.num2 = num2;   
    }

    void displayValue() {
        System.out.println("Number 1: " + getNum1());
        System.out.println("Number 2: " + getNum2());
    }
    
    abstract void displayArea();
}