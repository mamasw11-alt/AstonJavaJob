public class Circle implements Shape {
    private double radius;
    private String fillColor;
    private String borderColor;
    
    private static final double PI = Math.PI;
    
    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
    
    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }
    
    @Override
    public String getFillColor() {
        return fillColor;
    }
    
    @Override
    public String getBorderColor() {
        return borderColor;
    }
    
    @Override
    public void setFillColor(String color) {
        this.fillColor = color;
    }
    
    @Override
    public void setBorderColor(String color) {
        this.borderColor = color;
    }
    
    // для радиуса
    public double getRadius() {
        return radius;
    }
}
