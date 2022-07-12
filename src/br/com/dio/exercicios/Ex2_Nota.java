package br.com.dio.exercicios;

import java.util.Scanner;

public class Ex2_Nota {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int nota = 0;

        System.out.println("Digite uma nota válida: ");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Digite novamente: ");
            nota = scan.nextInt();
        }
    }
}