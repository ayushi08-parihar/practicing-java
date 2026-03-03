// Base class
class Animal {
    String name;

    void makeSound() {
        System.out.println("Some sound...");
    }
}

// Subclass
class Dog extends Animal {
    
    void makeSound() {
        System.out.println("Bark! Bark!");
    }
}

// Main class
public class Override {
    public static void main(String[] args) {

        Dog dog = new Dog();

        // Setting the name
        dog.name = "Rocxy";

        // Calling overridden method
        dog.makeSound();

        // Printing dog's name
        System.out.println("Dog's Name: " + dog.name);
    }
}