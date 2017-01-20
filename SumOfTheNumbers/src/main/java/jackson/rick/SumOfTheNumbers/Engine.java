package jackson.rick.SumOfTheNumbers;

/**
 * Created by rickjackson on 1/14/17.
 */
public class Engine {

    private Input in;
    private Output out;
    private Sum sum;

    public Engine() {
        in = new Input();
        out = new Output();
        sum = new Sum();
    }

    public void run() {
        out.printLine("Pick a number:");
        int number = in.askForNumber();
        int answer = sum.calculate(number);

        out.printLine("");
        out.print("The answer is: " + answer + "\n");
    }
}