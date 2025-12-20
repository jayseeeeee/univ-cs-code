void main() {

    // Enums (Enumerations) - Special class that defines a fixed set of constants
    // They improve code readability and reliability

    Party leader = null;
    Party[] campaignMembers = new Party[0]; // Enums works with array

    // Enhanced For Loops - Iterate all enum constants
    IO.println("🛡️🧙‍♀️ List of Party Members ⚔️🐉");
    for (Party member : Party.values()) {
        IO.println(member);
    }

    try {
        // Access enum values with String through 'valueOf'
        // Value must match exactly
        leader = Party.valueOf(IO.readln("[1] Pick the party leader: "));
        campaignMembers = new Party[]{
                Party.valueOf(IO.readln("[2] Pick the first member: ")),
                Party.valueOf(IO.readln("[3] Pick the last member: "))
        };
    } catch (IllegalArgumentException e) {
        IO.println("Error: Pick a valid member!");
        main();
    }

    // Enums are more efficient with switches than Strings
    switch (leader) {
        case Mike, Lucas -> {
            IO.println("Girls are different species!");
        }
        case Max, Eleven -> IO.println("Boyfriends lie... all... the... time!");
        case Will -> IO.println("Can we please play D&D now?");
        case Dustin -> IO.println("I intercepted a secret russian communication...");
        default -> IO.println("Error: Selected person does not exist in party.");
    }

    // Specialized Set for Enum
    EnumSet<Party> currentParty = EnumSet.of(Party.Mike, Party.Dustin, Party.Eleven, Party.Max, Party.Lucas, Party.Will);;

    // Enhanced For Loops - Iterate over enum array
    for (Party member : currentParty) {
        member.travel("Upside Down", "Demogorgons");
    }

    // Enhanced For Loops - Iterate over 'EnumSets'
    for (Party member : campaignMembers) {
        member.attack();
        member.heal("Eggo Waffles", 15);
    }

    // Specialized Map for Enum
    EnumMap<Party, String> status = new EnumMap<>(Party.class);
    status.put(Party.Max, "Comatose");
    status.put(Party.Eleven, "Drained");
    status.put(Party.Will, "Possessed");

    // Enhanced For Loops - Iterate over 'EnumMap'
    for (Party member : status.keySet()) {
        System.out.printf("❤️‍🩹 %s current status after the battle: %s\n", member, status.get(member));
    }
}

enum Party implements Campaign {
    // Define enum with fixed constants - Acts like variable and constructor
    Eleven(98) { // Supports anonymous class
        int health = 100;

        @Override
        void attack() {
            System.out.printf("⚔️ Eleven unleashed her telekinetic rage to deal [%d] AT! This drained her life force by [25] HP.\n", this.damage);
            health -= 25;
        }
    },
    Will(94) {
        @Override
        void attack() {
            System.out.printf("⚔️ Will summoned the shadows of the Upside Down, dealing [%d] AT! The darkness obeyed him now.\n", this.damage);
        }
    },
    Mike(62) {
        @Override
        void attack() {
            System.out.printf("⚔️ Mike rallied the team with a strategic shout, dealing [%d] AT! The enemy’s morale crumbled under his leadership.\n", this.damage);
        }
    },
    Dustin(62) {
        @Override
        void attack() {
            System.out.printf("⚔️ Dustin deployed a homemade sonic trap, dealing [%d] AT! It was surprisingly effective—science wins again!\n", this.damage);
        }
    },
    Lucas(82) {
        @Override
        void attack() {
            System.out.printf("⚔️ Lucas fired a precision slingshot strike, dealing [%d] AT! Direct hit—he never misses when it counts.\n", this.damage);
        }
    },
    Max(74) {
        @Override
        void attack() {
            System.out.printf("⚔️ Max charged in with fearless fury and a flying kick, dealing [%d] AT! Her rage was unstoppable.\n", this.damage);
        }
    };

    final int damage;

    Party(int damage) {
        this.damage = damage;
    }

    // Abstract methods can be overridden in the enum class or each constant
    abstract void attack();

    @Override
    public void travel(String map, String enemy) {
        System.out.printf("🎯 %s navigated %s and targeted the domain of %s for removal!\n", this, map, enemy);
    }

    // Global methods for all constant
    void heal(String food, int hp) {
        System.out.printf("\n🍪 %s delicately consumed %s, restoring [%d] HP! A gentle glow surrounds them.\n", this, food, hp);
    }
}

interface Campaign {
    void travel(String map, String enemy);
}