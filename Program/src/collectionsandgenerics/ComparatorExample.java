package collectionsandgenerics;

import java.util.*;

class Students {
    private String name;
    private int grade;
    private int studentId;

    public Students(String name, int grade, int studentId) {
        this.name = name;
        this.grade = grade;
        this.studentId = studentId;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return String.format("%s (ID: %d, Grade: %d)", name, studentId, grade);
    }
}

// Approach 1: Separate Comparator class
class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

class GradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s2.getGrade(), s1.getGrade()); // Descending order
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 85, 103),
                new Student("Bob", 90, 101),
                new Student("Charlie", 80, 102),
                new Student("Diana", 95, 104)
        );

        System.out.println("=== Original List ===");
        students.forEach(System.out::println);

        // Approach 1: Using separate Comparator class
        System.out.println("\n=== Sorted by Name (Ascending) ===");
        Collections.sort(students, new NameComparator());
        students.forEach(System.out::println);

        // Approach 2: Lambda expression (most common in modern Java)
        System.out.println("\n=== Sorted by Grade (Descending) ===");
        students.sort((s1, s2) -> Integer.compare(s2.getGrade(), s1.getGrade()));
        students.forEach(System.out::println);

        // Approach 3: Method reference with Comparator utility methods
        System.out.println("\n=== Sorted by Student ID (Ascending) ===");
        students.sort(Comparator.comparing(Student::getStudentId));
        students.forEach(System.out::println);

        // Approach 4: Chaining comparators for complex sorting
        System.out.println("\n=== Sorted by Grade (Desc), then by Name (Asc) ===");
        students.sort(Comparator.comparing(Student::getGrade).reversed()
                .thenComparing(Student::getName));
        students.forEach(System.out::println);

        // Approach 5: Anonymous class (less common but still valid)
        System.out.println("\n=== Sorted by Name Length ===");
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getName().length(), s2.getName().length());
            }
        });
        students.forEach(System.out::println);
    }
}