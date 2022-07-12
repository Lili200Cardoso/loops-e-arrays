package br.com.dio.exercicios;

import java.util.Scanner;

public class Ex4_ParEImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int qtdNumeros;
        int numero;
        int qtdPares = 0;
        int qtdImpares = 0;

        System.out.println("Quantidade de Números: ");
        qtdNumeros = scan.nextInt();//quantidade de vezes que iremos inserir numeros...

        int cont = 0;
        do{
            System.out.println("Número: ");
            numero = scan.nextInt();

            if(numero % 2 == 0) qtdPares++;
            else qtdImpares++;

            cont++;
        } while(cont < qtdNumeros);

        System.out.println("Quantidade de números pares: " + qtdPares);
        System.out.println("Quantidade de números impares: " + qtdImpares);

    }
}
