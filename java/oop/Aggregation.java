void main() {

    // Aggregation - 'has-a' or loosely coupled relationship between objects
    // Object contains other object(s) as part of its structure, but they can exist independently

    Character mike = new Character(
            "Mike Wheeler",
            "Paladin",
            "Justice Strike",
            "Mike leads the charge with unwavering courage!"
    );

    Character lucas = new Character(
            "Lucas Sinclair",
            "Ranger",
            "Precision Shot",
            "Lucas fires a deadly slingshot from the shadows!"
    );

    Character dustin = new Character(
            "Dustin Henderson",
            "Bard",
            "Sonic Boom",
            "Dustin unleashes a gadget-powered soundwave that stuns the enemy!"
    );

    Character will = new Character(
            "Will Byers",
            "Cleric",
            "Sanctuary Pulse",
            "Will channels healing energy from the Upside Down to protect his friends!"
    );

    Character eleven = new Character(
            "Eleven",
            "Mage",
            "Mind Crush",
            "Eleven unleashes a telekinetic blast that shatters reality!"
    );

    Character max = new Character(
            "Max Mayfield",
            "Zoomer",
            "Skate Blitz",
            "Max speeds in with a surprise strike and vanishes before retaliation!"
    );

    // The 'Character' object works independently since it is not tied to any object
    eleven.attack("Vecna", 50);

    // The 'Campaign' requires 'Member' object, but it does not own the object
    // 'Member' object must be manually assigned to the 'Campaign' object
    Campaign upsideDown = new Campaign("Upside Down", "Demogorgons", mike, lucas, eleven, will, dustin);
    upsideDown.startAdventure();
    upsideDown.assault();
    upsideDown.defend();
}

class Character {
    String name;
    String role;
    String attackName;
    String attackMessage;

    public Character(String name, String role, String attackName, String attackMessage) {
        this.name = name;
        this.role = role;
        this.attackName = attackName;
        this.attackMessage = attackMessage;
    }

    void attack(String target, int attackDamage) {
        System.out.printf("\n⚔️ %s the %s used [%s] on %s!\n", this.name, this.role, this.attackName, target);
        System.out.println("💥 " + this.attackMessage);
        System.out.printf("🔥 Damage Dealt: [%d] — It's super effective!\n", attackDamage);
    }
}

class Campaign {
    String map;
    String enemies;
    Character[] characters;
    int maxDamage = 100;

    public Campaign(String map, String enemies, Character ... characters) {
        this.map = map;
        this.enemies = enemies;
        this.characters = characters;
    }

    void startAdventure() {
        System.out.println("\n🌍✨ *** A New Adventure Begins! *** ✨🌍");
        System.out.println("🧭 Location: " + map);
        System.out.println("🧑‍🤝‍🧑 Party Members Assembled:");
        for (Character character : this.characters) {
            System.out.printf("   ➤ %s the %s\n", character.name, character.role);
        }
        System.out.println("⚔️ Prepare yourselves — danger awaits beyond the veil!");
    }

    void assault() {
        System.out.printf("\n🚨 *** A group of %s has emerged from the shadows! *** 🚨\n", this.enemies);
        System.out.println("💥 The party springs into action!");
        for (Character character : this.characters) {
            character.attack(this.enemies, new Random().nextInt(1, 100));
        }
        maxDamage = 100;
    }

    void defend() {
        System.out.println("\n🛡️ *** The party braces for impact! ***");
        System.out.println("😨 You chose to hold your ground... but fear weakens your strike.");
        System.out.println("⚠️ Next attack will deal reduced damage due to defensive stance.");
        maxDamage = 50;
    }

}