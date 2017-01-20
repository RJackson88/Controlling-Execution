package jackson.rick.SumOrProduct;

/**
 * Created by rickjackson on 1/13/17.
 */
public class CalculationDeterminator {

    public int returnValue(int number, String option) {
        int value = 0;
        if(option.equals("sum")) {
            Sum sum = new Sum();
            value = sum.calculate(number);
        }
        else {
            Product product = new Product();
            value = product.calculate(number);
        }

        return value;

    }
}
