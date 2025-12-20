void main() {
    // ArrayList = A resizeable array that stores objects or primitives with autoboxing
    // Arrays are fixed in size, while ArrayLists are dynamic/changeable

    // Initialize the object type of ArrayList with '<>'
    ArrayList<Integer> grades = new ArrayList<>();
    ArrayList<String> party = new ArrayList<>();

    // Add elements
    party.add("Mike");
    party.add("Dustin");
    party.add("Lucas");
    party.add("Will");
    party.add("Eleven");
    party.add("Max");

    grades.add(97);
    grades.add(97);
    grades.add(96);
    grades.add(93);
    grades.add(98);

    // Remove elements
    party.remove("Will"); // Remove by object
    party.remove(1); // Remove by index
    grades.remove(Integer.valueOf(98)); // Remove primitive data

    // Replace element at index
    party.set(2, "Jane"); // Replaces "Eleven" with "Jane"
    grades.set(2, 99); // Replaces 96 with 99

    // Get element by index
    String myName = party.get(4); // Returns "Jane"
    int myGrade = grades.get(1); // Returns 97

    // Get size of ArrayList
    int partySize = party.size();
    int gradesSize = grades.size();

    // Check if ArrayList contains an element
    boolean hasLucas = party.contains("Lucas");
    boolean hasGrade97 = grades.contains(97);

    // Find index of an element
    int indexOfDustin = party.indexOf("Dustin");
    int lastIndexOf97 = grades.lastIndexOf(97);

    // Clear all elements
    // party.clear();

    // Check if ArrayList is empty
    boolean isPartyEmpty = party.isEmpty();
    boolean isGradesEmpty = grades.isEmpty();

    // Convert ArrayList to array, 0 as array size sets size automatically
    String[] partyArray = party.toArray(new String[0]);
    Integer[] gradeArray = grades.toArray(new Integer[0]);

    // Collections - Methods that work with ArrayList
    // Sort the list
    Collections.sort(party);
    Collections.sort(grades);

    // Reverse the list
    Collections.reverse(party);
    Collections.reverse(grades);

    // Shuffle the list randomly
    Collections.shuffle(party);
    Collections.shuffle(grades);

    // Max and min
    int maxGrade = Collections.max(grades);
    int minGrade = Collections.min(grades);

    // Loop through ArrayList
    for (String member : party) {
        IO.println("Member: " + member);
    }

    for (int grade : grades) {
        IO.println("Grade: " + grade);
    }
}