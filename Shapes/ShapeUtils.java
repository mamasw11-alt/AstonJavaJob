public class ShapeUtils {
    
    // Метод для вывода информации о массиве фигур
    public static void printAllShapes(Shape[] shapes) {
        System.out.println("ГЕОМЕТРИЧЕСКИЕ ФИГУРЫ\n");
        for (Shape shape : shapes) {
            shape.printInfo();
        }
        System.out.println("============================================");
    }
    
    // Метод для поиска фигуры с максимальным периметром
    public static Shape findMaxPerimeter(Shape[] shapes) {
        if (shapes == null || shapes.length == 0) {
            return null;
        }
        Shape maxShape = shapes[0];
        double maxPerimeter = shapes[0].calculatePerimeter();
        
        for (Shape shape : shapes) {
            if (shape.calculatePerimeter() > maxPerimeter) {
                maxPerimeter = shape.calculatePerimeter();
                maxShape = shape;
            }
        }
        return maxShape;
    }
    
    // Метод для поиска фигуры с максимальной площадью
    public static Shape findMaxArea(Shape[] shapes) {
        if (shapes == null || shapes.length == 0) {
            return null;
        }
        Shape maxShape = shapes[0];
        double maxArea = shapes[0].calculateArea();
        
        for (Shape shape : shapes) {
            if (shape.calculateArea() > maxArea) {
                maxArea = shape.calculateArea();
                maxShape = shape;
            }
        }
        return maxShape;
    }
}
