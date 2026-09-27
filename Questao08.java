public class Questao08 {

    public static void main(String[] args) {
        //a
        Questao08 array = new Questao08();

        int[][] matriz = new int[2][2];

        double temp = array.calculaMedia(matriz);

        System.out.println("\nA media eh " + temp);
        
        //b
        int[][] matriz2 = new int[10][10];

        int temp2 = array.multiplos(matriz2);

        System.out.println("\nA qtd de multiplos de 3 e 5 eh: " + temp2);
    }

    public double calculaMedia(int[][] matriz) {

        int count = 0;
        double soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = Teclado.leInt("Digite um numero: ");

                soma = soma + matriz[i][j];
                count++;
            }
        }

        return soma / count;
    }

    public int multiplos(int[][] matriz2) {

        int count = 0;

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {

                matriz2[i][j] = (int)(Math.random() * 100) + 1;

                if ((matriz2[i][j] % 3 == 0) && (matriz2[i][j] % 5 == 0)) {
                    System.out.println(matriz2[i][j]);
                    count++;
                }
            }
        }

        return count;
    }
}