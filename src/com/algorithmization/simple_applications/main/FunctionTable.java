package com.algorithmization.simple_applications.main;

public class FunctionTable {
	
    public static void main(String[] args) {
        double A = 1.0;
        double X1 = -2 * A;
        double dX = A / 5.0;
        int N = 10;

        System.out.printf("%-7s %-10s%n", "X", "Y");

        for (int i = 0; i < N; i++) {
            double x = X1 + i * dX;
            double y = calculateY(A, x);
            System.out.printf("%-7.2f %-10.4f%n", x, y);
        }
    }

    public static double calculateY(double A, double x) {
        if (x <= 0) {
            return (A / 2) * (Math.exp(x / A) + Math.exp(-x / A));
        } else {
            return 4 * Math.pow(A, 3) / (Math.pow(x, 2) + 4 * Math.pow(A, 2));
        }
    }
    
}