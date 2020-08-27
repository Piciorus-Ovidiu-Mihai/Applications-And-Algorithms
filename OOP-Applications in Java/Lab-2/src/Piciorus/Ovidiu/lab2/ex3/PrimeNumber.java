package Piciorus.Ovidiu.lab2.ex3;

import java.util.Scanner;

public class PrimeNumber {
    private static boolean prim(int x) {
        if (x < 2) return false;
        if (x > 3 && x % 2 == 0) return false;
        for (int i = 3; i <= x / 2; i += 2) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int nr = 0;

        for (int i = a; i <= b; i++)
            if (prim(i)) {
                System.out.println(i);
                nr = nr + 1;
            }
        System.out.println(nr);

    }

}
