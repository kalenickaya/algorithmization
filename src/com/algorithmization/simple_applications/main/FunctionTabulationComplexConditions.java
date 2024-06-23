package com.algorithmization.simple_applications.main;

public class FunctionTabulationComplexConditions {

    public static void main(String[] args) {
        int A = 3 * (int)Math.pow(10, 3);
        int B = 6 * (int)Math.pow(10, 4);
        int M = 4;

        double T1 = Math.sqrt(A + B + M);
        double T2 = M * Math.sqrt(A + B);
        double T3 = Math.sqrt(A * B * M);
        double T4 = M * Math.sqrt(A * B);

        int count = 0;
        for (int K = -30; K <= 60 && count < 20; K++) {
            int fK = K * K * K - 25 * K * K + 50 * K + 1000;

            if ((fK > T1 && fK < T2) || (fK > T3 && fK < T4)) {
                System.out.printf("K = %-5d f(K) = %d\n", K, fK);
                count++;
            }
        }
    }
    
}