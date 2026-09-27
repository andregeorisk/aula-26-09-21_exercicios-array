public class Questao01 {

    public static void main(String[] args) {

        int[] a = {507, -15, 147, 2194, 300, 27, 888, -110, 0, 675};

        System.out.println("a) O índice do terceiro elemento do array a é: " + 2);

        System.out.println("b) O conteúdo do terceiro elemento do array a é: " + a[2]);

        System.out.println("c) O índice do primeiro elemento do array a é: " + 0);

        System.out.println("d) O conteúdo do primeiro elemento do array a é: " + a[0]);

        System.out.println("e) O índice do elemento onde está armazenado o valor 888 é: " + 6);

        System.out.println("f) O valor exibido por System.out.println(a[5]) é: " + a[5]);

        System.out.println("g) O valor exibido por System.out.println(a[5] + 2) é: " + (a[5] + 2));

        System.out.println("h) O valor exibido por System.out.println(a[5 + 2]) é: " + a[5 + 2]);

        int x = Teclado.leInt("Informe o valor 2 para x");
        int y = Teclado.leInt("Informe o valor 4 para y");
        
        System.out.println("i) O valor exibido por System.out.println(a[x] + a[y] + 1) é: "
                + (a[x] + a[y] + 1));

        System.out.println("j) O valor exibido por System.out.println(a[x + y + 1]) é: "
                + a[x + y + 1]);

        System.out.println("k) O valor exibido por System.out.println(a.length) é: "
                + a.length);

        System.out.println("l) O valor exibido por System.out.println(a[a.length - 1]) é: "
                + a[a.length - 1]);
    }
}