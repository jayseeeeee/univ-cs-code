void main() {
    // Array - A reference data type that can store more than one value

    // Creates new string array then pre-initialize values automatically
    String[] party = {"Eleven", "Max", "Mike", "Lucas", "Dustin", "Erica"};

    // Creates new empty string array with size of 5
    // Using {} with no value makes the size 0
    String[] teens = new String[5];
    teens[0] = "Nancy";
    teens[1] = "Jonathan";
    teens[2] = "Steve";
    teens[3] = "Robin";
    teens[4] = "Eddie";

    // array[i] - Get object from index
    String myFavMember = party[0];
    IO.println("My Favorite Member from the Party is: " + myFavMember);

    // length - Get total size of array
    int partySize = party.length;
    IO.println("Total Size of the Party is: " + partySize);

    // Arrays.sort - Built-in method from Arrays class to sort array based on letter/number
    Arrays.sort(party);

    // Standard For Loop - Standard way of getting each value from array
    IO.println("\nALL MEMBERS OF THE PARTY:");
    for (int i = 0; i < 5; i++) {
        IO.println(party[i]);
    }

    // Enhanced For Loop - Better way of getting each value from array
    IO.println("\nALL ADULT TEEN:");
    for (String character : teens) {
        IO.println(character);
    }


    // 2D ARRAY

    // An array where the element is also an array
    String[][] characters = {teens, party};

    // Another way of initializing a 2D array
    String[][] adults = {
            {"Murray", "Hopper", "Joyce", "Karen"},
            {"Papa", "Vecna", "Sullivan", "Grigori"}
    };

    // This will show as 2 since there is 2 arrays inside the 'adults' array
    int adultDivisions = adults.length;
    IO.println("\nThe number of adult divisions are: " + adultDivisions);

    // Initializing an empty 2D array
    String[][] monsters = new String[2][2];
    monsters[0][0] = "Vecna";
    monsters[0][1] = "Mind Flayer";
    monsters[1][0] = "Demogorgon";
    monsters[1][1] = "Demobats";

    // Accessing all element in 2D array
    IO.println("\nALL CHARACTERS FROM STRANGER THINGS:");
    for (String[] character : characters) {
        for (String person : character) {
            IO.print(person + " ");
        }
        IO.println();
    }
}
