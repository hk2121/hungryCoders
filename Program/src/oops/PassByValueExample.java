package oops;

public class PassByValueExample {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Before calling modifyValue: num = " + num);

        // Passing a primitive type (int) by value
        modifyValue(num);

        System.out.println("After calling modifyValue: num = " + num);

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Before calling modifyReference: sb = " + sb);

        // Passing an object (StringBuilder) by value (passing reference by value)
        modifyReference(sb);

        System.out.println("After calling modifyReference: sb = " + sb);
    }

    // Method to modify a primitive value
    public static void modifyValue(int num) {
        num += 5;
        System.out.println("Inside modifyValue: num = " + num);
    }

    // Method to modify an object reference
    public static void modifyReference(StringBuilder sb) {
        sb.append(" World");
        System.out.println("Inside modifyReference: sb = " + sb);
    }
}

//Output
//Before calling modifyValue: num = 10
//Inside modifyValue: num = 15
//After calling modifyValue: num = 10
//Before calling modifyReference: sb = Hello
//Inside modifyReference: sb = Hello World
//After calling modifyReference: sb = Hello World


