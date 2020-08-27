package Piciorus.Ovidiu.Lab3.ex4;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint m1 = new MyPoint();
        MyPoint m2 = new MyPoint(1, 2);
        m1.setXY(4, 2);
        System.out.println(m1.distance(2, 2));
        System.out.println(m1.distance(m2));
    }
}