package com.example;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ArithmeticCalculatorTest {
    @Test
    public void testAdd() {
        assertEquals(ArithmeticCalculator.add(3, 4), 7);
        assertEquals(ArithmeticCalculator.add(-3, 2), -1);
        assertEquals(ArithmeticCalculator.add(0, 0), 0);
    }

    @Test
    public void testSubtract() {
        assertEquals(ArithmeticCalculator.subtract(5, 3), 2);
        assertEquals(ArithmeticCalculator.subtract(-3, 2), -5);
        assertEquals(ArithmeticCalculator.subtract(7, 7), 0);
    }

    @Test
    public void testMultiply() {
        assertEquals(ArithmeticCalculator.multiply(3, 4), 12);
        assertEquals(ArithmeticCalculator.multiply(-2, 3), -6);
        assertEquals(ArithmeticCalculator.multiply(5, 0), 0);
    }

    @Test
    public void testDivide() {
        assertEquals(ArithmeticCalculator.divide(10, 5), 2.0, 0.0001);
        assertEquals(ArithmeticCalculator.divide(-3, 2), -1.5, 0.0001);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZeroThrowsException() {
        ArithmeticCalculator.divide(10, 0);
    }
}
