void main() {

    // Polymorphism - 'Poly' means many and 'Morph' means shape
    // Objects of subclasses can be referenced by their superclass type — this is polymorphism
    Spellcaster vecna = new Spellcaster("Henry Creel");
    Demogorgon dart = new Demogorgon("D'Artagnan");
    Flayed billy = new Flayed("William Hargrove");

    // Runtime polymorphism - Method is decided at runtime based on actual type of object
    Monster tom = new Flayed("Tom Holloway");
    Monster bruce = new Flayed("Bruce Lowe");
    Telepathy heather = new Spellcaster("Heather Holloway");
    Telepathy driscoll = new Flayed("Doris Driscoll");

    // Superclasses and interfaces can operate on their derived types
    Monster[] monsters = {vecna, dart, billy};
    Telepathy[] telepathy = {vecna, dart, billy};

    tom.attack("Jonathan Byers");
    bruce.attack("Nancy Wheeler");
    heather.communicate();
    driscoll.communicate();

    for (Monster monster : monsters) {
        monster.attack("Eleven");
    }

    for (Telepathy t : telepathy) {
        t.communicate();
    }
}

// Objects that inherit the 'Monster' class can also identify as its object
class Spellcaster extends Monster implements Telepathy {
    Spellcaster(String name) {
        super(name);
    }

    @Override
    void attack(String target) {
        System.out.printf("\n%s psychic grips %s causing their blood vessels to burst and bones to snap!\n", this.name, target);
    }
}

class Demogorgon extends Monster implements Telepathy {
    Demogorgon(String name) {
        super(name);
    }

    @Override
    void attack(String target) {
        System.out.printf("\n%s lunges towards %s, claws slicing, along with its petal-like maw!\n", this.name, target);
    }
}

class Flayed extends Monster implements Telepathy {
    Flayed(String name) {
        super(name);
    }

    @Override
    void attack(String target) {
        System.out.printf("\n%s strikes %s with flayed strength, grabbing them with choking force!\n", this.name, target);
    }
}

// Objects under subclass of 'Monster' are also its objects
abstract class Monster {
    String name;

    Monster(String name) {
        this.name = name;
    }

    abstract void attack(String target);
}

// Objects that implement the 'Telepathy' interface can identify with the interface.
interface Telepathy {
    default void communicate() {
        IO.println("\nThe Upside Down pulses with senses with shrieks and the Mindflayer responds, flooding its hive with dark psychic commands.");
    }
}