package Piciorus.Ovidiu.Lab4.Ex3;

public class Controller {
    LightSensor lightSensor = new LightSensor();
    TemperatureSensor tempSensor = new TemperatureSensor();

    public void control() throws InterruptedException {
        int s = 0;
        while (s != 20) {
            System.out.println("Light: " + lightSensor.readValue());
            System.out.println("Temperature " + tempSensor.readValue());

            Thread.sleep(1000);
            s++;
        }
    }
}
