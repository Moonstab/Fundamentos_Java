package com.company._02_Fundamentos_Desafios;

import java.util.Scanner;

public class desafio_temperatura_fahrenheit {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura em fahrenheit  ");
        double f = entrada.nextDouble();

        double c = (f - 32) / 1.8;
        double k = (f + 459.67) * 5 / 9;

        System.out.printf("%.2f em Fahrenheit corresponde a: ", f);
        System.out.println();
        System.out.printf("%.2f Celcius ", c);
        System.out.println();
        System.out.printf("%.2f Kelvin ", k);
        entrada.close();
    }
}

