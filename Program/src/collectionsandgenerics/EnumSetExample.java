package collectionsandgenerics;

import java.util.EnumSet;

enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
public class EnumSetExample {
    public static void main(String[] args) {
        EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
        System.out.println("Weekend days: " + weekend);

        EnumSet<Day> workdays = EnumSet.range(Day.MONDAY,Day.FRIDAY);
        System.out.println("Workdays: " + workdays);

        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
        System.out.println("Weekend days: " + weekend);
    }
}
