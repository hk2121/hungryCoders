package collectionsandgenerics;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();

        //Add elements to the TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");

        //Check if an element exists
        System.out.println("Contains 'Apple' : "+ treeSet.contains("Apple")); //Contains 'Apple' : true
        //Remove an element
        treeSet.remove("Banana");

        //Iterate over the TreeSet
        System.out.println("TreeSet Elements");
        for(String fruit: treeSet){
            System.out.println(fruit);
        }
    }
}
