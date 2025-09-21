package collectionsandgenerics;

import java.util.EnumMap;

enum Days{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class EnumMapExample {
    public static void main(String[] args) {
        EnumMap<Day,String> activityMap = new EnumMap<>(Day.class);
        activityMap.put(Day.MONDAY,"GYM");
        activityMap.put(Day.TUESDAY,"Swimming");
        activityMap.put(Day.SATURDAY,"Running");

        for(Day day : Day.values()){
            System.out.println(day + " :" + activityMap.getOrDefault(day,"No activity"));
        }

    }
}
