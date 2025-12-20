void main() {

    // New method of input and output
    // IO functions similar to traditional method
    IO.println("Welcome, User!");
    IO.readln("Enter your name: "); // With built-in text prompt

    // Import scanner by initializing scanner
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = scanner.nextLine();

    IO.print("Enter your age: ");
    byte age = scanner.nextByte();

    // Consumes the escape character left by 'nextByte' method
    scanner.nextLine();

    IO.print("Enter your country: ");
    String country = scanner.nextLine();

    IO.println("Your name is " + name + ", currently " + age + " years old");
    IO.println("Your country of origin is " + country);

    // Close scanner to avoid memory leak
    scanner.close();

}