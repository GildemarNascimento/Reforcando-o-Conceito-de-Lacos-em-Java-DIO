package br.com.dio.exercicios.arrays;

import java.util.Scanner;

/* Faça um programa que leia um vetor de caracteres, e diga quantas consoates foram lidas, imprima as consoates.

 */
public class Ex2_Consoates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] consoates = new String[6];
        int count = 0;
        int qtdConsoates=0;

        do {
            System.out.println("Insira uma letra: ");
            String letra = sc.next();

            if(!(letra.equalsIgnoreCase("a")|
                letra.equalsIgnoreCase("e")|
                letra.equalsIgnoreCase("i")|
                letra.equalsIgnoreCase("o")|
                letra.equalsIgnoreCase("u"))){
                    consoates[count]= letra;
            }
            count++;

        }while (count < consoates.length);

        for (String consoate: consoates){
            if (consoate != null)
                System.out.println(consoate);
        }
    }
}
