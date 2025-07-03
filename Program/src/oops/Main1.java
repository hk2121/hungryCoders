package oops;

class Calculator {
    // Method overloading
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result1 = calc.add(2, 3);          // Calls int add(int a, int b)
        double result2 = calc.add(2.5, 3.5);   // Calls double add(double a, double b)
        System.out.println("result:- " + result1);
    }
}
