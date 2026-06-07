package com.practice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void testCalculatorAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-2, 2));
    }

    @Test
    public void testCalculatorSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(15, calculator.subtract(20, 5));
        assertEquals(-4, calculator.subtract(1, 5));
    }

    @Test
    public void testCalculatorMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(12, calculator.multiply(3, 4));
        assertEquals(0, calculator.multiply(7, 0));
    }

    @Test
    public void testCalculatorDivide() {
        Calculator calculator = new Calculator();
        assertEquals(4.8, calculator.divide(24, 5));
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
    }

    @Test
    public void testCalculatorAverage() {
        Calculator calculator = new Calculator();
        assertEquals(12.5, calculator.average(10, 15));
    }

    @Test
    public void testCalculatorIsPrime() {
        Calculator calculator = new Calculator();
        assertTrue(calculator.isPrime(29));
        assertFalse(calculator.isPrime(30));
    }

    @Test
    public void testPersonGreet() {
        Person person = new Person("Bob", 25);
        assertEquals("Hello, my name is Bob and I am 25 years old.", person.greet());
    }

    @Test
    public void testPersonIsAdultAndBirthdayMessage() {
        Person person = new Person("Bob", 25);
        assertTrue(person.isAdult());
        assertEquals("Happy birthday, Bob! You are now 25 years old.", person.birthdayMessage());
        assertEquals("Person{name='Bob', age=25}", person.toString());
    }
}
