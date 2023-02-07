import java.util.Scanner;

public class twoQuestion {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int vetorA[] = new int[8];
        int tam = vetorA.length;

        for (int i = 0; i < tam; i++) {
            System.out.println("Digite um valor para o vetor [" + (i + 1) + "]");
            vetorA[i] = ler.nextInt();

            if (vetorA[i] == -1) {

                for (int j = i; j < tam - 1; j++) {
                    vetorA[j] = vetorA[j + 1];
                }
                
            i--;
            }   

        }

        for (int j = 0; j < tam; j++) {
            System.out.println(vetorA[j] + " ");
        }

        ler.close();
    }
}

/*
 * Suponha um vetor: A = { 87, 21, -1, 75, 9, -1, -1, 4, 18 , 30 }
 * As posições que contém o elemento -1 estão “vazias”, ou seja, não são
 * elementos válidos do vetor. Crie
 * um programa em Java que leia um vetor qualquer com N elementos inteiros e
 * faça a sua compactação,
 * isto é, removendo as posições que estão vazias. Aplicando o programa no vetor
 * anterior teríamos o
 * seguinte resultado: A = { 87, 21, 75, 9, 4, 18 , 30 }
 * Usar somente o vetor lido
 */