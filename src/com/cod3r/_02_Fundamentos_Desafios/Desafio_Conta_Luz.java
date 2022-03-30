package com.cod3r._02_Fundamentos_Desafios;

import java.util.Scanner;

public class Desafio_Conta_Luz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o consumo diário de kw ");
        double diaria = entrada.nextDouble();

        System.out.println("Informe o numero de dias no mês ");
        double diames = entrada.nextDouble();

        double consumo = diaria * diames;
        System.out.printf("Consumo em kw no mês corresponde a : %.2f Kw", consumo);

        double valor = consumo * 0.46;

        System.out.printf("\n\nClassificação do valor R$/kWh no estado da Paraíba: " +
                "\nResidencial Mensal até 30 kWh                0,18138" +
                "\nResidencial Mensal de 31 kWh até 100 kWh     0,31094 " +
                "\nResidencial Mensal de 101 kWh até 220 kWh    0,46640");
        System.out.printf("\n\nValor a se pagar pelo consumo de kwh neste mês é : %.2f R$", valor);

        entrada.close();
    }
}