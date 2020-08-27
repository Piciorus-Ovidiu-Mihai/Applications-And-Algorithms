package Piciorus.Ovidiu.Lab7.ex2;


import java.io.*;
import java.util.*;

public class Counter {
    public static void main(String args[]) throws IOException {

        char ch;
        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Give the character:");
        ch = stdin.readLine().charAt(0);

        int nr = 0;

        //citire din fisier
        BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Ovidiu\\Desktop\\UTCN AN 2\\ISP-Ingineria Sistemelor de Programe\\Laboratoare\\piciorus-ovidiu-mihai-30123-isp-2019\\Lab-7\\src\\Piciorus\\Ovidiu\\Lab7\\ex2\\Text"));
        String s;
        while ((s = in.readLine()) != null) {
            char[] lin = s.toCharArray();
            for (char c : lin) {
                if (c == c) {
                    nr++;
                }
            }
        }
        in.close();
        System.out.println("The character " + ch + " appears " + nr + " times");
    }

}
