package com.algorithmization.simple_applications.main;

public class SumProductAccumulation {
	
    public static void main(String[] args) {
        double x = 0.5;
        int n = 20;
        
        double result = computeSum(x, n);
        
        System.out.printf("Результат вычисления по формуле при x = %.1f и n = %d: %f", x, n, result);
    }

    public static double computeSum(double x, int n) {
        double sum = 0.0;

        for (int k = 1; k <= n; k++) {
            double numerator = (Math.sin(k * x / 2) + Math.sin((k * x - 1) / 2));
            double denominator = Math.exp(x - 1.0 / k);
            sum += numerator / denominator;
        }

        return Math.sqrt(n * Math.PI) * sum;
    }
    
}
