package Piciorus.Ovidiu.lab2.ex6;

import java.util.Scanner;

public class Factorial {
    private static int non_recursive(int a) {
        int p = 1;
        for (int i = 1; i <= a; i++) p *= i;
        return p;
    }

    private static int recursive(int n) {
        if (n < 1) return 1;
        else return n * recursive(n - 1);
    }

    public static void main(String[] args) {
        Factorial Ob = new Factorial();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print("1: recursiv ; 2: nerecursiv. ");
        int var = scan.nextInt();
        switch (var) {
            case 1:
                n = Ob.recursive(n);
                break;
            case 2:
                n = Ob.non_recursive(n);
                break;

        }
        System.out.println(n);
    }
}
