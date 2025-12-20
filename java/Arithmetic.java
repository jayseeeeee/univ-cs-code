void main() {

    int x = 11;
    int y = 2;
    int z;

    // Arithmetic Operators

    // Addition
    z = x + y; // = 12
    // Subtraction
    z = x - y; // = 8
    // Multiplication
    z = x * y; // = 20
    // Division
    z = x / y; // = 5
    // Modulus (Gives remainder)
    z = x % y; // = 0


    // Augmented Assignment Operator
    z += x;
    // Same as:
    z = x + x;

    // Other Augmented Operators
    z -= x;
    z *= x;
    z /= x;
    z %= x;

    // Increment and Decrement Operators
    // Adds or Minus by 1

    // Addition
    // Pre-Increment - Increment first
    z = ++x;  // x = 3, then z = 3
    // Post-Increment - Increment last
    z = x++;  // z = 2, then x = 3

    // Substraction
    z = x--;
    z = --x;

    // Order of Operators (P-E-M-D-A-S)
    double result = 3 + 4 * (7 - 5) / 2.0; // = 7
    IO.println(result);
}
