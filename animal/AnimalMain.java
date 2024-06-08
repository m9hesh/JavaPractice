package com.animal;

// Protected fields can be accessed by only subclass or same package
class Animal {

    // Protected member variable - accessible within the class and subclasses
    protected String name;

    // Protected constructor - restricts direct object creation outside the class and subclasses
    protected Animal(String name) {
        this.name = name;
    }

    // Protected method - accessible within the class and subclasses, allows for overriding
    protected void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {

    public Dog(String name) {
        // Calling the protected constructor of Animal
        super(name);
    }

    @Override
    protected void makeSound() {
        System.out.println("Woof!");
    }

    public void printName() {
        // Accessing protected member from subclass method
        System.out.println("Dog's name: " + name);
    }
}

public class AnimalMain {

    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.makeSound(); // Calling overridden method
        dog.printName(); // Accessing protected member through subclass method
    }
}

