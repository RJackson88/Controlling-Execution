package jackson.rick.TooLargeTooSmall;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by rickjackson on 1/14/17.
 */
public class ResponseTest {

    Response response;

    @Before
    public void setup() {
        response = new Response();
    }

    @Test
    public void responseTest1() {
        String expected = "Guess a number...";
        String actual = response.get("0");
        assertEquals("I expected the outcome to be: Guess a number:",
                expected, actual);
    }

    @Test
    public void responseTest2() {
        String expected = "Game Over";
        String actual = response.get("6");
        assertEquals("I expected the outcome to be: Game Over", expected,
                actual);
    }
}