package com.algorithmization.simple_applications.main;

import java.util.Scanner;

public class PointInRegionChecker {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество точек: ");
        int n = scanner.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Введите координату x точки " + (i+1) + ": ");
            int x = scanner.nextInt();
            System.out.print("Введите координату y точки " + (i+1) + ": ");
            int y = scanner.nextInt();

            if (isInRegion1(x, y) || isInRegion2(x, y)) {
                count++;
            }
        }

        System.out.println("Количество точек в заданной области: " + count);
        
        scanner.close();
    }

    private static boolean isInRegion1(int x, int y) {
        return x >= -2 && x <= 1 && y >= 0 && y <= 2;
    }

    private static boolean isInRegion2(int x, int y) {
        return x >= -1 && x <= 2 && y >= -2 && y <= 1;
    }
    
}
