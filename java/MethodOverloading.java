void main() {
    int squareInt = getArea(12);
    IO.println("Area of Square (int): " + squareInt);

    double squareDouble = getArea(3.14);
    IO.println("Area of Square (double): " + squareDouble);

    int rectangleInt = getArea(11, 12);
    IO.println("Area of Rectangle (int): " + rectangleInt);

    double rectangleDouble = getArea(3.14, 1.23);
    IO.println("Area of Rectangle (double): " + rectangleDouble);
}

// Overloaded Methods - Methods that share same name but different parameters
// This works because signature = name + parameters (signature will be different)
int getArea(int side) {
    return side * side;
}

double getArea(double side) {
    return side * side;
}

int getArea(int length, int width) {
    return length * width;
}

double getArea(double length, double width) {
    return length * width;
}
