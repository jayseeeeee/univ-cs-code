void main() {
    // While Loop - Runs until condition is false
    String option = "";
    while (!option.equalsIgnoreCase("Q")) {
        option = IO.readln("Enter [Q] to quit anytime: ");
    }

    // Do While Loop - Runs code before checking condition is false
    do {
        IO.println("I like donuts");
    } while (false);
}
