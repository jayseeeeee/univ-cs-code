void main() {

    // Wrapper Classes - Allow primitive values (int, char, double, boolean) to be used as objects
    // Primitive values are wrapped as objects which allows use of 'Collections Framework' and static utility methods

    // Autoboxing - Directly assigns primitives into object through wrapper class
    Integer myInteger = 123;
    Double myDecimal = 3.14;
    Character myCharacter = '$';
    Boolean myBoolean = true;
    // Similar Pattern to:
    String myString = "Stranger Things";

    // Unboxing - Convert the wrapped object back to its primitive value
    int newInteger = myInteger;
    double newDecimal = myDecimal;
    char newCharacter = myCharacter;
    boolean newBoolean = myBoolean;

    // 'toString' method of wrapper classes converts primitive values to String
    String stringInteger = Integer.toString(123);
    String stringDouble = Double.toString(3.14);
    String stringCharacter = Character.toString('$');
    String stringBoolean = Boolean.toString(true);
    String combinedString = stringInteger + stringDouble + stringCharacter + stringBoolean;

    // Parse methods of wrapper classes converts String back to primitive vlue
    int parseInt = Integer.parseInt("123");
    double parseDouble = Double.parseDouble("3.14");
    char parseChar = "Stranger Things".charAt(0); // No built-in parse method, use 'charAt' instead
    boolean parseBoolean = Boolean.parseBoolean("tRuE"); // Returns true - Must exactly match word 'true' (not case-sensitive)
    Boolean obj = Boolean.valueOf("tRuE"); // Returns true - similar to 'parseBoolean' but returns as Boolean object

    // Other common useful methods of 'Character' wrapper class
    boolean isLetter = Character.isLetter('s'); // Check if character is a letter
    boolean isUpperCase = Character.isUpperCase('T'); // Check if character is uppercase
    boolean isDigit = Character.isDigit('5'); // Check if character is a digit
    boolean isLetterOrDigit = Character.isLetterOrDigit('A'); // Check if character is a letter or digit
    boolean isWhitespace = Character.isWhitespace(' '); // Check if character is whitespace
    boolean isLowerCase = Character.isLowerCase('g'); // Check if character is lowercase
    char upper = Character.toUpperCase('b'); // Convert character to uppercase
    char lower = Character.toLowerCase('H'); // Convert character to lowercase
    char titleCase = Character.toTitleCase('ǆ'); // Convert character to title case
}