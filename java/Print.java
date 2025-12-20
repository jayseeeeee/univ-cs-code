void main() {
    // Print with new line
    IO.println("Hello, Earth!");

    // Print without new line
    IO.print("Hello, Universe!");
    IO.println();

    // Combining string
    String earth = "Earth";
    IO.println("Hello, " + earth);

    // Escaping special characters using backslash (\)
    IO.println("\"Hello, World!\"");

    // Manual New Line
    IO.println("\nHello, World!");

    // Multiline string
    String multiline = """
            
            This is a multi-line string.
            
            
            > And I know it's long gone and
            
            
            > That magic's not here no more
            
            
            > And I might be okay, 
            
            
            > but I'm not fine at all
            
            """;
    IO.println(multiline);

    // printf() is a method used to format output
    // % [flags] [width] [.precision] [specifier-character]

    // String formatting using %
    float price = 5.99f;
    System.out.printf("The price of the item is %.2f\n", price);

    // [specifier-character]
    String name = "Spongebob"; // %s
    System.out.printf("Hello %s\n", name);

    char firstLetter = 'S'; // %c
    System.out.printf("Your name starts with a %c\n", firstLetter);

    int age = 30; // %d
    System.out.printf("You are %d years old\n", age);

    double height = 60.5; // %f
    System.out.printf("You are %f inches tall\n", height);

    boolean isEmployed = true; // %b
    System.out.printf("Employed: %b\n", isEmployed);

    // Multiple formats in one printf
    System.out.printf("%s is %d years old\n", name, age);

    // [.precision] (automatically rounds off)
    double price1 = 9.99;
    System.out.printf("Price 1 with .1 precision is: %.1f\n", price1);

    double price2 = 100123.156;
    System.out.printf("Price 2 with .2 precision is: %.2f\n", price2);

    double price3 = -54.014;
    System.out.printf("Price 3 with .3 precision is: %.3f\n", price3);

    // [flags]
    // + = output a plus
    // , = comma grouping separator
    // ( = negative numbers are enclosed in ()
    // space = display a minus if negative, space if positive
    System.out.printf("Price 1 with '+' flag is: %+f\n", price1);
    System.out.printf("Price 2 with ',' flag is: %,f\n", price2);
    System.out.printf("Price 3 with '(' flag is: %(f\n", price3);
    System.out.printf("Price 2 with 'space' flag is: % f\n", price2);
    System.out.printf("Price 3 with 'space' flag is: % f\n", price3);

    // [width]
    // 0 = zero padding (if 0 then space as padding)
    // positive number = right justified padding
    // negative number = left justified padding

    int id1 = 1;
    System.out.printf("id: %04d\n", id1);

    int id2 = 23;
    System.out.printf("id: %04d\n", id2);

    int id3 = 456;
    System.out.printf("id: %04d\n", id3);

    int id4 = 7890;
    System.out.printf("id: %04d\n", id4);
}
