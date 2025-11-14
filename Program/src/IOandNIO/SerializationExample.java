package IOandNIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Step 1: Make the class serializable
class Person implements Serializable{
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class SerializationExample {
    public static void main(String[] args) {
        Person person = new Person("Alice",30);
        try(FileOutputStream fileOut = new FileOutputStream("Person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            // step 3: Write the object
            out.writeObject(person);
            System.out.println("Serialized data is saved in Person.ser");
        } catch(IOException i){
            i.printStackTrace();
        }

    }
}
