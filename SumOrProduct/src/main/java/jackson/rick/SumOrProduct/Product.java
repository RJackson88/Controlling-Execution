package jackson.rick.SumOrProduct;

/**
 * Created by rickjackson on 1/13/17.
 */
public class Product {

    public int calculate(int number) {
        int product = 1;
        for(int i = number; i > 0; i--) {
            product *= i;
        }
        return product;
    }
}
