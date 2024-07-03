package org.example;
import java.util.Locale;
import java.util.Scanner;

public class URI1002 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double raio = scanner.nextDouble();
        double N = 3.14159;
        double raioDois = raio * raio;

        double A = N * raioDois;
        System.out.printf("A=%.4f\n",A);

        scanner.close();

    }
}
