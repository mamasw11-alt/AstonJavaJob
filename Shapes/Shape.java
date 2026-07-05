public interface Shape extends Colorable {
    
    // Дефолтный метод для расчета периметра 
    default double calculatePerimeter() {
        return 0;
    }
    
    // Дефолтный метод для расчета площади 
    default double calculateArea() {
        return 0;
    }
    
    // Метод для вывода информации о фигуре
    default void printInfo() {
        System.out.println("--- " + getClass().getSimpleName() + " ---");
        System.out.println("Периметр: " + calculatePerimeter());
        System.out.println("Площадь: " + calculateArea());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
        System.out.println();
    }
}
