void main() {

    // Anonymous class - Unnamed inner classes that extends the instantiated class

    // Add custom behavior or implementation without having to create new class but cannot be reused
    Telekinesis eleven = new Telekinesis("Eleven", 100) {
        int energy = 100;

        // This method is invisible and cannot be accessed outside of this class
        void drain() {
            System.out.printf("⚠️ Psychic strain increasing [%d]. Maintain focus, El.\n", energy);
            energy -= 25;
        }

        @Override
        void displace(String target) {
            System.out.printf("\n🌠 %s's eyes blaze with fury — a shockwave erupts from her mind!", this.name);
            super.displace(target);
            drain();
        }

        @Override
        void attack(String target) {
            IO.println("\n⚡ Eleven’s eyes blaze — a shockwave erupts from her mind!");
            System.out.printf("🌪️ %s is hurled backward by raw force, taking [%d] HP damage from the impact!\n", target, new Random().nextInt(1, this.damage));
            drain();
        }
    };

    Telekinesis vecna = new Telekinesis("Vecna", 99) {
        @Override
        void displace(String target) {
            IO.println("\n🕷️ Vecna extends his clawed hand — shadows coil and reality fractures.");
            super.displace(target);
        }

        @Override
        void attack(String target) {
            IO.println("\n🕷️ Vecna’s hand rises — shadows twist and the air fractures.");
            System.out.printf("🩸 %s is violently lifted and crushed midair, losing [%d] HP psychic onslaught!", target, new Random().nextInt(1, this.damage));}
    };

    Telepathy will = new Telepathy() {
        @Override
        public void spy() {
            IO.println("\n🕶️ Will Byers slips through the shadows, unseen and unheard.");
            IO.println("🧠 Psychic interference detected — Will’s connection pulses with hidden knowledge.");
        }
    };

    Telepathy demogorgon = new Telepathy() {
        @Override
        public void spy() {
            IO.println("\n🩸 The Demogorgon bursts from the shadows, jaws wide and claws gleaming.");
            IO.println("🌑 The air reeks of blood and decay as the beast vanishes into the dark.");
        }
    };

    eleven.displace("Vecna");
    eleven.attack("Vecna");
    vecna.displace("Eleven");
    vecna.attack("Eleven");
    will.spy();
    demogorgon.spy();
}

// Often used in interface or abstract class for one time use (TimerTask, Runnable, Callbacks)
abstract class Telekinesis {
    String name;
    int damage;

    public Telekinesis(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    void displace(String target) {
        System.out.printf("\n⚡ %s unleashed a telekinetic blast, hurling %s backward with immense force!\n", this.name, target);
        System.out.printf("💥 %s is stunned and vulnerable — damage output reduced by [%d] AT.\n", target, new Random().nextInt(1, damage));
    }

    abstract void attack(String target);
}

interface Telepathy {
    void spy();
}
