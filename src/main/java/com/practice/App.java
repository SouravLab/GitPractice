
package com.practice;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.add(8, 12);
        int difference = calculator.subtract(20, 5);
        int product = calculator.multiply(8, 12);
        double quotient = calculator.divide(24, 5);
        double average = calculator.average(10, 15);
        boolean even = calculator.isEven(24);
        boolean prime = calculator.isPrime(29);
        long power = calculator.power(2, 8);
        long factorial = calculator.factorial(5);
        int fibonacci = calculator.fibonacci(7);

        Person alice = new Person("Alice", 30);
        String greeting = alice.greet();
        String birthdayMessage = alice.birthdayMessage();
        boolean isAdult = alice.isAdult();
        Address addr = new Address("London", "UK");

        int remainder = calculator.mod(10, 3);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Average: " + average);
        System.out.println("Is 24 even? " + even);
        System.out.println("Is 29 prime? " + prime);
        System.out.println("2 to power 8: " + power);
        System.out.println("Factorial of 5: " + factorial);
        System.out.println("7th Fibonacci number: " + fibonacci);
        System.out.println(greeting);
        System.out.println(birthdayMessage);
        System.out.println("Is Alice an adult? " + isAdult);
        System.out.println("Person: " + alice);
    }
}
