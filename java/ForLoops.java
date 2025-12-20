void main() throws InterruptedException {

    // For Loops - Executes a block of code for SPECIFIED amount of times
    // Initialization/Counter ; Condition ; Step

    // Increment from 0 to 10
    for (int i = 0; i < 10; i++) {
        IO.println("Friends don't lie!");
    }

    // Decrement from 0 to 10
    for (int i = 10; i > 0; i--) {
        IO.println("Mouthbreather");
    }

    // Increment from 0 to 10 by 2
    for (int i = 0; i < 10; i += 2) {
        IO.println("YOU LIEEE!");
    }

    String line = "She's our friend and she's crazy!!\n";
    for (int i = 0; i < line.length(); i++) {
        IO.print(line.charAt(i));
        Thread.sleep(50);
    }

    // Nested For Loops
    for (int i = 0; i < 5; i++) {
        for (int j = 5; j > i; j--) {
            IO.print(" ");
        }
        for (int j = 0; j <= i; j++) {
            IO.print("* ");
        }
        IO.println();
    }
}
