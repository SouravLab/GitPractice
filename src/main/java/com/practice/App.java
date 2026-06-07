package com.practice;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.add(8, 12);
        int product = calculator.multiply(8, 12);

        Person alice = new Person("Alice", 30);
        String greeting = alice.greet();

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println(greeting);
    }
}
