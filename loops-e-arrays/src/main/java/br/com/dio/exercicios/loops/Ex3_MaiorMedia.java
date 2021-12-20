package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex3_MaiorMedia {
    /* Faça um programa que leia 5 numeros e informe o maior número e a média desse números.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, count =0, maior =0, soma = 0;

        do {
            System.out.println("Número: ");
            numero = sc.nextInt();
            soma += numero;
            if (numero > maior) maior = numero;
            count ++;
        }while (count < 5);

        System.out.println("Maior valor " + maior);
        System.out.println("Media " + soma/count);

        System.out.println("Fim do programa");
    }
}
