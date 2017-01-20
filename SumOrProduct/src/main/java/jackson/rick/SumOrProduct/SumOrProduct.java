//package jackson.rick.SumOrProduct;
//
//import java.util.Scanner;
//import java.math.BigInteger;
//
///**
// * Created by rickjackson on 1/13/17.
// */
//public class SumOrProduct {
//
//    public void calculationGame() {
//        int i = 0;
//        String userNumber = "";
//        String userChoice = "";
//        BigInteger startingNumber = BigInteger.valueOf(0);
//        Integer comparedToOne = 0;
//        BigInteger result = BigInteger.valueOf(0);
//
//
//        while(i != 10) {
//            switch(i) {
//                case 0: // Introduction
//                    System.out.println("Pick an integer between -2,000,000," +
//                            "000 and 2,000,000,000:");
//                    i = 1;
//                    break;
//                case 1: // Get number
//                    userNumber = getUserNumber();
//                    i = 2;
//                    break;
//                case 2: // Check for any string
//                    if(!checkString(userNumber)) {
//                        System.out.println("You did not pick anything. Choose" +
//                                " a number:");
//                        i = 2;
//                    } else {
//                        i = 3;
//                    }
//                    break;
//                case 3: // Check for valid string
//                    if(!checkValidString(userNumber)) {
//                        System.out.println("You cannot add anything that does" +
//                                " not contain only integers 0 through 9. " +
//                                "Choose another number:");
//                        i = 2;
//                    } else {
//                        i = 4;
//                    }
//                    break;
//                case 4: // Check for valid number
//                    if(!checkValidNumber(userNumber)) {
//                        System.out.println("You have to choose a number " +
//                                "between -2000000000 and 2000000000. Choose " +
//                                "another number:");
//                        i = 2;
//                    } else {
//                        i = 5;
//                    }
//                    break;
//                case 5: // Ask for the user's choice
//                    System.out.println("Would you like the SUM or the PRODUCT" +
//                            " to 1?:");
//                    i = 6;
//                    break;
//                case 6:
//                    userChoice = getUserChoice();
//                case 7: // Check user choice
//                    switch(checkUserChoice(userChoice)) {
//                        case 0:
//                            System.out.println("That is not one of the " +
//                                    "choices. Choose if you would like the " +
//                                    "SUM or the PRODUCT:");
//                            i = 6;
//                            break;
//                        case 1:
//                            i = 8;
//                            break;
//                        case 2:
//
//                            i = 8;
//                            break;
//                        default:
//                            break;
//                    }
//                    startingNumber = setStartingNum(Integer.parseInt
//                            (userNumber));
//                    comparedToOne = compareNumberToOne(Integer.parseInt
//                            (userNumber));
//                    break;
//                case 8: // Get the sum result
//                    result = getSumResult(Integer.parseInt(userNumber),
//                            startingNumber, comparedToOne);
//                    System.out.print("The total SUM is:         ");
//                    System.out.print(result);
//                    i = 10;
//                    break;
//                case 9: // Get the product result
//                    result = getProductResult(Integer.parseInt(userNumber),
//                            startingNumber, comparedToOne);
//                    System.out.print("The total PRODUCT is:     ");
//                    System.out.print(result);
//                    i = 10;
//                    break;
//                default:
//                    break;
//            }
//        }
//        System.out.println("");
//        System.out.println("Bye Bye Now");
//        System.out.println("");
//    }
//
//    public String getUserNumber() {
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//        return s;
//    }
//
//    public boolean checkString(String s) {
//        if(s == null || s.length() < 1) {
//            return false;
//        } else {
//            return true;
//        }
//    }
//
//    public boolean checkValidString(String s) {
//        for(int i = 0; i < s.length(); i++) {
//            if(!Character.isDigit(s.charAt(i))) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public boolean checkValidNumber(String s) {
//        if(Integer.parseInt(s) < -2000000000 || Integer.parseInt(s) >
//                2000000000) {
//            return false;
//        }
//        return true;
//    }
//
//    public Integer parseToInteger(String s) {
//        return Integer.parseInt(s);
//    }
//
//    public String getUserChoice() {
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//        return s;
//    }
//
//    public int checkUserChoice(String s) {
//        String ans = s.toLowerCase();
//
//        if(ans.equals("sum")) {
//            return 1;
//        } else if(ans.equals("product")) {
//            return 2;
//        } else {
//            return 0;
//        }
//    }
//
//    public BigInteger setStartingNum(int userAnswer) {
//        if(userAnswer == 1) {
//            return BigInteger.valueOf(0);
//        } else {
//            return BigInteger.valueOf(1);
//        }
//    }
//
//    public Integer compareNumberToOne(Integer userNumber) {
//        if(userNumber < 1) {
//            return -1;
//        } else {
//            return 1;
//        }
//    }
//
//    public BigInteger convertInteger(Integer i) {
//        BigInteger bi = BigInteger.valueOf(i);
//        return bi;
//    }
//
//    public BigInteger getSumResult(Integer userNumber, BigInteger sum,
//                                   Integer numCompare) {
//        int n = userNumber;
//
//        if(numCompare == -1) {
//            for(int i = n; i < 2; i++) {
//                sum = sum.add(BigInteger.valueOf(i));
//            }
//        } else {
//            for(int i = n; i > 0; i--) {
//                sum = sum.add(BigInteger.valueOf(i));
//            }
//        }
//
//        return sum;
//    }
//
//    public BigInteger getProductResult(Integer userNumber, BigInteger product,
//                                       Integer numCompare) {
//        int n = userNumber;
//
//        if(numCompare == -1) {
//            for(int i = n; i < 2; i++) {
//                product = product.multiply(BigInteger.valueOf(i));
//            }
//        } else {
//            for(int i = n; i > 0; i--) {
//                product = product.multiply(BigInteger.valueOf(i));
//            }
//        }
//
//        return product;
//    }
//
//    public static void main(String[] args) {
//        SumOrProduct newGame = new SumOrProduct();
//        newGame.calculationGame();
//    }
//}
