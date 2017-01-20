package jackson.rick.SumOrProduct;

/**
 * Created by rickjackson on 1/13/17.
 */
public class Sum {

    public int calculate(int number) {
        int sum = 0;
        for(int i = number; i > 0; i--) {
            sum += i;
        }
        return sum;
    }
}
