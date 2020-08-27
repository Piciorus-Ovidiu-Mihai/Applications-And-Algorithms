package Piciorus.Ovidiu.Lab4.ex6;

public class Shape {
    public String color;
    public boolean filled;

    public Shape() {
        color = "red";
        filled = true;
    }

    public Shape(String color, boolean filled) {
        this();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color" + color + "and" + filled;
    }
}
