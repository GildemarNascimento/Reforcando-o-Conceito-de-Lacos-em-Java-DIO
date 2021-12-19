package br.com.dio.exercicios.loops;
/* Faça um programa que conjunto de dois valores, o primeiro respresenta o nome do aluno e o segundo  a idade.
(Para o programa inserido o valor zero "0" no campo nome).
 */

import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String nome;
        int idade;

        while (true){
            System.out.print("Nome: ");
            nome = sc.next();
            if(nome.equals("0")) break;
            System.out.print("Idade: ");
            idade = sc.nextInt();
        }
        System.out.println("Fim de execução.");
    }
}
