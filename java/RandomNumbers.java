void main() {
    Random random = new Random();

    // No number bound (Up to integer limit)
    int number = random.nextInt();

    // With number bound (Only up to 9, 10 not included)
    int number2 = random.nextInt(1, 10);

    // Generates random decimal between 0 & 1
    double decimal = random.nextDouble();

    // Generates either true or false (50/50)
    boolean chance = random.nextBoolean();

    IO.println(number);
    IO.println(number2);
    IO.println(decimal);
    IO.println(chance);
}
