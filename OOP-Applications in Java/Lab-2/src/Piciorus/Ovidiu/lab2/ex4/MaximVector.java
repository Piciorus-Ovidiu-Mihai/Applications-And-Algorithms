package Piciorus.Ovidiu.lab2.ex4;

import java.util.Scanner;

public class MaximVector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) array[i] = scan.nextInt();
        int max = array[0];
        for (int el : array) if (el > max) max = el;
        System.out.println(max);

    }
}
