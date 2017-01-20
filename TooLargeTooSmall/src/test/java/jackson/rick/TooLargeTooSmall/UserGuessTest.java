package jackson.rick.TooLargeTooSmall;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by rickjackson on 1/14/17.
 */
public class UserGuessTest {

    UserGuess userGuess;

    @Before
    public void setupTest() {
        userGuess = new UserGuess();
    }

    @Test
    public void compare() {
        String expected = "5";
        String actual = userGuess.compare(1,1,0,1);
        assertEquals("I expected the outcome to be: 5", expected,
                actual);
    }
}
