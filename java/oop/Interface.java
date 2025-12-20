void main() {
    Spellcaster vecna = new Spellcaster("Henry Creel");
    Superhero eleven = new Superhero("Jane Hopper");
    Spy will = new Spy("Will the Wise");

    Telekinesis.control("Maxine Mayfield", vecna.name);
    vecna.combat("Chrissy Cunningham");
    vecna.communicate("William, you are going to help me. One. Last. Time.");
    vecna.cast("Fred Benson");

    Telekinesis.control("Vecna", "Eleven");
    eleven.combat("Demogorgon");

    will.communicate("The humans are at the Hawkins Lab!");
    will.cast("Demogorgon");
}

// Interface - A blueprint/contract implemented by a class that specifies a set of methods
// The subclass must define these methods similar to 'abstract'

// Supports multiple inheritance-like behavior.
class Spellcaster implements Telepathy, Telekinesis {
    String name;

    Spellcaster(String name) {
        this.name = name;
    }

    @Override
    public void combat(String target) {
        System.out.printf("\n%s completely absorbs the soul and mind off %s!\n", this.name, target);
    }

    @Override
    public void cast(String target) {
        System.out.printf("\n%s cursed %s with Vecna's curse!\n", this.name, target);
    }
}

class Superhero implements Telekinesis {
    String name;

    Superhero(String name) {
        this.name = name;
    }

    public void combat(String target) {
        System.out.printf("\n%s starts their psychic blast disintegration at %s!\n", this.name, target);
    }
}

class Spy implements Telepathy {
    String name;

    Spy(String name) {
        this.name = name;
    }

    @Override
    public void cast(String target) {
        System.out.printf("\n%s casted his green cabbage fireballs towards %s!\n", this.name, target);
    }
}

interface Telekinesis {
    // Standard static method but cannot not be inherited to subclass
    // Objects that implement do not have static method
    static void control(String target, String origin) {
        System.out.printf("\nOh no! %s has been immobilized and lifted off the ground by %s!\n", target, origin);
    }

    void combat(String target);
}

interface Telepathy {
    // Fields in interface can only be 'constant'
    String connection = "Mindflayer"; // Automatically assigns 'public', 'static', and 'final'

    // 'default' - Similar to standard concrete method from 'abstract class'
    default void communicate(String message) {
        System.out.printf("""
        
        🧠 [Hive Mind Link Established]
        ::::Echoing through the Upside Down::::"
        » %s
        🧠 [::::....Mindflayer Response Received....::::]
        """, message);
    }

    void cast(String target); // Automatically assigns 'public' and 'abstract'
}