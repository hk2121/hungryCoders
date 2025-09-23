package collectionsandgenerics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapWithListValues {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        addValueToMap(map,"fruit","apple");
        addValueToMap(map,"fruit","banana");
        addValueToMap(map,"fruit","apple");

        System.out.println("Map: "+map);
    }

    public static void addValueToMap(Map<String, List<String>> map, String key, String value) {
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(value);    }
}
