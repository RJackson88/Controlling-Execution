package jackson.rick.AliceAndBobGreeting;

/**
 * Created by rickjackson on 1/13/17.
 */
public class Engine {

    private Input input;
    private Output output;
    private Flow flow;

    public Engine() {
        input = new Input();
        output = new Output();
        flow = new Flow();
    }

    public void run() {
        flow.runAppFlow();
    }
}
