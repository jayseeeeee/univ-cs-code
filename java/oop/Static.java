void main() {

    // Static - Makes a variable or method belong or tied to the class itself rather than any object
    // Used for utility methods or shared resources

    Party mike = new Party("Michael Wheeler");
    Party dustin = new Party("Dustin Henderson");
    Party lucas = new Party("Lucas Sinclair");
    Party will = new Party("William Byers");

    Party.getPartySize();
}

//  Static Class - This allows the class to be called without instantiating outer class
static class Party {

    //  Static Variable - This is shared across all objects and the class itself
    //  Any modification to this will reflect across objects and the class
    static int partySize;
    String name;

    Party(String name){
        this.name = name;
        partySize++;
    }

    //  Static Method - Can be directly accessed through class and not object
    //  'this' is not required and this can only access static data
    static void getPartySize() {
        System.out.println("You have " + partySize + " total friends");
    }
}