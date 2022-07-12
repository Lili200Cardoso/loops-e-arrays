package br.com.dio.exercicios;

public class OrdemInversa {

    public static void main(String[] args) {

        int[] array = {2,5,1,3,90,-1};

        int cont = 0;
        while(cont < array.length){
            System.out.print(array[cont] + " ");
            cont++;
        }
        System.out.println("");

        for(int i =(array.length - 1); i >= 0; i-- ){
            System.out.print(array[i] + " ");
        }
    }
}
