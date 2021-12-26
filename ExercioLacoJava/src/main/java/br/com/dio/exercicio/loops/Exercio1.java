package br.com.dio.exercicio.loops;

public class Exercio1 {
    /* Mostrar números de 3 até 11, sendo que itere de 2 em 2. Entretando, quando o loop passar pelo 7, este ser
    exibido.
     */
    public static void main(String[] args) {
        for (int i = 3; i <12;i+=2){
            if(i==7) continue;
            System.out.println(i);
        }
    }
}
