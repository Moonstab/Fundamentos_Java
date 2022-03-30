package com.company._02_Fundamentos_Desafios;

import java.util.Scanner;

public class desafio_IMC {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Cálculo de IMC adulto");

        System.out.println("informe seu peso, exemplo: 78  ");
        double p = entrada.nextDouble();

        System.out.println("informe sua altura, exemplo: 1,75  ");
        double a = entrada.nextDouble();

        double imc = p / (a * a);

        if (imc < 1 || imc > 99) {
            System.out.println("Seu IMC é humanamente impossível.");
        } else if (imc <= 18.5) {
            System.out.format("Seu IMC é : %.2f", imc);
            System.out.println("\nClassificação: Magreza");
        } else if (imc <= 24.9) {
            System.out.format("Seu IMC é : %.2f", imc);
            System.out.println("\nClassificação: Normal");
        } else if (imc <= 29.9) {
            System.out.format("Seu IMC é : %.2f", imc);
            System.out.println("\nClassificação: Sobrepeso - Grau 1");
        } else if (imc <= 39.9) {
            System.out.format("Seu IMC é : %.2f", imc);
            System.out.println("\nClassificação: Obesidade - Grau 2");
        }else if (imc > 40) {
            System.out.format("Seu IMC é : %.2f", imc);
            System.out.println("\nClassificação: Obesidade - Grau 3");
        }
        System.out.println("Fim!");
        entrada.close();
    }
}

