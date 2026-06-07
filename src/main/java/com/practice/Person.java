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
        return String.format("Hello, my name is %s (%s), age %d. Adult: %b", name, initials(), age, isAdult());
    }

    public Person withBirthday() {
        return new Person(this.name, this.age + 1);
    }

    public boolean isSenior() {
        return age >= 65;
    }

    public String initials() {
        if (name == null || name.isEmpty())
            return "";
        String[] parts = name.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String p : parts) {
            if (!p.isEmpty())
                sb.append(Character.toUpperCase(p.charAt(0)));
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return String.format("Person{name='%s', age=%d}", name, age);
    }
}
