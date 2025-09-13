package collectionsandgenerics;

import java.util.*;

public class CollectionutilityDemo {
    public static void main(String[] args) {
        //Example List of characters
        List<String> cricketers = Arrays.asList(
                "AK", "BK", "CK", "DKk", "EK", "FK", "GK", "HK");

        //Sorting alphabetically by default(natural ordering)
//        Collections.sort(cricketers);
//        cricketers.forEach(System.out::println);

        // custom sorting by length of name
//        Collections.sort(cricketers, Comparator.comparingInt(String::length));
//        cricketers.forEach(System.out::println);

        // sorting in descending order
//        cricketers.sort(Collections.reverseOrder());
//        cricketers.forEach(System.out::println);

        // Binary Search
//        Collections.sort(cricketers);
//        cricketers.forEach(System.out::println);
//        int index = Collections.binarySearch(cricketers,"GK");
//        System.out.println(index);

        // Reversing the List
//        Collections.reverse(cricketers);
//        cricketers.forEach(System.out::println);

        // Shuffling the List
//        Collections.shuffle(cricketers);
//        cricketers.forEach(System.out::println);

        // Swapping elements
//        Collections.swap(cricketers,0,cricketers.size()-1);
//        cricketers.forEach(System.out::println);

        // Creating an unmodifiable collection
//        List<String> unModifiableList = Collections.unmodifiableList(cricketers);
//        unModifiableList.forEach(System.out::println);

//        Finding max and min by Custom Comparator (E.g. Longest And Shortest names)
//        String longestName = Collections.max(cricketers,Comparator.comparingInt(String::length));
//        String shortestName = Collections.min(cricketers,Comparator.comparingInt(String::length));
//        System.out.println(longestName);
//        System.out.println(shortestName);

        //Frequency of an element
//        int frequency = Collections.frequency(cricketers,"AK");
//        System.out.println(frequency);

        //Disjoint : Check if two lists have no elements in common
//        List<String> newCricketers = Arrays.asList("HK","FK");
//        boolean noCommonElements = Collections.disjoint(cricketers , newCricketers);
//        System.out.println(noCommonElements);

        // copying contents from one list to another
//        List<String> copyCricketers = new ArrayList<>(Collections.nCopies(cricketers.size(),""));
//        Collections.copy(copyCricketers,cricketers);
//        cricketers.forEach(System.out::println);

        // replacing all elements with a single value
//        Collections.fill(cricketers,"Test Fill Method");
//        cricketers.forEach(System.out::println);

        //Synchronized Collection
        Collection<String> synchronizedCollection = Collections.synchronizedCollection(new ArrayList<>(cricketers));
        synchronizedCollection.forEach(System.out::println);



    }
}
