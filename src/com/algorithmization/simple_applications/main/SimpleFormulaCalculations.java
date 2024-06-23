package com.algorithmization.simple_applications.main;

public class SimpleFormulaCalculations {

	public static void main(String[] args) {
		double x = 0.5;
		
		double result = calculateFormula(x);
		
		System.out.printf("Результат вычисления по формуле при x = %.1f: %.5f", x, result);
	}

	public static double calculateFormula(double x) {
		return Math.sqrt(Math.pow(Math.E, 2.2 * x)) - Math.abs(Math.sin(Math.PI * x / (x + 2 / 3.0))) + 1.7;
	}

}