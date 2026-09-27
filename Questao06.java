public class Questao06 {

    public static void main(String[] args) {

        int[][] matriz;
        int lin = Teclado.leInt("Digite a quantidade de linhas (6): ");
        int col = Teclado.leInt("Digite a quantidade de colunas (4): ");
        
        matriz = new int[lin][col];

        System.out.println("c) O valor de matriz[1][3] é: " + matriz[1][3]);

        double[][] notas;

        char[][] letras;

        System.out.println("a) Matriz declarada: int[][] matriz;");
        System.out.println("b) Matriz instanciada: matriz = new int[" + lin + "][" + col + " ];");
        System.out.println("c) Valor de matriz[1]" + matriz[1][3]);
        System.out.println("d) Matriz declarada: double[][] notas;");
        System.out.println("e) Matriz declarada: char[][] letras;");
    }
}