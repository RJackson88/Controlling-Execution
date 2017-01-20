package jackson.rick.SumOfTheNumbers;

/**
 * Created by rickjackson on 1/14/17.
 */
public class Sum {

    int sum;

    public Sum() {
        sum = 1;
    }

    public int calculate(int number) {

        if(number < 1) {
            for(int i = number; i < 1; i++) {
                sum += i;
            }
        } else if(number > 1) {
            for(int i = number; i > 1; i--) {
                sum += i;
            }
        }

        return sum;
    }
}
