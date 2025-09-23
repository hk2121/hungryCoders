package collectionsandgenerics;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println(map);

        map.forEach((key, value) -> System.out.println(key + " : " + value));
        ;
    }
}
