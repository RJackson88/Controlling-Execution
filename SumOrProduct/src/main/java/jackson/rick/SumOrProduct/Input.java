package jackson.rick.SumOrProduct;

import java.util.Scanner;

/**
 * Created by rickjackson on 1/13/17.
 */
public class Input {

    private Scanner scanner;
    private Output output;

    public Input() {
        scanner = new Scanner(System.in);
        output = new Output();
    }

    public int askUserForNumber() {
        output.printToScreen("Enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    public String askUserForSumOrProduct() {
        output.printToScreen("Enter sum or product: ");
        String option = scanner.nextLine();
        return option;
    }

}
