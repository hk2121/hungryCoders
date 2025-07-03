package oops;

class Animal1 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog1 extends Animal1 {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
public class OverloadingVSOverriding {
    public static void main(String[] args) {
        Animal1 animal1 = new Dog1();
        animal1.sound();

        Animal1 objAnimal = new Animal1();
        objAnimal.sound();
    }
}
