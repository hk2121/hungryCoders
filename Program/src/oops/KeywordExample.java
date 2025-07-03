package oops;

// oops.StaticExample class with a static variable and method
 class StaticExample {
    // Static variable
    static int staticVariable = 10;

    // Static method
    static void staticMethod() {
        System.out.println("Inside staticMethod: staticVariable = " + staticVariable);
    }
}

// oops.AbstractExample abstract class with an abstract method
abstract class AbstractExample {
    // Abstract method (no implementation)
    abstract void abstractMethod();
}

// Concrete subclass of oops.AbstractExample
class ConcreteExample extends AbstractExample {
    // Implementation of abstract method
    void abstractMethod() {
        System.out.println("Inside abstractMethod in oops.ConcreteExample");
    }
}

// oops.FinalExample class with final variable and method
class FinalExample {
    // Final variable
    final int finalVariable = 20;

    // Final method
    final void finalMethod() {
        System.out.println("Inside finalMethod: finalVariable = " + finalVariable);
    }
}

 public class KeywordExample {
    public static void main(String[] args) {
        // Accessing static variable and method using class name
        System.out.println("Static variable: " + StaticExample.staticVariable);
        StaticExample.staticMethod();

        // Creating an instance of oops.ConcreteExample and calling abstractMethod
        ConcreteExample concrete = new ConcreteExample();
        concrete.abstractMethod();

        // Creating an instance of oops.FinalExample and accessing final variable and method
        FinalExample finalExample = new FinalExample();
        System.out.println("Final variable: " + finalExample.finalVariable);
        finalExample.finalMethod();
    }
}

//Output
/*
Static variable: 10
        Inside staticMethod: staticVariable = 10
        Inside abstractMethod in oops.ConcreteExample
        Final variable: 20
        Inside finalMethod: finalVariable = 20*/