void main() {

    // Break - Stops the loop entirely
    // Continue - Skips the current iteration of a loop

    Scanner input = new Scanner(System.in);

    String option;
    while (true) {
        IO.println("I like Dungeons and Dragons");
        IO.print("Enter [E] to continue or any key to exit: ");
        option = input.next();
        if (option.equals("E")) {
            continue;
        } else {
            break;
        }
    }

    for (int i = 0; i < 10; i++) {
        if (i == 3) {
            continue;
        } else if (i == 7) {
            break;
        }
        IO.println(i);
    }

    input.close();
}
