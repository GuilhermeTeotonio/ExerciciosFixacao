package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome = new String();
        double salarioFixo, totalVendas, salarioTotal;


        nome = scanner.nextLine();
        salarioFixo = scanner.nextDouble();
        totalVendas = scanner.nextDouble();

        salarioTotal = salarioFixo + totalVendas * 0.15;

        System.out.printf("TOTAL = R$ %.2f\n", salarioTotal);

        scanner.close();
        }
    }