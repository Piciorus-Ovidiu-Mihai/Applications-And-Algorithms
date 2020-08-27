package Piciorus.Ovidiu.Lab7.ex3;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String args[]) throws IOException {

        String s;


        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose the opperation enc/dec:");
        s = stdin.readLine();

        if (s.equals("enc")) {
            BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Ovidiu\\Desktop\\UTCN AN 2\\ISP-Ingineria Sistemelor de Programe\\Laboratoare\\piciorus-ovidiu-mihai-30123-isp-2019\\Lab-7\\src\\Piciorus\\Ovidiu\\Lab7\\ex3\\encrypted.enc"));
            BufferedWriter bw;
            FileWriter fw = new FileWriter("C:\\Users\\Ovidiu\\Desktop\\UTCN AN 2\\ISP-Ingineria Sistemelor de Programe\\Laboratoare\\piciorus-ovidiu-mihai-30123-isp-2019\\Lab-7\\src\\Piciorus\\Ovidiu\\Lab7\\ex3\\decrypted.dec");
            bw = new BufferedWriter(fw);

            String aux;
            while ((aux = in.readLine()) != null) {
                char[] lin = aux.toCharArray();
                for (char c : lin) {
                    int ascii = (int) c;
                    ascii = ascii << 1;
                    char convert = (char) ascii;
                    bw.write(convert);

                }
            }
            in.close();
            bw.close();
        } else if (s.equals("dec")) {
            BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\Ovidiu\\Desktop\\UTCN AN 2\\ISP-Ingineria Sistemelor de Programe\\Laboratoare\\piciorus-ovidiu-mihai-30123-isp-2019\\Lab-7\\src\\Piciorus\\Ovidiu\\Lab7\\ex3\\decrypted.dec"));
            BufferedWriter bw;
            FileWriter fw = new FileWriter("C:\\Users\\Ovidiu\\Desktop\\UTCN AN 2\\ISP-Ingineria Sistemelor de Programe\\Laboratoare\\piciorus-ovidiu-mihai-30123-isp-2019\\Lab-7\\src\\Piciorus\\Ovidiu\\Lab7\\ex3\\encrypted.enc");
            bw = new BufferedWriter(fw);

            String aux;
            while ((aux = in.readLine()) != null) {
                char lin[] = aux.toCharArray();
                for (char c : lin) {
                    int ascii = (int) c;
                    ascii = ascii >> 1;
                    char convert = (char) ascii;
                    bw.write(convert);

                }
            }
            in.close();
            bw.close();

        } else {
            System.out.print("Choose between enc and dec");
        }
    }

}


