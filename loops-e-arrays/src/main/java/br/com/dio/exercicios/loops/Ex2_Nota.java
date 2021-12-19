package br.com.dio.exercicios.loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/* Faça um programa que peça uma nota, entre 0 e 10. Mostre uma mensagem caso o valor seja invalido e continue
pedido até que o usuário informe um valor que seja válido.
 */
public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        System.out.println("Nota: ");
        nota = sc.nextInt();

        while (nota < 0 | nota > 10){
            System.out.println("Nota invalida! Digite novamente");
            nota = sc.nextInt();
        }
        System.out.println("Nota informada: " + nota);
    }
}
