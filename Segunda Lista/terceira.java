import java.util.Scanner;

public class terceira {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = 1;

        while (n != 0) {
            System.out.println("Digite o tamanho do conjunto - Digite 0 para parar o programa");
            n = ler.nextInt(); // n é tamanho do conjunto

            // Declarando vetores
            int vetorA[] = new int[n];
            int vetorB[] = new int[n];
            int vetorC[] = new int[n]; // Vetor de Soma

            for (int i = 0; i < vetorA.length; i++) { // atribindo valores ao primeiro vetor
                System.out.println("Digite um valor para o primeiro vetor [" + (i + 1) + "]");
                vetorA[i] = ler.nextInt();
            }

            for (int i = 0; i < vetorA.length; i++) { // atribindo valores ao segundo vetor
                System.out.println("Digite um valor para o segundo vetor [" + (i + 1) + "]");
                vetorB[i] = ler.nextInt();
            }

            if(n!=0){
                System.out.println("Imprimindo vetor com os vetores somados");
            }

            for (int i = 0; i < vetorA.length; i++) {
                for (int j = 0; j < vetorA.length; j++) {
                    vetorC[j] = (vetorA[i] + vetorB[j]);
                }
                System.out.println("Vetor A - [" + (i + 1) + "] " + vetorA[i]);
                System.out.println("Vetor B - [" + (i + 1) + "] " + vetorB[i]);
                System.out.println("Vetor Soma - [" + (i + 1) + "] " + vetorC[i]);
            }

        }

        ler.close();
    }
}

/*
 * Faça um programa que lê os vetores A e B, ambos com N elementos, e calcule o
 * vetor
 * C onde cada elementos do vetor é a soma do vetor com o vetor B.
 * Exemplo:
 * A = {1, 2, 3, 4, 5}
 * B = {2, 2, 3, 3, 4}
 * Resposta: C = {3, 4, 6, 7, 9}
 */