package Piciorus.Ovidiu.Lab4.Ex1;


public class MainTest {
    public static void main(String[] args) {


        Circle c = new Circle(3, "green", true);
        c.setRadius(3);
        System.out.println(c.getArea() + " " + c.getPerimeter() + " " + c.getRadius() + " " + c.toString());

        Rectangle r = new Rectangle("red", true, 2, 3);
        r.setLength(3);
        r.setWidth(2);
        System.out.println(r.getWidth() + " " + r.getLength() + " " + r.getArea() + " " + r.getPerimeter() + " " + r.getArea() + " " + r.toString());

        Square p = new Square(7, "blue", true);
        p.setLength(1);
        System.out.println(p.getSide());
        p.setWidth(2);
        System.out.println(p.getSide());
        p.setSide(3);
        System.out.println(p.getSide());
        System.out.println(p.toString());
    }
}
