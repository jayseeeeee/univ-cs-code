void main() {
    // Math.PI - Returns long value of Pi (3.14)
    double circumference = 2 * Math.PI * 5;
    IO.println("The circumference of a circle is: " + circumference);
    
    // Math.E - Returns the euler's number
    double e = Math.E;
    IO.println("Euler's number is equivalent to: " + e);

    // Math.round - Round off numbers based on 0-4 (down) 5-9 (up)
    double roundOff = Math.round(3.4);
    IO.println("The rounded value of the circumference is: " + roundOff);

    // Math.ceil - Always rounds up (if decimal is not 0)
    double ceil = Math.ceil(3.00001);
    IO.println("The ceiling value of 3.4 is: " + ceil);

    // Math.floor - Always rounds down
    double floor = Math.floor(3.99999);
    IO.println("The floor value of 3.99 is: " + floor);

    // Math.min - Returns the smallest value of two given numbe
    int minimum = Math.min(5, 10);
    IO.println("The smallest number between 5 and 10 is: " + minimum);

    // Math.max - Returns the biggest value of two given number
    int maximum = Math.max(5, 10);
    IO.println("The biggest number between 5 and 10 is: " + maximum);

    // Math.pow - Returns base raised to power
    double powerValue = Math.pow(4, 2);
    IO.println("The value of 4 raised to 2 is: " + powerValue);

    // Math.abs - Returns absolute value (non-negative)
    double abs = Math.abs(-5);
    IO.println("The absolute value of -5 is: " + abs);

    // Math.sqrt - Returns squared value
    double squared = Math.sqrt(9);
    IO.println("The squared value of 9 is: " + squared);
}
