package br.com.dio.exercicios.loops;

import java.util.Scanner;

class Ex5_Tabuada {
    /* Desevolva um gerado de tabuada, capaz de gerar tabuada de qualquer número inteiro entre 1 e 10. O usuario
    deve informar de qual número ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:

    Tabuada de 5
    5 x 1 = 5
    5 x 2 = 10
    ....
    5 x 10 = 50

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tabuada;
        System.out.println("Tabuada: ");
        tabuada = sc.nextInt();
        System.out.println("Tabauada de " + tabuada);
        for (int i = 0; i<11; i++){
            System.out.println(tabuada + " x " + i + " = " + tabuada*i);
        }
    }
}
