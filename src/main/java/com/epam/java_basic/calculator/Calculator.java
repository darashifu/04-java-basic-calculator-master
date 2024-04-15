package com.epam.java_basic.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Double.POSITIVE_INFINITY;

public class Calculator {
    private static final int DEFAULT_PRECISION = 2;
    int precision = 2;


    public Calculator(int precision ) {
        this.precision = precision;
    }

    public double add(double a, double b) {
        BigDecimal result = BigDecimal.valueOf(a).add(BigDecimal.valueOf(b));
        return result.setScale(precision, RoundingMode.HALF_UP).doubleValue();
    }

    public double subtract(double a, double b) {
        BigDecimal result = BigDecimal.valueOf(a).subtract(BigDecimal.valueOf(b));
        return result.setScale(precision, RoundingMode.HALF_UP).doubleValue();
    }

    public double multiply(double a, double b) {
        BigDecimal result = BigDecimal.valueOf(a).multiply(BigDecimal.valueOf(b));
        return result.setScale(precision, RoundingMode.HALF_UP).doubleValue();
    }


    public double div(double a, double b) {
        if (b == 0) {
            return a < 0 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;}
        BigDecimal result = BigDecimal.valueOf(a).divide(BigDecimal.valueOf(b), precision, RoundingMode.HALF_UP);
        return result.doubleValue();
    }

}
