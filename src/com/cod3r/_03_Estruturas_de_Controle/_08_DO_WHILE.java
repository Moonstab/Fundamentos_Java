package com.cod3r._03_Estruturas_de_Controle;

import java.util.Scanner;

public class _08_DO_WHILE {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = "";

        do {
            System.out.println();
            System.out.println("Quer sair? você precisa falar as palavras mágicas...");
            texto = entrada.nextLine();

        } while (!texto.equalsIgnoreCase("por favor"));

        System.out.println("Muito bem, obrigado!");
        entrada.close();
    }
}