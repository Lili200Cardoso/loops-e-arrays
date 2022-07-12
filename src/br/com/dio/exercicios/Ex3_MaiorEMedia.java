package br.com.dio.exercicios;

import java.util.Scanner;

public class Ex3_MaiorEMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n;
        int maior = 0;
        int media;
        int soma = 0;


        int cont = 0;
        do {
            System.out.println("Digite um número: ");
            n = scan.nextInt();
            soma = soma + n;
            if (n > maior) maior = n;
            cont = cont + 1;
        }while(cont < 5);

        System.out.println("Maior: " + maior);
        media = soma / 5;
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}
