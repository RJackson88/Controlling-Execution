/*
package jackson.rick.TooLargeTooSmall;

import java.util.Scanner;

///**
// * Created by rickjackson on 1/12/17.
// */ /*
public class TooLargeTooSmall {

    public int getSecretNumber(int minimum, int maximum) {
        int secretNumber = (int)(Math.random() * (maximum * minimum)) + minimum;
        return secretNumber;
    }

    public int getSecretNumberRange() {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        return number;
    }

    public int getUserGuess() {
        Scanner in = new Scanner(System.in);
        Integer userGuess = in.nextInt();
        return userGuess;
    }

    public int compareUserGuess(int sn, int ug, int tries, int last) {
        if(ug == last) {
            return 1;
        } else if(ug == sn && tries == 1) {
            return 5;
        } else if(ug == sn) {
            return 4;
        } else if(ug > sn) {
            return 2;
        } else { // ug < sn
            return 3;
        }
    }

    public String getGameResponse(int response, int tries) {
        String outcome = "";
        switch (response) {
            case 0:
                outcome = "Please guess a number.";
                break;
            case 1:
                outcome = "You just guessed that number. Please try another guess";
                break;
            case 2:
                outcome = "Incorrect. You are TOO HIGH. Please try again.";
                break;
            case 3:
                outcome = "Incorrect. You are TOO LOW. Please try again.";
                break;
            case 4:
                outcome = "CONGRATULATIONS!!! You guessed the secret number in "
                        + tries;
                break;
            case 5:
                outcome = "WOW!!! You guessed the secret number on the FIRST " +
                        "TRY!!!";
                break;
            default:
                break;
        }
        return outcome;
    }

    public static void main(String[] args) {
        TooLargeTooSmall guessingGame = new TooLargeTooSmall();
        int secretNumber = guessingGame.getSecretNumber(1, 30);
        int tries = 0;
        int lastGuess = -1;
        int response = 0;

        System.out.println(guessingGame.getGameResponse(response, tries));

        while(response != 6) {
            guessingGame.getUserGuess();
            int userGuess = guessingGame.getUserGuess();

            if(userGuess != lastGuess) {
                tries++;
            }

            response = guessingGame.compareUserGuess(secretNumber, userGuess,
                    tries, lastGuess);
            System.out.println(guessingGame.getGameResponse(response, tries));
            lastGuess = userGuess;

            if(response == 4 || response == 5) {
                response = 6;
            }
        }
    }
}
*/