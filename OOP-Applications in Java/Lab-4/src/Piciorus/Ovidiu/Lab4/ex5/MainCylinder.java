package Piciorus.Ovidiu.Lab4.ex5;

public class MainCylinder {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        Cylinder c1 = new Cylinder(3);
        Cylinder c2 = new Cylinder(5, 2);
        System.out.println(c.getHeight() + " " + c1.getHeight() + " " + c2.getHeight() + "\n");
        System.out.println(c.getVolume() + " " + c1.getVolume() + " " + c2.getVolume());
    }
}
