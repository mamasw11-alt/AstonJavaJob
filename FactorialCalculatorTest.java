package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {
    @Test
    void testFactorialOfZero() {
        assertEquals(1, FactorialCalculator.factorial(0));
    }

    @Test
    void testFactorialOfOne() {
        assertEquals(1, FactorialCalculator.factorial(1));
    }

    @Test
    void testFactorialOfFive() {
        assertEquals(120, FactorialCalculator.factorial(5));
    }

    @Test
    void testFactorialOfTen() {
        assertEquals(3628800, FactorialCalculator.factorial(10));
    }

    @Test
    void testFactorialNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.factorial(-1));
    }
}
