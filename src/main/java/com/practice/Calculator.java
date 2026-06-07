package com.practice;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    public double average(int a, int b) {
        return (a + b) / 2.0;
    }

    public boolean isEven(int value) {
        return value % 2 == 0;
    }

    public boolean isPrime(int value) {
        if (value <= 1) {
            return false;
        }
        if (value == 2) {
            return true;
        }
        if (value % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(value); i += 2) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}
