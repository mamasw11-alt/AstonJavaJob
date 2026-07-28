package com.example;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TriangleAreaCalculatorTest {
    @Test
    public void testAreaWithBaseAndHeight() {
        assertEquals(TriangleAreaCalculator.area(4, 5), 10.0, 0.0001);
    }

    @Test
    public void testAreaWithZeroBase() {
        assertEquals(TriangleAreaCalculator.area(0, 5), 0.0, 0.0001);
    }

    @Test
    public void testAreaWithZeroHeight() {
        assertEquals(TriangleAreaCalculator.area(4, 0), 0.0, 0.0001);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testAreaWithNegativeBaseThrowsException() {
        TriangleAreaCalculator.area(-1, 5);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testAreaWithNegativeHeightThrowsException() {
        TriangleAreaCalculator.area(5, -1);
    }
}
