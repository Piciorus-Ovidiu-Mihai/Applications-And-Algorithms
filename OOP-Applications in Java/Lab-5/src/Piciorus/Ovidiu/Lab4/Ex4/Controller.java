package Piciorus.Ovidiu.Lab4.Ex4;



public class Controller {
    private static Controller control;
    private Controller(){

    }
    public static Controller getControl(){
        if(control==null) {
            control = new Controller();
        }
        return control;
    }
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
