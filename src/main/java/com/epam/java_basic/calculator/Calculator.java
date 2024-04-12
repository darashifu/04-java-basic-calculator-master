package com.epam.java_basic.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Double.POSITIVE_INFINITY;

public class Calculator {
    int precision = 2;


    public Calculator(int precision ) {
        this.precision = precision;
    }

    public double add(double a, double b) {
        double result = a + b;
        return result;
    }

    public double subtract(double a, double b) {
        double result = a - b;
        return result;
    }

    public double multiply(double a, double b) {
        double result = a * b;
        BigDecimal db = new BigDecimal(result).setScale(precision, RoundingMode.HALF_UP);
        double finalResult = db.doubleValue();
        return finalResult;
    }

    public double div(double a, double b) {
        double result = a / b;
        double negativeInfinity = Double.longBitsToDouble(0xfff0000000000000L);
        double positiveInfinity = Double.longBitsToDouble(0x7ff0000000000000L);
        if ( a < 0.0 && b == 0 ) {
            return negativeInfinity;}
            if (b == 0 && a > 0.0) {
                return positiveInfinity;}
                BigDecimal db = new BigDecimal(result).setScale(precision, RoundingMode.HALF_UP);
                double finalResult = db.doubleValue();
                return finalResult;
            }
        }
