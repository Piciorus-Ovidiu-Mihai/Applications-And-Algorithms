package Piciorus.Ovidiu.Lab4.Ex1;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
        this.radius = radius;
    }

    public Circle(double radius) {
        this();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = 2 * Math.PI * radius * radius;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
