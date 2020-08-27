package Piciorus.Ovidiu.Lab4.Ex3;

public abstract class Sensor {
    private String location;

    public abstract int readValue();
    public String getLocation() {
        return location;
    }
}
