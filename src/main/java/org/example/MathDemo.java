package org.example;

import static java.lang.Math.*;

public class MathDemo {
    public static void main(String[] args) {
        double x = 8.1, a = 2.5, b = 7.7, c = -4.32;
        double y = (exp(a * cos(x+2))) - ((exp(- sin(b * x)))/(c - cbrt(x)));

        System.out.printf("Result: %.3f\n", y);
    }
}