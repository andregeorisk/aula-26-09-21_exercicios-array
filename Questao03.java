public class Questao03 {

    public static void main(String[] args) {
        //a
        int impar = 1;
        int [] v = new int [10];

        for (int i = 0; i < v.length; i++) {
            v[i] = impar;
            impar = impar + 2;
        }
        
        //b
        Questao03 arrays = new Questao03();
        double[] notas = new double[3];
        double temp = arrays.digitaNota(notas);
        
        System.out.println("A media eh" + temp);
    }
    
    public double digitaNota(double[] vet){
        double soma = 0;
        int count = 0;
        double media = 0;
        
        for (int i = 0; i < vet.length; i++){
            vet[i] = Teclado.leDouble("Digite uma nota: ");
            
            if(vet[i] < 0 || vet[i] > 10.0){
                do{
                    System.out.println("Nota invalida!!");
                    vet[i] = Teclado.leDouble("\nDigite outra nota: ");
                }
                while (vet[i] < 0.0 || vet[i] > 10.0);
            }
            soma = soma + vet[i];
            count++;
        }
        return media = soma / count;
    }
}