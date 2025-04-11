abstract class Shape {
    public abstract double calculateArea();
}
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calculateArea() {
        return length * width;
    }

    public boolean isSquare() {
        return length == width;
    }
}
class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double a, double b, double c) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }

    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    public boolean isRightAngled() {
        double a2 = sideA * sideA;
        double b2 = sideB * sideB;
        double c2 = sideC * sideC;

        return (a2 + b2 == c2) || (a2 + c2 == b2) || (b2 + c2 == a2);
    }
}
public class ShapeTest {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 5);
        System.out.println("Rectangle Area: " + rect.calculateArea());
        System.out.println("Is Square? " + rect.isSquare());

        Triangle tri = new Triangle(3, 4, 5);
        System.out.println("\nTriangle Area: " + tri.calculateArea());
        System.out.println("Is Right-Angled? " + tri.isRightAngled());
    }
}
