package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticCalculatorTest {
    @Test
    void testAdd() {
        assertEquals(7, ArithmeticCalculator.add(3, 4));
        assertEquals(-1, ArithmeticCalculator.add(-3, 2));
        assertEquals(0, ArithmeticCalculator.add(0, 0));
    }

    @Test
    void testSubtract() {
        assertEquals(2, ArithmeticCalculator.subtract(5, 3));
        assertEquals(-5, ArithmeticCalculator.subtract(-3, 2));
        assertEquals(0, ArithmeticCalculator.subtract(7, 7));
    }

    @Test
    void testMultiply() {
        assertEquals(12, ArithmeticCalculator.multiply(3, 4));
        assertEquals(-6, ArithmeticCalculator.multiply(-2, 3));
        assertEquals(0, ArithmeticCalculator.multiply(5, 0));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, ArithmeticCalculator.divide(10, 5), 0.0001);
        assertEquals(-1.5, ArithmeticCalculator.divide(-3, 2), 0.0001);
    }

    @Test
    void testDivideByZeroThrowsException() {
        assertThrows(ArithmeticException.class, () -> ArithmeticCalculator.divide(10, 0));
    }
}
