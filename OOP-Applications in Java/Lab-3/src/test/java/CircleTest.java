
import Piciorus.Ovidiu.Lab3.ex2.Circle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CircleTest {

    private Object assertEquals;
    @Test
    public void testRobot() {
        Circle c3=new Circle();
        assertEquals("Test",c3.getRadius()+c3.getColor(),1.0+"red");
    }
}