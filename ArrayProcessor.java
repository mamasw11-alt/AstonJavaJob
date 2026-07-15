public class ArrayProcessor {
    
    // Основной метод для обработки массива
    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        // Проверка размера массива
        if (array == null) {
            throw new MyArraySizeException("Массив не может быть null");
        }
        
        if (array.length != 4) {
            throw new MyArraySizeException("Неверное количество строк: ожидается 4, получено " + array.length);
        }
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                throw new MyArraySizeException("Строка " + i + " равна null");
            }
            if (array[i].length != 4) {
                throw new MyArraySizeException(
                    String.format("Неверное количество столбцов в строке %d: ожидается 4, получено %d", 
                                 i, array[i].length)
                );
            }
        }
        
        // Суммирование элементов
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j].trim());
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, array[i][j]);
                }
            }
        }
        return sum;
    }
    
    // Дополнительный метод для демонстрации ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException() {
        int[] arr = {1, 2, 3, 4};
        System.out.println("Попытка доступа к элементу с индексом 10...");
        int value = arr[10]; // Здесь будет ArrayIndexOutOfBoundsException
        System.out.println("Значение: " + value);
    }
}
