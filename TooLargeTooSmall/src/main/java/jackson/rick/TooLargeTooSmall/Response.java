package jackson.rick.TooLargeTooSmall;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rickjackson on 1/13/17.
 */
public class Response {

    private Map<String, String> responses;

    public Response() {
        responses = new HashMap<String, String>();

        responses.put("0", "Guess a number...");
        responses.put("1", "You just guessed that number. Guess another " +
                "number...");
        responses.put("2", "Incorrect. You are TOO HIGH. Guess another " +
                "number...");
        responses.put("3", "Incorrect. You are TOO LOW. Guess another " +
                "number...");
        responses.put("4", "CONGRATULATIONS!!! You guessed the secret number " +
                "in ");
        responses.put("5", "WOW!!! You guessed the secret number on the FIRST" +
                " TRY!!!");
        responses.put("6", "Game Over");
    }

    public String get(String result) {
        return responses.get(result);
    }
}
