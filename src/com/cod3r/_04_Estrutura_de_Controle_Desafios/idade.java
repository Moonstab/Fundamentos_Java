package _04_Estrutura_de_Controle_Desafios;

import java.util.Scanner;

public class idade {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int idade, qtAno, qtMes, qtDia, sobra;
        int horas, minutos, segundos;
        int qtSemana;
        //assumindo que todos os anos possuem 365 para dar valor inteiro
        System.out.println("Digite o número ");
        System.out.print("dias: ");
        idade = userInput.nextInt();

        qtAno = idade / 365;
        sobra = idade % 365;
        qtMes = sobra / 30;
        qtDia = sobra % 30;
        qtSemana = idade / 7;
        horas = idade * 24;
        minutos = 60 * horas;
        segundos = 3600 * horas;
        System.out.println("----Você esta vivo há:\n" + qtAno + " Ano(s)\n" + qtMes + " Meses\n" + qtDia + " Dias\n" + "total de semanas: " + qtSemana);
        System.out.println("----Você possui : \n" + horas + " horas\n" + minutos + " minutos\n" + segundos + " segundos");
    }
}
