package br.com.dio.exercicios.loops;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuario.
Ex.: 5! = 120.
 */
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fator;
        System.out.println("Insira o fator: ");
        fator = sc.nextInt();
        int fatorial = 1;


        for(int i = fator; i>1; i--){
            fatorial = fatorial * i;
        }
        System.out.println("Fatorial de " + fator+"! " + "= " + fatorial);
    }
}
