package Piciorus.Ovidiu.lab2.ex7;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner in = new Scanner(System.in);
        int numarul = ran.nextInt(10);
        int a;
        for (int i = 1; i <= 3; i++) {
            a = in.nextInt();
            if (a > numarul) System.out.println("Wrong answer, too high!");
            else if (a < numarul) System.out.println("Wrong answer, too low!");
            else {
                System.out.println("win!");
                break;
            }
            if (i == 3) System.out.println("lost!");
        }
    }
}
