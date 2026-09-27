public class Questao07 
{
    public static void main(String[] args) {
        //a
        Questao07 array = new Questao07();

        int[][] matriz = new int[5][5];

        int temp = array.impares(matriz);

        System.out.println("\nA qtd de ímpares eh " + temp);
        
        //b
        int lin = Teclado.leInt("Digite a quantidade de linhas (4): ");
        int col = Teclado.leInt("Digite a quantidade de colunas (4): ");
        
        int[][] matriz2 = new int[lin][col];

        int temp2 = array.numAleatorios(matriz);

        System.out.println("\nA qtd de numeros eh " + temp2);
    }

    public int impares(int[][] matriz) {

        int count = 0;
        int x = 1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = x;
                System.out.println(matriz[i][j]);

                x = x + 2;
                count++;
            }
        }

        return count;
    }

    public int numAleatorios(int[][] matriz2) {

        int count = 0;

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {

                matriz2[i][j] = 10 + (int)(Math.random() * 41);

                System.out.println(matriz2[i][j]);

                count++;
            }
        }

        return count;
    }
}