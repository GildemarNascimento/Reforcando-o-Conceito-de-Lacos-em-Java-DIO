package br.com.dio.exercicio.loops;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] idades = new int[10];
        idades[0] = 27; idades[1] = 31;
        System.out.println("idades[0] " + idades[0]);
        System.out.println("idades[1] " + idades[1]);
        System.out.println("idades[2] " + idades[2]);
        System.out.println("\n__________________________");

        int[] i = {10,25};
        System.out.println("i[0] " + i[0]);
        System.out.println("i[1] " + i[1]);
        System.out.println("\n__________________________");

        int[] k = new int[] {1,2,3};
        System.out.println("k[0] " + k[0]);
        System.out.println("i[1] " + k[1]);
        System.out.println("i[2] " + k[2]);
        System.out.println("\n__________________________");

        int[] j = new int[2];
        System.out.println("j[0] j[1] " + j[0] + j[1]);
        System.out.println("\n__________________________");

        idades = new int[] {12, 35, 45, 22, 9, 37, 51, 61};

        for (int idade:idades) {
            System.out.println("Idade: "+ idade);
        }
        System.out.println("\n__________________________");

        for (int a = 0; a < idades.length; a++){
            int idade = idades[a];
            System.out.println("idade: " + idade);
        }
        System.out.println("\n__________________________");

        for (int idade : idades) {
            if(idade >= 18){
                System.out.println("Idade " + idade + " Maior idade");
            }
        }
        for (int a = 0; a<idades.length; a++){
            int idade = idades[a];
            if (idade >= 18)
                System.out.println("Idade " + idade + " Maior idade");
        }

        System.out.println("\n__________________________");

        long [][] m = new long[3][3];

        char[][] jogo = new char[3][3];
        jogo[0][0] = 'x';
        jogo[2][1] = '0';
        System.out.println("Posição 0 = " + jogo[0][0]);
        System.out.println("Posição 8 = " + jogo[2][1]);

        int [][][] n = new int[3][3][3];
        n[0][0][0] = 10;
        n[1][1][0] = 15;

        int[][] b = new int[][] {{1,2},{3,4}};
        int[][] l = {{5,6},{7,8}};
        int[][][] t = new int[][][] {{{1,2},{2,3},{4,5}}};
        int[][][] x = {{{9,10},{11,12},{13,14}}};

        int[][] idades_ = new int[][] {{12,35},{45,22}};

        for (int[] idade1 : idades_) {
            for (int idade2 : idade1) {
                System.out.println(idade2);
            }
        }

        for (int a = 0; a < idades_.length; a++){
            int[] idade1 = idades_[a];
            for (int u = 0; u < idade1.length; u++){
                System.out.println(idades_[a][u]);
            }
        }

        byte[] bytes = new byte[2];
        bytes[1] = 100;

        float[] floats = new float[2];
        floats[1] = 10.98f;

        for (byte b_: bytes) {
            System.out.println("byte: + " + b_);
        }

        for (float f : floats) {
            System.out.println("float: " + f);
        }

    }
}
