package Piciorus.Ovidiu.Lab6.ex4;

import java.io.IOException;
import java.util.Scanner;

public class ConsoleMenu {
    public static void main(String[] args) throws IOException, InterruptedException {
        Dictionary dictionary = new Dictionary();
        int chose;
        boolean menu = true;
        while (menu) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("----------Menu----------");
            System.out.println("1 Add Word");
            System.out.println("2 Get Definition");
            System.out.println("3 Get All Words");
            System.out.println("4 Get All Definition");
            System.out.println("5 Exit");
            System.out.println("------------------------");
            Scanner in = new Scanner(System.in);
            chose = in.nextInt();
            switch (chose) {
                case 1:
                    System.out.println("The Word is: ");
                    Word w = new Word(in.next());
                    System.out.println("The Definition is: ");
                    Definition d = new Definition(in.next());
                    dictionary.addWord(w, d);
                    break;
                case 2:
                    System.out.println("The Word is: ");
                    Word w2 = new Word(in.next());
                    Definition d2 = dictionary.getDefinition(w2);
                    if (d2 != null) {
                        System.out.println(d2.toString());
                    } else {
                        System.out.println("Not ");
                    }
                    break;
                case 3:
                    dictionary.getAllWords();
                    break;
                case 4:
                    dictionary.getAllDefinition();
                    break;
                case 5:
                    menu = false;
                    break;

            }
        }
    }
}
