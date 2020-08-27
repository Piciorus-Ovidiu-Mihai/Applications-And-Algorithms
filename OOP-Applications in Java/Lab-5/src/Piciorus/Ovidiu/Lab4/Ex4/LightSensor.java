package Piciorus.Ovidiu.Lab4.Ex4;

import java.util.Random;

public class LightSensor extends Sensor {
    Random random = new Random();

    @Override
    public int readValue() {
        return random.nextInt(101);
    }
}
