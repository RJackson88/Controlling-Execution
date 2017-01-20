package jackson.rick.TooLargeTooSmall;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by rickjackson on 1/14/17.
 */
public class SecretNumberTest {

    SecretNumber secretNumber;

    @Before
    public void setupTest() {
        secretNumber = new SecretNumber();
    }

    @Test
    public void getValueTest() {
        int expected = 0;
        int actual = secretNumber.getValue();
        assertEquals("I expected the outcome to be: 0", expected,
                actual);
    }
}
