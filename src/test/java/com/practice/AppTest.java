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
    public void testCalculatorMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(12, calculator.multiply(3, 4));
        assertEquals(0, calculator.multiply(7, 0));
    }

    @Test
    public void testPersonGreet() {
        Person person = new Person("Bob", 25);
        assertEquals("Hello, my name is Bob and I am 25 years old.", person.greet());
    }
}
