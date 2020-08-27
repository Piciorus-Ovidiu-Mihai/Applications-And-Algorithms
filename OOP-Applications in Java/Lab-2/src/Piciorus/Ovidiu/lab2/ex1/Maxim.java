package Piciorus.Ovidiu.lab2.ex1;

import java.util.Scanner;

public class Maxim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        if (x > y) System.out.println(x);
        else System.out.println(y);
    }
}
