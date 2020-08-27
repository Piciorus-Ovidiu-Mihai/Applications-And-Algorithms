package Piciorus.Ovidiu.Lab7.ex1;

public class TemperatureException extends Exception {
    int t;

    public TemperatureException(int t, String msg) {
        super(msg);
        this.t = t;
    }

    int getTemp() {
        return t;
    }
}
