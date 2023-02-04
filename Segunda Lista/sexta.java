import java.util.Scanner;

public class sexta {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int vetorA[] = new int[10];
        int vetorB[] = new int[3];
        boolean control = false;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite um valor para o vetor A");
            vetorA[i] = ler.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Digite um valor para o vetor B");
            vetorB[i] = ler.nextInt();
        }

        for (int x = 0; x < vetorA.length; x++) {
            for (int j = 0; j < vetorB.length; j++) {
                if (vetorA[x] == vetorB[j])
                    control = true;
            }
        }

        if (control)
            System.out.println("Todos os elementos do vetor B estão contidos no vetor A");

        ler.close();
    }
}

/*
 * Desenvolva um programa em Java que leia um vetor A com 10 elementos e um
 * vetor
 * B com três elementos. Ao final o programa deverá indicar se todos os
 * elementos de B
 * estão contidos no vetor A.
 */
