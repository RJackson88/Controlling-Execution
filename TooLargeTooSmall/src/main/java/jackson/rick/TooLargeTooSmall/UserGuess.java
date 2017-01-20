package jackson.rick.TooLargeTooSmall;

/**
 * Created by rickjackson on 1/13/17.
 */
public class UserGuess {
    private Input input;

    public UserGuess() {
        input = new Input();
    }

    public int guess() {
        int guess = input.askForGuess();
        return guess;
    }

    public String compare(int secretNumber, int guess, int lastGuess, int
            tries) {
        if(guess == lastGuess) {
            return "1";
        } else if(guess == secretNumber && tries == 1) {
            return "5";
        } else if(guess == secretNumber) {
            return "4";
        } else if(guess > secretNumber) {
            return "2";
        } else { // guess < secretNumber
            return "3";
        }
    }
}