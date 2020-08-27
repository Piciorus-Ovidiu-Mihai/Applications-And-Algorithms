package Piciorus.Ovidiu.Lab4.Ex1;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(String side, boolean color, int filled, double v) {
        this.length = 1.0;
        this.width = 2.0;
    }

    public Rectangle(double v, double side) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public Rectangle(double side, String color, boolean filled, double v) {
        this.length = getLength();
    }

    public Rectangle() {
        this.length = getLength();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        double area = width * length;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * width * length;
        return perimeter;
    }
}
