package com.example;

public class TriangleAreaCalculator {
    public static double area(double base, double height) {
        if (base < 0 || height < 0) {
            throw new IllegalArgumentException("Base and height must be non-negative");
        }
        return 0.5 * base * height;
    }
}
