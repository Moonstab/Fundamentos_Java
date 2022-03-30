package com.company._03_Estruturas_de_Controle;

import java.util.Scanner;

public class _03_IF_ELSE_IF {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.println("Seu conceito de nota  de 1 a 10 será avaliado.");
        System.out.println("Digite a nota: ");
        double nota = entrada.nextDouble();

        if (nota > 10 || nota < 0) {
            System.out.println("nota inválida");
        } else if (nota >= 8.5) {
            System.out.println("Conceito A");
            System.out.println("Parabéns!");
        } else if (nota >= 6.5) {
            System.out.println("Conceito B");
        } else if (nota >= 4.5) {
            System.out.println("Conceito C");
        } else if (nota >= 2.5) {
            System.out.println("Conceito D");
        } else {
            System.out.println("Conceito E");
        }
        System.out.println("Fim!");
        entrada.close();
    }
}