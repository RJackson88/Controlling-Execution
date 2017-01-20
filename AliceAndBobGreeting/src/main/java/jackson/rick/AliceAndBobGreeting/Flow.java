package jackson.rick.AliceAndBobGreeting;

/**
 * Created by rickjackson on 1/14/17.
 */
public class Flow {

    private Input input;
    private Output output;

    public Flow() {
        input = new Input();
        output = new Output();
    }

    public void runAppFlow() {
        output.printToScreen("What is your name...?");
        String name = input.askForName();
        name = name.toLowerCase();

        while(!(name.equals("alice")) && !(name.equals("bob"))) {
            output.printToScreen("\nWho...?\n");
            output.printToScreen("What is your name...?");
            name = input.askForName();
            name.toLowerCase();
        }

        output.printToScreen("\nHELLO " + name.toUpperCase() + "!!!");
    }
}
