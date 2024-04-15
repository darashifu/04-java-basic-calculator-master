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

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the first number:");
            double a = scanner.nextDouble();
            System.out.println("Enter the second number:");
            double b = scanner.nextDouble();
            System.out.println("Enter operator (+, -, *, /):");
            String operator = scanner.next();

            double result = 0;
            switch (operator) {
                case "+":
                    result = calculator.add(a, b);
                    break;
                case "-":
                    result = calculator.subtract(a, b);
                    break;
                case "*":
                    result = calculator.multiply(a, b);
                    break;
                case "/":
                    result = calculator.div(a, b);
                    break;
                default:
                    System.out.println("Invalid operator!");
                    return;
            }
            System.out.println("Result: " + result);
        }
    }

}

