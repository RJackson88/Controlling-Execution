/*
This was my original code, before I sat down with Min. He should me how to
break everything down.


package jackson.rick.AliceAndBobGreeting;

import java.util.Scanner;

/**
 * Created by rickjackson on 1/13/17.
 */
/*
public class AliceAndBobGreeting {

    public void greeting() {
        int response = 0;

        while(response == 0) {
            String name = userInput();

            if(name.equals("alice") || name.equals("bob")) {
                response = -1;
            }

            String out = response(checkUserInput(name));
            System.out.println(out);
            System.out.println();
        }
    }

    public String userInput() {
        System.out.println("What is your name...?");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        return name.toLowerCase();
    }

    public int checkUserInput(String s) {
        int response = 0;
        if(s.equals("alice")) {
            response = 1;
        } else if(s.equals("bob")) {
            response = 2;
        }
        return response;
    }

    public String response(int i) {
        String out = "Who...???";
        if(i == 1) {
            out = "HELLO ALICE!!!";
        } else if(i == 2) {
            out = "HELLO BOB!!!";
        }
        return out;
    }

    public static void main(String[] args) {
        AliceAndBobGreeting ab = new AliceAndBobGreeting();
        ab.greeting();
    }
}
*/