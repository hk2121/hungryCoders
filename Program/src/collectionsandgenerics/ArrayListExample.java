package collectionsandgenerics;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        //Create an ArrayList
        List<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        // Access elements by index
        System.out.println("Element at index 1: "+ arrayList.get(1)); // Element at index 1: Banana

        // Iterate through the ArrayList
        System.out.println("ArrayList elements:");
        for(String fruit: arrayList){
            System.out.println(fruit);
        }

        // Remove an element
        arrayList.remove(1); // Removes "Banana"
        System.out.println("after removal:");
        for(String fruit : arrayList){
            System.out.println(fruit);
        }
    }
}
