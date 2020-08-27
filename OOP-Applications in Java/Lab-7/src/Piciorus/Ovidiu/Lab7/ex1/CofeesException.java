package Piciorus.Ovidiu.Lab7.ex1;

public class CofeesException extends Exception {
    private int nr;

    public CofeesException(int nr, String msg) {
        super(msg);
        this.nr = nr;
    }

    public int getNr() {
        return nr;
    }
}

