package jackson.rick.TooLargeTooSmall;

/**
 * Created by rickjackson on 1/13/17.
 */
public class Engine {

    private Input input;
    private Output output;
    private SecretNumber secretNumber;
    private UserGuess userGuess;
    private Response response;

    public Engine() {
        input = new Input();
        output = new Output();
        secretNumber = new SecretNumber();
        userGuess = new UserGuess();
        response = new Response();
    }

    public void run() {
        //output.printToScreen("Select the minimum number...");
        int min = input.askForMinimum();
        //output.printToScreen("Select the maximum number...");
        int max = input.askForMaximum();
        secretNumber.setRandomNumber(min, max);
        int guess = 0;
        int tries = 0;
        int lastGuess = 0;
        String respond = "0";
        boolean gameIsRunning = true;

        output.printToScreen(response.get(respond));
        guess = input.askForGuess();
        tries++;

        if(guess == lastGuess) {
            lastGuess = 1;
        }

        if(guess == secretNumber.getValue() && tries == 1) {
            respond = "5";
            output.printToScreen("");
            output.printToScreen(response.get(respond));
            gameIsRunning = false;
        } else {
            respond = userGuess.compare(secretNumber.getValue(), guess, lastGuess, tries);
            lastGuess = guess;
        }

        while(gameIsRunning) {
            output.printToScreen("");
            output.printToScreen(response.get(respond));
            guess = input.askForGuess();

            if(guess != lastGuess) {
                tries++;
            }

            respond = userGuess.compare(secretNumber.getValue(), guess, lastGuess, tries);
            lastGuess = guess;

            if(respond.equals("4")) {
                output.printToScreen("");
                output.printToScreenSameLine(response.get(respond));
                output.printToScreenSameLine(tries + " tries!!!");
                gameIsRunning = false;
            }
        }

        output.printToScreen("");
        output.printToScreen(response.get("6"));

    }
}