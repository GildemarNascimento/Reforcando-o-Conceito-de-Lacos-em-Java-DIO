public class Program {
    public static void main(String[] args) {

        int i = 10;
        int j = 20;
        int k = 30;
        int a = i++ + --j * k; //10 + 19 * 30 -> 10 + 570 -> 580
        System.out.println("valor de a: " +a);
        System.out.println("i: "+i);

        int b = k/--i % 3 +1; // 30/10 % 3 + 1 = 1
        System.out.println("30/10 % 3 + 1 = 1: " + b);
        System.out.println("i: "+i); //10
        int c = 2;
        c *=i +=5;

        System.out.println("Valor de c: " + c);

        double d = (double) int;



    }
    private static void variaveis() {
        int i;
        //int i; nome reptetido não pode.
        int I; //Case sensitive diferencia miuscula de minuscula.
        //int 1a; Erro, não pode iniciar com números.
        int _1a; //Não é uma boa pratica iniciar variaveis com "_".
        int $aq; //Não é um boa pratica inicial com "$".
        //Atribuição de valores iniciais das variaveis.
        //Variaveis dentro de métodos deve ser privido seu valor inicial.
        i=5;
        I=10;
        _1a = 20;
        $aq = 7;

        final int j = 10;
        //j=15; Gera um erro final não pode o valor de variavel final não pode ser alterado.
        int asrn2$4678_md = 10; //Não é uma boa pratica variveis com "números", "$", "_".
        //int asrn2$46%78; Inválido caractere especial "%".

      //  log l = 999999999999999999l;
        float f1 = 4.5f;
    }
    private static void atribuicao(){
        int k = 10;

        int i = ++k; //Pré atribuição.
        int j = k--; //Pos atribuição.
        int x = k;   //Proxima atribuição o valor é decrementado.

        int a = 15;
        int b = 5;
        int c = a/b;
        int d =0;
        d += 5;

        System.out.println("Valor de c: " + c);

        System.out.println("i:  " +i);
        System.out.println("j: " +j);
        System.out.println("x: " +k);
        System.out.println("d: " +d);

    }
}
