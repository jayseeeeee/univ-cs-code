void main() {

    // Composition - 'part-of' or tightly coupled relationship between objects.
    // Object own other object(s), it cannot exist without the other and lives dependently

    // 'MindFlayer' object automatically creates 'HiveMind' object
    MindFlayer mindFlayer = new MindFlayer(
            "Vecna",
            67
    );

    // The 'HiveMind' object works dependently, and it is tied to 'HiveMind' object
    // This object is owned and automatically created by the 'HiveMind' object
    HiveMind hiveMind = mindFlayer.hiveMind;
    hiveMind.relayCommand("⚠️Command issued: Attack the Hawkins Lab with Demodogs!");
    hiveMind.sendHorde("🦇 Demobats lunge forward, their petal-maws bristling with jagged teeth, eager to devour!", "Eleven", 15);

    mindFlayer.possess("Will");
    mindFlayer.attack("Billy");
    mindFlayer.relayCommand("🔗 Dissolve into a meat-slob and become part of my army!");
    mindFlayer.sendHorde("👹 Demogorgons swarm slicing through the air like living blades!", "Hopper");
}

class HiveMind {
    String host;
    int flayedCount;

    HiveMind(String host) {
        this.host = host;
        this.flayedCount = 0;
    }

    void relayCommand(String command) {
        System.out.printf("\n👁️ %s communicates telepathically and the hive mind receives:\n  >> %s\n", this.host, command);
    }

    void sendHorde(String attackMessage, String target, int attackDamage) {
        System.out.println("\n" + attackMessage);
        System.out.printf("⚔️ The horde assails %s, inflicting %d damage! A crushing blow!\n", target, attackDamage);
    }
}

class MindFlayer {
    int maxDamage;
    HiveMind hiveMind;

    MindFlayer(String host, int maxDamage) {
        this.maxDamage = maxDamage;
        this.hiveMind = new HiveMind(host);
    }

    void possess(String name) {
        hiveMind.flayedCount++;
        System.out.printf("\n👁️ The Mind Flayer has seized control of %s, bending them to its will!\n", name);
        System.out.printf("🩸 Total Flayed count rises to %d...\n", hiveMind.flayedCount);
    }

    void attack(String target) {
        System.out.printf("\n👁️ The Mind Flayer lashes out at %s with its grotesque flesh-form!\n", target);
        System.out.printf("💥 The strike inflicts %d damage! The Upside Down’s power surges!\n", new Random().nextInt(1, maxDamage));
    }

    void relayCommand(String command) {
        this.hiveMind.relayCommand(command);
        System.out.println("🔗 The Hive Mind reverberates with the command... the Mind Flayer obeys!");
    }

    void sendHorde(String attackMessage, String target) {
        System.out.print("\n⚠️ The Mind Flayer falters, but summons its Hive Mind for reinforcements!");
        this.hiveMind.sendHorde(attackMessage, target, new Random().nextInt(1, maxDamage));
    }
}