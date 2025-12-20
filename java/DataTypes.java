void main() {
    byte myByte = -128; // 2 digits
    IO.println(myByte);

    short myShort = -32768; // 4 digits
    IO.println(myShort);

    int myInt = -2147483648; // 9 digits (Up to a billion)
    IO.println(myInt);

    long myLong = -9223372036854775808L; // 18 digits
    IO.println(myLong);

    float myFloat = 5.1234567f; // 6 decimal digits
    IO.println(myFloat);

    double myDouble = 5.123456789123456789d; // 17 decimal digits
    IO.println(myDouble);

    boolean myBool = true;
    IO.println(myBool);

    char myChar = '@';
    IO.println(myChar);

    String myString = "Hello";
    IO.println(myString);
}
