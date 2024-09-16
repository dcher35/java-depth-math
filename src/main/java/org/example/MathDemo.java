package org.example;

public class MathDemo {
    public static void main(String[] args) {
        double x = 8.1, a = 2.5, b = 7.7, c = -4.32;
        double y = (Math.exp(a * Math.cos(x+2))) - ((Math.exp(- Math.sin(b * x)))/(c - Math.cbrt(x)));

        System.out.printf("Result: %.3f\n", y);
    }
}