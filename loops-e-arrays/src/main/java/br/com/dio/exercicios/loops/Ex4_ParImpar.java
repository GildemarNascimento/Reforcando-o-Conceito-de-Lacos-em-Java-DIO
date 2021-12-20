package br.com.dio.exercicios.loops;

import java.util.Scanner;

/* Faça um programa que peça N números inteiros, calcule e mostre a quantidade dos números pares  e quantidade
de números impares.
 */
public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantNumeros, count = 0, numero,pares = 0, impares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = sc.nextInt();

        do{
            System.out.println("Numero: ");
            numero = sc.nextInt();
            count ++;
            if (numero % 2 ==0) pares++;
            else impares++;
        }while (count < quantNumeros);

        System.out.println("Números pares: " + pares);
        System.out.println(("Números impares: " +impares));

    }
}
