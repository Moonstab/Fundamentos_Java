package com.company._02_Fundamentos_Desafios;

import java.util.Scanner;

public class desafio_bhaskara {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Equação : Ax² + Bx + C = 0");

        System.out.println("digite o valor de A ");
        double A = scanner.nextDouble();

        System.out.println("digite o valor de B ");
        double B = scanner.nextDouble();

        System.out.println("digite o valor de C ");
        double C = scanner.nextDouble();

        double delta = (B * B) - (4 * A * C);
        //System.out.print("valor de delta é: " + delta);

        if (delta < 0) {
            System.out.print("valor de delta é: " + delta);
            System.out.format("\nA equação não possui resultados reais");
        } else if (delta == 0) {
            System.out.format("\nEntão a equação possui apenas um resultado real ou " +
                    "\n dois resultados iguais (essas duas afirmações são equivalentes");
        } else if (delta > 0) {
            System.out.format("\nA equação possui dois resultados distintos reais.");
        }

        double x1 = (-B + Math.sqrt(delta)) / (2 * A);
        System.out.printf("\no x1 positivo é: %.2f", x1);

        double x2 = (-B - Math.sqrt(delta)) / (2 * A);
        System.out.printf("\no x2 negativo é: %.2f", x2);
        scanner.close();
    }
}

