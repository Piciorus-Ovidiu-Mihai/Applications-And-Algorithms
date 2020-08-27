package Piciorus.Ovidiu.Lab4.Ex3;

import java.util.Random;

public class TemperatureSensor extends Sensor {

    Random random = new Random();

    @Override
    public int readValue() {
        return random.nextInt(101);
    }
}
