package jackson.rick.TooLargeTooSmall;

/**
 * Created by rickjackson on 1/13/17.
 */
public class SecretNumber {

    private int value;

    public SecretNumber() {
        value = 0;
    }

    public void setRandomNumber(int minInput, int maxInput) {
        int minimum = Math.min(minInput, maxInput);
        int maximum = Math.max(minInput, maxInput);
        int secretNumber = (int)(Math.random() * (maximum - minimum)) + minimum;
        value = secretNumber;
    }

    public int getValue() {
        return value;
    }
}
