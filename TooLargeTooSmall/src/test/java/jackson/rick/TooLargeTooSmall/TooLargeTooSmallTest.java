/*
package jackson.rick.TooLargeTooSmall;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TooLargeTooSmallTest {

    TooLargeTooSmall guessingGame;

    @Before
    public void setUp() {
        guessingGame = new TooLargeTooSmall();
    }

    @Test
    public void getSecretNumberTest() {
        int expected = 1;
        int actual = guessingGame.getSecretNumber(1, 30);
        assertEquals("I can not predict a random number", expected, actual);
    }

    @Test
    public void compareUserGuessTest() {
        int expected = 5;
        int actual = guessingGame.compareUserGuess(1,1,1,-1);
        assertEquals("I expect the output to be 5", expected, actual);
    }

    @Test
    public void getGameResponse() {
        String expected = "WOW!!! You guessed the secret number on the FIRST " +
                "TRY!!!";
        String actual = guessingGame.getGameResponse(5,1);
        assertEquals("I expect the output to be 'WOW!!! You guessed the " +
                "secret number on the FIRST TRY!!!'", expected, actual);
    }
}
*/