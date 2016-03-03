package com.adora.MonteCarlo;

/**
 * Created by BILL ADORA on 3/2/2016.
 */
public class Main {
    public static void main(String [] args) {
        double val1 = monteCarlo(10);
        double val2 = monteCarlo(20);
        double val3 = monteCarlo(40);
        double val4 = monteCarlo(80);
        double val5 = monteCarlo(160);
        System.out.println("n\t\t10\t\t\t\t\t20\t\t\t\t\t40\t\t\t\t\t80\t\t\t\t\t160");
        System.out.printf("%s\t%.2f\t\t\t\t%.2f\t\t\t\t%.2f\t\t\t\t%.2f\t\t\t\t%.2f","Y(n)", val1, val2, val3, val4, val5);
    }
    private static double monteCarlo(double n) {
        double a = 0.0;
        double b = Math.PI;
        double total = 0.0;
        for (int i = 0; i < n; i++){
            double x = Math.random();
            double rand = a + (x * (b - a));
            double sin = Math.sin(rand);
            total += sin;
        }
        return (total/n) * (b-a);
    }
}
