package jackson.rick.TooLargeTooSmall;

import java.util.Scanner;

/**
 * Created by rickjackson on 1/13/17.
 */
public class Input {

    private Scanner input;
    private Output output;

    public Input() {
        input = new Scanner(System.in);
        output = new Output();
    }

    public int askForMinimum() {
        output.printToScreen("What is the range of the secret number?");
        output.printToScreen("Minimum:");
        int number = input.nextInt();
        input.nextLine();
        output.printToScreen("");
        return number;
    }

    public int askForMaximum() {
        output.printToScreen("Maximum:");
        int number = input.nextInt();
        input.nextLine();
        output.printToScreen("");
        return number;
    }

    public int askForGuess() {
        //output.printToScreen("Guess a number...");
        int guess = input.nextInt();
        input.nextLine();
        return guess;
    }


}
