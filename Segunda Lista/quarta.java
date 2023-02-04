import java.util.Scanner;

public class quarta {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int vetor[] = new int[5];
        int i = 0;

        System.out.println("PROGRESSÃO ARITMÉTICA");
        System.out.println("Digite um valor para a razão");
        int raz = ler.nextInt();
        System.out.println("Digite um valor inicial para a P.A");
        int inicial = ler.nextInt();
        vetor[0]=inicial;

        ler.close();

        for (i = 0; i < vetor.length; i++) { // Salvando valores dentro do vetor
            vetor[i] = raz * i + inicial;
            System.out.println("Vetor termo - [" + (i + 1) + "] = " + vetor[i]);
        }

    }
}

/*
 * Crie um programa Java que peça um número inicial ao usuário, uma razão e
 * calcule
 * os termos de uma P.A (Progressão Aritmética), armazenando esses valores em um
 * vetor
 * de tamanho 10.
 */
