package com.cod3r._04_Estrutura_de_Controle_Desafios;

import java.util.Scanner;

public class _4_prime_numbers {
    public static void main(String[] args) {
        System.out.println("Check if the imput\n" +
                "number is a prime number");

        int ContadorDivisores = 0;
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                ContadorDivisores++;
            }
        }
        if (ContadorDivisores == 0) {
            System.out.println("\nThe number " + a + " is a prime number");
        } else {
            System.out.println("\nThe number " + a + " is not a prime number");
        }
        System.out.println("End");
        entrada.close();
    }
}
