void main() {
    // Exception - Event that interrupts the flow of program
    // Surround risky code with 'try' and 'catch' block

    // Best practice to catch several exception for better detail
    try {
        int dividend  = Integer.parseInt(IO.readln("Enter the dividend: "));
        int divisor = Integer.parseInt(IO.readln("Enter the divisor: "));
        IO.println("Quotient: " + (dividend / divisor));
    } catch(ArithmeticException e) {
        IO.println(e);
        IO.println("Error: You cannot divide by zero (0)");
    } catch (NumberFormatException e) {
        IO.println(e);
        IO.println("Error: Input is not a number");
    } catch (Exception e) { // Catches other errors
        IO.println(e);
        IO.println("Error: Something went wrong");
    } finally { // Always executes even with exception
        IO.println("Thank you for using division calculator!");
    }

    // 'try-with-resources' - Automatically handles objects with 'AutoCloseable' interface to close resources after use
    try (Scanner scanner = new Scanner(System.in)) {
        int myInt = scanner.nextInt();
    } catch (Exception e) {
        System.out.println(e);
    }
}