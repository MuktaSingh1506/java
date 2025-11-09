package assignment3;

public class constructorChaining1 {
     public static void main(String[] args) {
        Human human = new Human(); // Object creation

        // Accessing methods from all levels
        human.eat();   // From Animal
        human.walk();  // From Mammal
        human.speak(); // From Human
    }
}
// Base class
class Animal {
    Animal() {
        System.out.println("Animal constructor called.");
    }

    void eat() {
        System.out.println("Animal eats food.");
    }
}

// Derived class from Animal
class Mammal extends Animal {
    Mammal() {
        System.out.println("Mammal constructor called.");
    }

    void walk() {
        System.out.println("Mammal walks on legs.");
    }
}

// Derived class from Mammal
class Human extends Mammal {
    Human() {
        System.out.println("Human constructor called.");
    }

    void speak() {
        System.out.println("Human speaks.");
    }
}

