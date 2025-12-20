void main() {

    // HashMap - Data structure that stores 'key-value' pairs
    // Does not maintain any order, but is memory efficient
    HashMap<String, Integer> partyHealth = new HashMap<>();

    // 'Keys' are unique, but 'Values' can be duplicated
    // Adds or updates a key-value pair
    partyHealth.put("Mike", 100);
    partyHealth.put("Dustin", 100);
    partyHealth.put("Will", 90);
    partyHealth.put("Lucas", 72);
    partyHealth.put("Eleven", 89);
    partyHealth.put("Max", 92);

    // Removes the entry for a key
    partyHealth.remove("Will");

    // Retrieves the value for a key
    int mikeHealth = partyHealth.get("Mike");

    // Checks if key exists
    boolean containsKey = partyHealth.containsKey("Eleven");

    // Checks if value exists
    boolean containsValue = partyHealth.containsValue(100);

    // Returns number of entries
    int partySize = partyHealth.size();

    // Adds only if key is absent
    partyHealth.putIfAbsent("Will", 50);

    // Replaces value if key exists
    partyHealth.replace("Max", 1);

    // Enhanced For Loops - Iterate over map keys
    for(String key : partyHealth.keySet()){
        System.out.printf("%s health is currently at %d!", key, partyHealth.get(key));
    }

    // Removes all content
    partyHealth.clear();

    // Checks if map is empty
    boolean isEmpty = partyHealth.isEmpty();
}