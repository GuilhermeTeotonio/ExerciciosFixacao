package org.example;

import java.util.Locale;
import java.util.Scanner;

public class URI1021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Digite um valor monetário: ");

        double valor;
        valor = scanner.nextDouble();

        double a, b, c, d, e, f, ma, mb, mc, md, me, mf;

        a = 100;
        b = 50;
        c = 20;
        d = 10;
        e = 5;
        f = 2;
        ma = 1.00;
        mb = 0.50;
        mc = 0.25;
        md = 0.10;
        me = 0.05;
        mf = 0.01;

        int resto100 = 0;
        int resto50 = 0;
        int resto20 = 0;
        int resto10 = 0;
        int resto5 = 0;
        int i = 0;

        while (valor > 0) {
            if (valor >= 100 ) {
                resto100 = (int) (valor % 100);
                valor = valor - 100;
            } else if (valor >= 50) {
                resto50 = (int) (valor % 50);
                valor = valor - 50;
            }
        }

            //System.out.println(resto100);

           // System.out.printf("TOTAL = R$ %.2f\n" + resto100);
            System.out.println(valor);
            System.out.println(resto100);
            System.out.println(resto50);



            scanner.close();

    }

}

