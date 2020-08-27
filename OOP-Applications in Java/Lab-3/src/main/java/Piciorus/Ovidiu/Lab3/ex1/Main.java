package Piciorus.Ovidiu.Lab3.ex1;

public class Main {
    public static void main(String[] args) {
        Robot r1 = new Robot();
        Robot r2 = new Robot();

        System.out.println("R1" + r1.toString());
        System.out.println("R2" + r2.toString());

        r2.Change(5);

        System.out.println("R2" + r2.toString());

    }

}