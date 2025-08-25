package com.eng.corejava.test;

public class Student {
    //properties/fields/instance variable & behavior
    private String name;
    private int rollNumber;
    private int age;

    public void setAge(int Age) {
        if (age < 0) {
            age = 0;
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getAge() {
        return this.age;
    }
}
