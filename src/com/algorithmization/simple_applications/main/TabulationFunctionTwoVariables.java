package com.algorithmization.simple_applications.main;

import java.util.Scanner;

public class TabulationFunctionTwoVariables {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Введите количество значений (n): ");
		int N = scanner.nextInt();

		System.out.print("Введите начальное значение X (Xнач): ");
		double Xнач = scanner.nextDouble();

		System.out.print("Введите шаг для X (HX): ");
		double HX = scanner.nextDouble();

		System.out.print("Введите количество значений (m): ");
		int M = scanner.nextInt();

		System.out.print("Введите начальное значение Z (Zнач): ");
		double Zнач = scanner.nextDouble();

		System.out.print("Введите шаг для Z (HZ): ");
		double HZ = scanner.nextDouble();

		System.out.printf("%-7s %-10s %-7s\n", "X", "Y", "Результат");
		for (int i = 0; i < N; i++) {
			double X = Xнач + i * HX;
			for (int j = 0; j < M; j++) {
				double Z = Zнач + j * HZ;
				double result = calculateFunction(X, Z);
				System.out.printf("%-7.2f %-10.2f %-7.5f\n", X, Z, result);
			}
		}

		scanner.close();
	}

	private static double calculateFunction(double x, double z) {
		double term1 = Math.sqrt(z * z + x * x) * Math.log(z);
		double term2 = Math.abs(Math.log(z)) / Math.sqrt(x * x - z * z + 3.2);
		return term1 + term2;
	}
	
}