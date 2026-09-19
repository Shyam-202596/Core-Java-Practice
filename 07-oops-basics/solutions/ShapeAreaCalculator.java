import java.util.List;

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4, 5);
        Shape[] shapes = {circle, rectangle, triangle};
        // List<Shape> shapes = List.of(new Circle(7), new Rectangle(16, 14), new Triangle(3, 4, 5));
        for(Shape shape : shapes){
            System.out.println("Shape: " + shape.getName());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
        }
    }
}
abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
    String getName(){
        return getClass().getSimpleName();
    }
}
class Circle extends Shape {
    private final double radius;
    Circle(double radius){
        if(radius <= 0){
            throw new IllegalArgumentException("radius of Circle must be positive");
        }
        this.radius = radius;
    }
    @Override
    double calculateArea(){
        return Math.PI * radius * radius;
    }
    @Override
    double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
}
class Rectangle extends Shape {
    private final double length;
    private final double breadth;
    Rectangle(double length, double breadth){
        if(length <= 0 || breadth <= 0){
            throw new IllegalArgumentException("Length or Breadth of Rectangle must be positive");
        }
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    double calculateArea(){
        return length * breadth;
    }
    @Override
    double calculatePerimeter(){
        return 2 * (length + breadth);
    }
}
class Triangle extends Shape {
    private final double s1;
    private final double s2;
    private final double s3;
    Triangle(double side1, double side2, double side3){
        if(side1 <= 0 || side2 <= 0 || side3 <= 0 || side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2){
            throw new IllegalArgumentException("sides of triangle must be positive and sum of two sides must be greater than third side");
        }
        s1 = side1;
        s2 = side2;
        s3 = side3;
    }
    @Override
    double calculateArea(){
        double s = (s1 + s2 + s3) / 2;
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
    }
    @Override
    double calculatePerimeter(){
        return s1 + s2 + s3;
    }
}
