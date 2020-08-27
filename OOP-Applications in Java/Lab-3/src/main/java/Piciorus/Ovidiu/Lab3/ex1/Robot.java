package Piciorus.Ovidiu.Lab3.ex1;

public class Robot {
    int x;

    public Robot() {
        x = 1;
    }

    public void Change(int k) {
        if (k >= 1) x = x + k;
    }


    @Override
    public String toString() {
        return "Robot{" +
                "x=" + x +
                '}';
    }
}