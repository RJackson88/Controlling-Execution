//package jackson.rick.SumOrProduct;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import java.math.BigInteger;
//
//import static org.junit.Assert.*;
//
///**
// * Created by rickjackson on 1/13/17.
// */
//public class SumOrProductTest {
//
//    SumOrProduct sp;
//
//    @Before
//    public void setUp() {
//        sp = new SumOrProduct();
//    }
//
//    @Test
//    public void checkStringTest() {
//        boolean expected = true;
//        boolean actual = sp.checkString(" ");
//        assertEquals("I expect to return true", expected, actual);
//    }
//
//    @Test
//    public void checkValidStringTest() {
//        boolean expected = true;
//        boolean actual = sp.checkValidString("88");
//        assertEquals("I expect to return true", expected, actual);
//    }
//
//    @Test
//    public void parseToIntegerTest() {
//        Integer expected = 88;
//        Integer actual = sp.parseToInteger("88");
//        assertEquals("I expect to return 88", expected, actual);
//    }
//
//    @Test
//    public void checkUserChoiceTest() {
//        int expected = 2;
//        int actual = sp.checkUserChoice("Product");
//        assertEquals("I expect to return 2", expected, actual);
//    }
//
//    @Test
//    public void setStartingNumTest() {
//        BigInteger expected = BigInteger.valueOf(0);
//        BigInteger actual = sp.setStartingNum(1);
//        assertEquals("I expect to return 0", expected, actual);
//    }
//
//    @Test
//    public void compareNumberToOneTest() {
//        int expected = -1;
//        int actual = sp.compareNumberToOne(-10);
//        assertEquals("I expect to return -1", expected, actual);
//    }
//
//    @Test
//    public void convertIntegerTest() {
//        BigInteger expected = BigInteger.valueOf(88);
//        BigInteger actual = sp.convertInteger(88);
//        assertEquals("I expect to return 88", expected, actual);
//    }
//
//    @Test
//    public void getSumResultTest() {
//        BigInteger expected = BigInteger.valueOf(15);
//        BigInteger actual = sp.getSumResult(5, BigInteger.valueOf(0), 1);
//        assertEquals("I expect to return 15", expected, actual);
//    }
//
//    @Test
//    public void getProductResultTest() {
//        BigInteger expected = BigInteger.valueOf(6);
//        BigInteger actual = sp.getProductResult(3, BigInteger.valueOf(1), 1);
//        assertEquals("I expect to return 15", expected, actual);
//    }
//
//
//}
