package Piciorus.Ovidiu.Lab7.ex1;

public class ConcentrationException extends Exception {
    int c;

    public ConcentrationException(int c, String msg) {
        super(msg);
        this.c = c;
    }

    int getConc() {
        return c;
    }
}
