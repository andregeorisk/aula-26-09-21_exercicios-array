public class Questao05 {

    public static void main(String[] args) {

        int[][] mat = {
            {13, 45, 12, 19},
            {67, -5, 88, 37},
            {11, 43, 13, 0},
            {64, 52, 29, 18},
            {71, 14, 19, 62}
        };

        System.out.println("a) Quantas linhas tem a matriz? " + mat.length);

        System.out.println("b) Quantas colunas tem a matriz? " + mat[0].length);

        System.out.println("c) O valor 19 está armazenado em mat[0][3] e mat[4][2]");

        System.out.println("d) O valor exibido por mat[1][1] é: " + mat[1][1]);

        System.out.println("e) O valor exibido por mat[2][0] + 1 é: " + (mat[2][0] + 1));

        System.out.println("f) O valor exibido por mat[3+1][3-1] é: "
                + mat[3 + 1][3 - 1]);

        int x = Teclado.leInt("Insira o valor 2: ");
        System.out.println("g) O valor exibido por mat[x][x] é: "
                + mat[x][x]);

        System.out.println("h) O valor exibido por mat[x+1][x] é: "
                + mat[x + 1][x]);

        System.out.println("i) O valor exibido por mat[x][x] + 1 é: "
                + (mat[x][x] + 1));

        System.out.println("j) O valor exibido por mat.length é: "
                + mat.length);

        System.out.println("k) O valor exibido por mat[mat.length-1][1] é: "
                + mat[mat.length - 1][1]);

        System.out.println("l) A matriz tem "
                + (mat.length * mat[0].length)
                + " números armazenados.");
    }
}