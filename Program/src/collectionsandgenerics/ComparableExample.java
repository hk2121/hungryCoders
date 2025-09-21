package collectionsandgenerics;

import java.util.*;

class Student implements Comparable<Student> {
    private String name;
    private int grade;
    private int StudentId;

    public Student(String name, int grade, int studentId) {
        this.name = name;
        this.grade = grade;
        this.StudentId = studentId;
    }
    //Getters
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getStudentId() {
        return StudentId;
    }
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.StudentId, other.StudentId);
    }
    @Override
    public String toString() {
        return String.format("%s (ID: %d, Grade: %d)", name, StudentId, grade);
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
        new Student("Alice", 85,103),
        new Student("Bob", 95,102),
        new Student("Charlie", 80,101));
        Collections.sort(students);
        students.forEach(System.out::println);
    }
}
