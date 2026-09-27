public class Questao02 {

    public static void main(String[] args) {

        int[] vet;

        System.out.println("b) Após a declaração, vet = null");

        vet = new int[Teclado.leInt("Defina o tamanho do array para 15")];

        System.out.println("d) O valor de vet[5] é: " + vet[5]);

        int tam = vet.length;
        System.out.println("e) O valor de tam é: " + tam);

        System.out.println("f) O último elemento do array vet é vet[14] = " + vet[14]);

        System.out.println("g) O índice do primeiro elemento do array vet é: 0");

        double[] medias = new double[20];
        System.out.println("h) O array medias possui tamanho: " + medias.length);
    }
}