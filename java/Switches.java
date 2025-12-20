void main() {
    String day = "Monday";

    // Enhanced Switches - Similar to switches but BETTER
    // -> means that yield/break is not required per case

    switch (day) {

        // Can use multiple case
        case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> IO.println(" is school day!");

        // Single case
        case "Saturday" -> IO.println(" is bed-rot day!");
        case "Sunday" -> IO.println(" is family day!");

        // Use {} for multiple lines of code/when calling a method
        default -> {
            IO.println(" is not a day :(");
            IO.println("Please pick a valid day :)");
        }
    }
}
