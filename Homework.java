package com.example;

import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {
        System.out.println("=== 1. printThreeWords ===");
        printThreeWords();
        
        System.out.println("\n=== 2. checkSumSign ===");
        checkSumSign();
        
        System.out.println("\n=== 3. printColor ===");
        printColor();
        
        System.out.println("\n=== 4. compareNumbers ===");
        compareNumbers();
        
        System.out.println("\n=== 5. sumInRange ===");
        System.out.println("10 + 5 = " + sumInRange(10, 5));
        System.out.println("5 + 3 = " + sumInRange(5, 3));
        
        System.out.println("\n=== 6. printPositiveNegative ===");
        printPositiveNegative(5);
        printPositiveNegative(-3);
        printPositiveNegative(0);
        
        System.out.println("\n=== 7. isNegative ===");
        System.out.println("-5: " + isNegative(-5));
        System.out.println("3: " + isNegative(3));
        System.out.println("0: " + isNegative(0));
        
        System.out.println("\n=== 8. printStringMultiple ===");
        printStringMultiple("Hello!", 3);
        
        System.out.println("\n=== 9. isLeapYear ===");
        System.out.println("2020: " + isLeapYear(2020));
        System.out.println("1900: " + isLeapYear(1900));
        System.out.println("2000: " + isLeapYear(2000));
        
        System.out.println("\n=== 10. invertArray ===");
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("До: " + Arrays.toString(arr1));
        invertArray(arr1);
        System.out.println("После: " + Arrays.toString(arr1));
        
        System.out.println("\n=== 11. fillArray ===");
        int[] arr2 = fillArray();
        System.out.println("Первые 10 элементов: " + Arrays.toString(Arrays.copyOf(arr2, 10)));
        
        System.out.println("\n=== 12. multiplyLessThanSix ===");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("До: " + Arrays.toString(arr3));
        multiplyLessThanSix(arr3);
        System.out.println("После: " + Arrays.toString(arr3));
        
        System.out.println("\n=== 13. fillDiagonal ===");
        int[][] matrix = fillDiagonal(5);
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
        
        System.out.println("\n=== 14. createArray ===");
        int[] arr4 = createArray(5, 7);
        System.out.println(Arrays.toString(arr4));
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = -3;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 50;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 7;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean sumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void printPositiveNegative(int number) {
        if (number >= 0) {
            System.out.println(number + " - положительное");
        } else {
            System.out.println(number + " - отрицательное");
        }
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void printStringMultiple(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
        }
    }

    public static int[] fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    public static void multiplyLessThanSix(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

    public static int[][] fillDiagonal(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[i][size - 1 - i] = 1;
        }
        return matrix;
    }

    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
