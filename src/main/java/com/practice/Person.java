package com.practice;

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public String greet() {
        return "Hello — resolved!";
    }

    public String birthdayMessage() {
        return String.format("Happy birthday, %s! You are now %d years old.", name, age);
    }

    @Override
    public String toString() {
        return String.format("Person{name='%s', age=%d}", name, age);
    }
}
