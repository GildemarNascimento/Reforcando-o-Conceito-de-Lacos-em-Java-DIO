package br.com.dio.exercicios.arrays;

import java.util.Random;

/* Gere e imprima uma matriz m 4x4 com valores aleatórios  entre 0-9.

 */
public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random randon = new Random();
        int [][] m = new int[4][4];

        for (int i = 0; i<m.length;i++){
            for (int j=0;j<m[i].length;j++){
                m[i][j] = randon.nextInt(9);
            }

        }

        for (int[] lina : m) {
            for (int coluna : lina ) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
    }
}
