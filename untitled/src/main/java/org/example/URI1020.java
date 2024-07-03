package org.example;

import java.util.Scanner;

public class URI1020 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade em dias: ");

        int dias, ano, mes, restoAno;

         int x = scanner.nextInt();
         ano = x / 365;
         mes  = (x % 365) / 30 ;
         dias = ((x % 365) % 30) ;



        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dias + " dia(s)");


        scanner.close();
    }
}
