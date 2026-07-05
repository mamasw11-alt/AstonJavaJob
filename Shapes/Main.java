public class Main {
    public static void main(String[] args) {
        // Создаем фигуры с разными цветами
        Circle circle = new Circle(5.0, "Красный", "Черный");
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Синий", "Белый");
        Triangle triangle = new Triangle(3.0, 4.0, 5.0, "Зеленый", "Желтый");
        
        // Создаем массив фигур
        Shape[] shapes = {
            circle,
            rectangle,
            triangle
        };
        
        // Выводим информацию о всех фигурах
        ShapeUtils.printAllShapes(shapes);
        
        // Дополнительно: меняем цвет фигуры и выводим обновленную информацию
        System.out.println("========== ИЗМЕНЕНИЕ ЦВЕТА ==========\n");
        circle.setFillColor("Оранжевый");
        circle.setBorderColor("Фиолетовый");
        System.out.println("После изменения цвета круга:");
        circle.printInfo();
        
        // Дополнительно: находим фигуру с максимальным периметром и площадью
        System.out.println("========== СТАТИСТИКА ==========\n");
        Shape maxPerimeter = ShapeUtils.findMaxPerimeter(shapes);
        Shape maxArea = ShapeUtils.findMaxArea(shapes);
        
        if (maxPerimeter != null) {
            System.out.println("Фигура с максимальным периметром:");
            maxPerimeter.printInfo();
        }
        
        if (maxArea != null) {
            System.out.println("Фигура с максимальной площадью:");
            maxArea.printInfo();
        }
    }
}
