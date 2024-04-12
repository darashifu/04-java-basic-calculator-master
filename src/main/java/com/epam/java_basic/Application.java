package com.epam.java_basic;
import com.epam.java_basic.calculator.Calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;




/**
 * Application's entry point, use it to demonstrate your code execution
 */
public class Application {

    public static void main(String[] args) {
        int precision = 2;
        Calculator calculator = new Calculator(precision);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        Scanner temp = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double a = temp.nextDouble();
        System.out.println("Enter the second number:");
        double b = temp.nextDouble();
        System.out.println("Enter operator (+, -, *, /):");
        String operator = temp.next();

        if (operator.equals("+")) {
            double result = calculator.add(a, b);
            System.out.println("Result: " + (result));
        }
        if (operator.equals("-")) {
            double result2 = calculator.subtract(a, b);
            System.out.println("Result: " + result2);
        }
        if (operator.equals("*")) {
            double result3 = calculator.multiply(a, b);
            System.out.println("Result: " + result3);
        }
        if (operator.equals("/")) {
            double result4 = calculator.div(a, b);
            System.out.println("Result: " + result4);
        }
    }
}

