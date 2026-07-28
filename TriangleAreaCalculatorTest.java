package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleAreaCalculatorTest {
    @Test
    void testAreaWithBaseAndHeight() {
        assertEquals(10.0, TriangleAreaCalculator.area(4, 5), 0.0001);
    }

    @Test
    void testAreaWithZeroBase() {
        assertEquals(0.0, TriangleAreaCalculator.area(0, 5), 0.0001);
    }

    @Test
    void testAreaWithZeroHeight() {
        assertEquals(0.0, TriangleAreaCalculator.area(4, 0), 0.0001);
    }

    @Test
    void testAreaWithNegativeBaseThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> TriangleAreaCalculator.area(-1, 5));
    }

    @Test
    void testAreaWithNegativeHeightThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> TriangleAreaCalculator.area(5, -1));
    }
}
