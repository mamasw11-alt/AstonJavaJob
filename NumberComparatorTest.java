package com.example;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class NumberComparatorTest {
    @Test
    public void testCompareFirstGreater() {
        assertTrue(NumberComparator.compare(5, 3) > 0);
    }

    @Test
    public void testCompareFirstLess() {
        assertTrue(NumberComparator.compare(3, 5) < 0);
    }

    @Test
    public void testCompareEqual() {
        assertEquals(NumberComparator.compare(7, 7), 0);
    }

    @Test
    public void testCompareNegativeNumbers() {
        assertTrue(NumberComparator.compare(-1, -5) > 0);
    }
}
