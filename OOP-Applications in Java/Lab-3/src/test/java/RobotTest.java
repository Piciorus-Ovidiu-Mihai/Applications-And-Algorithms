import Piciorus.Ovidiu.Lab3.ex1.Robot;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RobotTest {

    private Object assertEquals;

    @Test
    public void testRobot() {
        Robot r2=new Robot();
        assertEquals("Test", "Robot{"+"x="+1+"}", r2.toString());
    }
}