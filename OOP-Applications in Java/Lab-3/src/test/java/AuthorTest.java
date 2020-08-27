import Piciorus.Ovidiu.Lab3.ex3.Author;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AuthorTest {

    private Object assertEquals;
    @Test
    public void testRobot() {
        Author n=new Author("Ovidiu","ovidiu@yahoo.com",'m');
        assertEquals("Test"," Ovidiu(m) at emailovidiu@yahoo.com",n.toString());
    }
}