void main() {
    // Ternary Operators (?) - Simpler version of If Statements

    int score = 75;
    String status;

    // If Statement
    if (score >= 75) {
        status = "Passed";
    } else {
        status = "Failed";
    }

    // Ternary Operators
    status = (score >= 75) ? "Passed" : "Failed";
    IO.println(status);
}
