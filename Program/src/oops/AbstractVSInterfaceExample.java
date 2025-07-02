package oops;

// Abstract class
abstract class Animal2 {
    private String name;

    // Constructor in abstract class
    public Animal2(String name) {
        this.name = name;
    }

    // Abstract method (no implementation)
    public abstract void makeSound();

    // Concrete method
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Interface with abstract methods and default method
interface Pet {
    // Abstract method
    void play();

    // Default method (concrete method)
    default void beFriendly() {
        System.out.println("Being friendly.");
    }

    // Static method (concrete method)
    static void showAffection() {
        System.out.println("Showing affection.");
    }
}

// Class that extends abstract class and implements interface
class Dog2 extends Animal2 implements Pet {
    public Dog2(String name) {
        super(name); // Call the constructor of the abstract class
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing.");
    }
}


public class AbstractVSInterfaceExample {
    public static void main(String[] args) {
        Dog2 myDog2 = new Dog2("Buddy");
        myDog2.makeSound(); // Dog barks.
        myDog2.sleep(); // Buddy is sleeping.
        myDog2.play(); // Dog is playing.
        myDog2.beFriendly(); // Being friendly.

        Pet.showAffection(); // Showing affection.
    }
}
