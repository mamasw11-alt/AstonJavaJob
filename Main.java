public class Main {
    public static void main(String[] args) {
        System.out.println("========== ЧАСТЬ 1: Обработка массива ==========\n");
        
        // Тест 1: Корректный массив
        System.out.println("--- Тест 1: Корректный массив ---");
        String[][] validArray = {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}
        };
        processArray(validArray);
        
        // Тест 2: Массив с некорректными данными
        System.out.println("\n--- Тест 2: Массив с некорректными данными ---");
        String[][] invalidDataArray = {
            {"1", "2", "3", "4"},
            {"5", "abc", "7", "8"},  // ошибка в ячейке [1][1]
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}
        };
        processArray(invalidDataArray);
        
        // Тест 3: Массив неправильного размера
        System.out.println("\n--- Тест 3: Массив неправильного размера ---");
        String[][] wrongSizeArray = {
            {"1", "2", "3"},
            {"4", "5", "6"},
            {"7", "8", "9"}
        };
        processArray(wrongSizeArray);
        
        // Тест 4: Массив с null
        System.out.println("\n--- Тест 4: Массив с null строкой ---");
        String[][] nullRowArray = {
            {"1", "2", "3", "4"},
            null,
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}
        };
        processArray(nullRowArray);
        
        // ==========================================
        // ЧАСТЬ 2: ArrayIndexOutOfBoundsException
        // ==========================================
        System.out.println("\n========== ЧАСТЬ 2: ArrayIndexOutOfBoundsException ==========\n");
        demonstrateArrayIndexOutOfBounds();
    }
    
    // Метод для обработки массива с перехватом исключений
    private static void processArray(String[][] array) {
        try {
            int sum = ArrayProcessor.sumArray(array);
            System.out.println("Сумма всех элементов: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных: " + e.getMessage());
            System.out.println("   Ячейка: [" + e.getRow() + "][" + e.getCol() + "]");
            System.out.println("   Неверное значение: '" + e.getInvalidValue() + "'");
        } catch (Exception e) {
            System.out.println("Неожиданная ошибка: " + e.getMessage());
        }
    }
    
    // Метод для демонстрации ArrayIndexOutOfBoundsException
    private static void demonstrateArrayIndexOutOfBounds() {
        // Пример 1: Генерация исключения и его поимка
        System.out.println("--- Пример 1: Обработанное исключение ---");
        try {
            ArrayProcessor.generateArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Перехвачено ArrayIndexOutOfBoundsException: " + e.getMessage());
            System.out.println("Класс: " + e.getClass().getSimpleName());
        }
        
        // Пример 2: Работа с двумерным массивом
        System.out.println("\n--- Пример 2: Выход за границы двумерного массива ---");
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        try {
            System.out.println("Попытка доступа к matrix[2][0]...");
            int value = matrix[2][0]; // Выход за границы строк
            System.out.println("Значение: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Перехвачено ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        
        // Пример 3: Работа с одномерным массивом
        System.out.println("\n--- Пример 3: Отрицательный индекс ---");
        int[] arr = {10, 20, 30, 40, 50};
        
        try {
            System.out.println("Попытка доступа к arr[-1]...");
            int value = arr[-1]; // Отрицательный индекс
            System.out.println("Значение: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Перехвачено ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        
        // Пример 4: Обработка нескольких исключений
        System.out.println("\n--- Пример 4: Обработка разных типов исключений ---");
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Доступ к numbers[5]: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: индекс вне диапазона");
        } catch (Exception e) {
            System.out.println("Другое исключение: " + e.getMessage());
        }
        
        System.out.println("\n--- Программа успешно завершена ---");
    }
}
