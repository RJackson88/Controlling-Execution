package jackson.rick.SumOrProduct;

/**
 * Created by rickjackson on 1/13/17.
 */
public class Engine {

    private Input input;
    private CalculationDeterminator calculationDeterminator;
    private Output output;

    public Engine() {
        input = new Input();
        calculationDeterminator = new CalculationDeterminator();
        output = new Output();
    }

    public void run() {
        int number = input.askUserForNumber();
        String option = input.askUserForSumOrProduct();

        int answer = calculationDeterminator.returnValue(number, option);
        output.printToScreen("The answer is " + answer);
    }
}
