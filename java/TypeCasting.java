void main() {
    // Widening Casting (automatic) - converting a smaller type to a larger type size
    // byte -> short -> char -> int -> long -> float -> double
    // Automatic casting: int to double
    int myInt = 9;
    double myDouble = myInt;

    IO.println(myInt);
    IO.println(myDouble);

    // Narrowing Casting (manual) - converting a larger type to a smaller size type
    // double -> float -> long -> int -> char -> short -> byte
    // Manual casting: double to int
    double anotherDouble = 9.78d;
    int anotherInt = (int) myDouble;

    IO.println(anotherDouble);
    IO.println(anotherInt);
}