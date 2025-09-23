package collectionsandgenerics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesWithStreams {
    public static void main(String[] args) {
        List<String> listwithDuplicates = new ArrayList<>();
        listwithDuplicates.add("apple");
        listwithDuplicates.add("mango");
        listwithDuplicates.add("pineapple");
        listwithDuplicates.add("apple");

        List<String> listWithoutDuplicates = listwithDuplicates.stream().distinct().collect(Collectors.toList());

        System.out.println("List without duplicates: "+ listWithoutDuplicates);
    }
}
