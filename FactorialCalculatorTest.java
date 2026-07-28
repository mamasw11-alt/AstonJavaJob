package com.example;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FactorialCalculatorTest {
    @Test
    public void testFactorialOfZero() {
        assertEquals(FactorialCalculator.factorial(0), 1);
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(FactorialCalculator.factorial(1), 1);
    }

    @Test
    public void testFactorialOfFive() {
        assertEquals(FactorialCalculator.factorial(5), 120);
    }

    @Test
    public void testFactorialOfTen() {
        assertEquals(FactorialCalculator.factorial(10), 3628800);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialNegativeThrowsException() {
        FactorialCalculator.factorial(-1);
    }
}
