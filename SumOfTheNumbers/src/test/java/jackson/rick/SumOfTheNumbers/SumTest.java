package jackson.rick.SumOfTheNumbers;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rickjackson on 1/14/17.
 */
public class SumTest {

    Sum sum;

    @Before
    public void setup() {
        sum = new Sum();
    }

    @Test
    public void calculateForPositiveNumbersTest() {

        int expected = 15;
        int actual = sum.calculate(5);
        assertEquals("I expected the result to be 15", expected, actual);
    }

    @Test
    public void calculateForNegativeNumbersTest() {

        int expected = -14;
        int actual = sum.calculate(-5);
        assertEquals("I expected the result to be -14", expected, actual);
    }
}