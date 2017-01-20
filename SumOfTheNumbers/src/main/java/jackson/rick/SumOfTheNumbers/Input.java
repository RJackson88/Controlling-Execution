package jackson.rick.SumOfTheNumbers;

import java.util.Scanner;

/**
 * Created by rickjackson on 1/14/17.
 */
public class Input {

    private Scanner scanner;
    private Output out;

    public Input() {
        scanner = new Scanner(System.in);
        out = new Output();
    }

    public int askForNumber() {
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }
}
