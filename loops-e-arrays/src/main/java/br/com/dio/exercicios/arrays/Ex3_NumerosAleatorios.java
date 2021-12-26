package br.com.dio.exercicios.arrays;

import java.util.Random;

/* Faça um programa qque leia 20 numeros inteiros (entre 0 e 100) armazene-o num vetor . Ao final mostre o
numero e seus sucessores.
 */
public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numerosAleatorios = new int[20];
        for (int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.println("Numeros aleatórios");
        for (int numero: numerosAleatorios) {
            System.out.print(numero + " ");
        }
        System.out.println("\nSucessores dos numeros aleatórios");
        for (int numero: numerosAleatorios) {
            System.out.print((numero + 1) + " ");
        }
    }
}

