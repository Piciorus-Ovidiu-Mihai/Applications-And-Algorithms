package Piciorus.Ovidiu.Lab4.ex5;

import Piciorus.Ovidiu.Lab4.ex1.Circle;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double radius) {
        super(radius);

    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        final double v = 3.14 * super.getRadius() * super.getRadius() * this.height;
        return v;
    }
}
