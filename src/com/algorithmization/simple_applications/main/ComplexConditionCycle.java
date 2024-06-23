package com.algorithmization.simple_applications.main;

public class ComplexConditionCycle {
	
    public static void main(String[] args) {
        double x = 0.1;
        double step = 0.1;
        double limit = 10;
        
        while (x <= limit) {
            double functionValue = Math.pow(x, 2) - Math.exp(2 * x) + 4;
            System.out.printf("x = %-5.1f f(x) = %.5f\n", x, functionValue);

            if (functionValue == 0 || (x > 0.1 && functionValue * (Math.pow(x - step, 2) - Math.exp(2 * (x-step)) + 4) < 0)) {
                System.out.println("Пройден нуль функции.");
                break;
            }
            
            x += step;
        }
    }
    
}
