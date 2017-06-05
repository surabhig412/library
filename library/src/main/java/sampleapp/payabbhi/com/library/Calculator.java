package sampleapp.payabbhi.com.library;

/**
 * Created by surabhigupta on 02/06/17.
 */

public class Calculator {
    public void add(int num1, int num2) {
        int num3 = addNumbers(num1, num2);
        System.out.println("Adding numbers: " + num3);
    }

    private int addNumbers(int number1, int number2) {
        return number1 + number2;
    }
}
