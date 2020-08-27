package Piciorus.Ovidiu.Lab7.ex1;

public class Cofee {
    private int temp;
    private int conc;
    private static int nr = 0;

    Cofee(int t, int c) {
        temp = t;
        conc = c;
        nr++;
    }

    public static int getNr() {
        return nr;
    }

    int getTemp() {
        return temp;
    }

    int getConc() {
        return conc;
    }

    public String toString() {
        return "[cofee temperature=" + temp + ":concentration=" + conc + "]";
    }
}
