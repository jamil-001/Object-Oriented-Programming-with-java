abstract class Shape {
    private double area;
    private String color;

    public Shape(String color) {
        this.color = color;
    }
    protected void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract void calculateArea();

    public abstract void displayInfo();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        setArea(area);
    }
    public void displayInfo() {
        System.out.println("Circle Color: " + getColor());
        System.out.println("Circle Area: " + getArea());
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }
    public void calculateArea() {
        double area = length * width;
        setArea(area);
    }
    public void displayInfo() {
        System.out.println("Rectangle Color: " + getColor());
        System.out.println("Rectangle Area: " + getArea());
    }
}

public class task01 {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0, "Red");
        circle.calculateArea();
        circle.displayInfo();
        System.out.println();
        Shape rectangle = new Rectangle(4.0, 6.0, "Blue");
        rectangle.calculateArea();
        rectangle.displayInfo();
    }
}
