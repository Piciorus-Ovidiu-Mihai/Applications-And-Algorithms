import Piciorus.Ovidiu.Lab3.ex2.Circle;

import java.util.Scanner;


public class Main{
    public static void main(String[] args) {

        Circle c1 = new Circle();
        Scanner in = new Scanner(System.in);
        Circle c2 = new Circle(in.nextDouble());
        Circle c3 = new Circle(11.0, "Blue");

        System.out.println(c1.getColor() + " " + " " + c1.getRadius());
        System.out.println(c2.getColor() + " " + " " + c2.getRadius());
        System.out.println(c3.getColor() + " " + " " + c3.getRadius());
    }
}