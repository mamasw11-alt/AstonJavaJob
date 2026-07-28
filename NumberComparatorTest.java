package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberComparatorTest {
    @Test
    void testCompareFirstGreater() {
        assertTrue(NumberComparator.compare(5, 3) > 0);
    }

    @Test
    void testCompareFirstLess() {
        assertTrue(NumberComparator.compare(3, 5) < 0);
    }

    @Test
    void testCompareEqual() {
        assertEquals(0, NumberComparator.compare(7, 7));
    }

    @Test
    void testCompareNegativeNumbers() {
        assertTrue(NumberComparator.compare(-1, -5) > 0);
    }
}
