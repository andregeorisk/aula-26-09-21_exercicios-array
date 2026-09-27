public class Questao04
{

    public static void main(String[] args) {
        //a
        Questao04 arrays = new Questao04();
        int[] notas = new int[3];
        float temp = arrays.digitaNota(notas);

        System.out.printf("A media eh %.2f", temp);
        
        //b
        int[] notas2 = new int[60];

        int temp2 = arrays.digitaNota2(notas2);

        System.out.println("A quantidade de numeros multiplos comuns de 3 e 5 eh: " + temp2);
    }

    public float digitaNota(int[] vet)
    {
        int soma = 0;
        int count = 0;
        int media = 0;

        for (int i = 0; i < vet.length; i++)
        {
            vet[i] = Teclado.leInt("Digite uma nota: ");

            if (vet[i] < 0.0 || vet[i] > 10.0)
            {
                do
                {
                    System.out.println("Nota inválida!!");
                    vet[i] = Teclado.leInt("Digite outra nota: ");
                }
                while (vet[i] < 0.0 || vet[i] > 10.0);
            }

            soma = soma + vet[i];
            count++;
        }

        return media = soma / count;
    }

    public int digitaNota2(int[] vet)
    {
        int num = 0;
        int count = 0;

        for (int i = 1; i < vet.length; i++)
        {
            if ((i % 3 == 0) && (i % 5 == 0))
            {
                vet[i] = i;

                System.out.println(vet[i]);

                count++;
            }
        }

        System.out.println("Esse sao multiplos comuns de 3 e 5");
        System.out.println("Tamanho do Array eh :" + vet.length);

        return count;
    }
}