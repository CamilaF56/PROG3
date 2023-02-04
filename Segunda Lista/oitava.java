import java.util.Scanner;

public class oitava {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor");
        int tam = ler.nextInt();
        int vetorA[] = new int[tam];
        int vetorB[] = new int[tam];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite um valor para o vetor - indice - [" + (i + 1) + "]");
            vetorA[i] = ler.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            vetorB[i] = vetorA[i];
            System.out.println("vetorA - " + vetorA[i]);
            System.out.println("vetorB - " + vetorB[i]);
        }

        ler.close();
    }
}

/*
 * Faça um programa Java que leia um vetor A com N elementos e ao final gere um
 * vetor
 * B, igual ao vetor. Obs: Faça uma cópia.
 */
