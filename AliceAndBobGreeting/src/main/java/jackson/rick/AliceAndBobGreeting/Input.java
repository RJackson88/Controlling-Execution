package jackson.rick.AliceAndBobGreeting;

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

    public String askForName() {
        String name = input.nextLine();
        return name.toLowerCase();
    }
}
