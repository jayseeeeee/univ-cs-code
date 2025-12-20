abstract class Animal {
    public String name;

    Animal(String name) {
        this.name = name;
    }

    public void walk() {
        System.out.println();
    }
    abstract void eat();
}

interface Car {
    int fuel = 5;
    void drive();
}

class Dog extends Animal implements Car {
    Dog(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("The dog ate.");
    }

    @Override
    public void drive() {
        System.out.println("The dog walked faster.");
    }
    
}

void main() {
    Dog myDog = new Dog("Pedo");
    myDog.eat();
    myDog.walk();

    Animal myAnimal = new Animal("test") {
        void eat() {
            System.out.println("Test");
        }
    };
    myAnimal.eat();
}
