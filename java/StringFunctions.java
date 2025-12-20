void main() {
    String multiLine = """
            
            🎄❄️🎁
            IT'SSSSSSSS
            TIME!!!! 🐬🦅🐬🦅🐬🦅🐬🦅
            🎄❄️🎁
            """;
    IO.println(multiLine);

    // '\n' sets a line break cutting to the next line
    IO.print("I like Halloween");

    // '\r' resets to the first position of line
    IO.println("\rI like Christmas");

    // '\t' adds indentation
    IO.println("\t I like New Year");

    String name = "Mariah Carey";
    IO.println("\nString: " + name);

    // length - Returns the length of string
    int length = name.length();
    IO.println("Length of String: " + length);

    // charAt - Returns character at specified index
    char letter = name.charAt(0);
    IO.println("Char of Index 0 in String: " + letter);

    // indexOf - Returns position of FIRST occurence of given string
    int index = name.indexOf("C");
    IO.println("Index of 'C' in String: " + index);

    // lastIndex - Returns position of LAST occurence of given string
    int lastIndex = name.lastIndexOf("a");
    IO.println("Last Index of String: " + lastIndex);

    // upperCase - Returns an upper case version of string.
    String upperCase = name.toUpperCase();
    IO.println("Upper Case of String: " + upperCase);

    // toLowerCase - Returns a lower case version of string.
    String lowerCase = name.toLowerCase();
    IO.println("Lower Case of String: " + lowerCase);

    // replace - Replaces all target string with replacement string
    String replace = name.replace("a", "x");
    IO.println("Replaced a to x of String: " + replace);

    // contains - Returns true if it contains specified string
    boolean contains = name.contains(" ");
    IO.println("Is ' ' (space) in String? " + contains);

    // equals - Returns true if string is equal to specified string
    boolean equals = name.equals("Mariah Carey");
    IO.println("Is string equal to 'Mariah Carey'? " + equals);

    // equalsIgnoreCase - Similar to equals but ignores cases (can be caps or not)
    boolean equalsIgnoreCase = name.equalsIgnoreCase("mARIAH cAREY");
    IO.println("Is string equal (ignore case) to 'mARIAH cAREY'? " + equalsIgnoreCase);

    // matches - Returns true if string is equal to regex pattern
    boolean match = name.matches("[A-a]");
    IO.println("Is [A-a] regex a match to string? " + match);

    // subString - Returns the string from the start to end index
    String subString = name.substring(0, 6);
    IO.println("Substring of String: " + subString);

    // Example of subString
    String email = "johndoe@gmail.com";
    String username = email.substring(0, email.indexOf("@"));
    String domain = email.substring(email.indexOf("@") + 1); // If no end index is stated, it will return all string starting from the start index
    IO.println("\nEmail: " + email);
    IO.println("Username: " + username);
    IO.println("Domain: " + domain);

    // Example of Empty vs Blank
    String space = " ";
    // isEmpty - Returns true only if string length is 0
    boolean isEmpty = space.isEmpty();
    IO.println("Is space empty? " + isEmpty);
    // isBlank - Returns true if it is empty or only has white spaces
    boolean isBlank = space.isBlank();
    IO.println("Is space blank? " + isBlank);

    // trim - Removes white space of string.
    String untrimmed = "        Mariah Carey       ";
    String trim = untrimmed.trim();
    IO.println("\nUntrimmed: " + untrimmed);
    IO.println("Trimmed: " + trim);
}
