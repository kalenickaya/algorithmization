package com.algorithmization.simple_applications.main;

public class TableOfValues {

    public static void main(String[] args) {
        double a = 0.50;
        double b = 1.00;
        int n = 10;

        for (int i = 1; i <= n; i++) {
            double x = a + (b - a) * i / n;
            double result = calculateFormula(x);
            System.out.printf("%2d.  x = %-9.6f f(x) = %.6f\n", i, x, result);
        }
    }

    public static double calculateFormula(double x) {
        return Math.sqrt(Math.pow(Math.E, 2.2 * x)) - Math.abs(Math.sin(Math.PI * x / (x + 2 / 3.0))) + 1.7;
    }

}
