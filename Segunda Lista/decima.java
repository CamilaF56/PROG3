import java.util.Scanner;

public class decima {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int vetorValor[] = new int[30];
        int vetorPar[] = new int[5];
        int vetorImpar[] = new int[5];
        int n = 1;

        while (n != 0) {
            System.out.println("Digite qualquer valor para começar o programa e 0 para sair");
            n = ler.nextInt();

            if (n == 0) {
                break;
            }

            for (int i = 0; i < 5; i++) {
                System.out.println("Digite algum valor");
                vetorValor[i] = ler.nextInt();
            }

            for (int j = 0; j < 5; j++) {
                if (vetorValor[j] % 2 == 0) {
                    if (j == vetorPar.length) {
                        break;
                    }
                    vetorPar[j] = vetorValor[j];
                    System.out.println("Vetor par = " + vetorPar[j]);
                } else if (vetorValor[j] % 2 != 0) {
                    if (j == vetorImpar.length) {
                        break;
                    }
                    vetorImpar[j] = vetorValor[j];
                    System.out.println("Vetor ímpar = " + vetorImpar[j]);
                }
            }
        }

        ler.close();
    }
}

/*
 * Elabore um programa Java que leia um conjunto de 30 valores e os coloque em 2
 * vetores conforme os valores forem pares ou ímpares. O tamanho de cada vetor é
 * de 5
 * posições. Se algum vetor estiver cheio, escrevê-lo. Terminada a leitura
 * escrever o
 * conteúdo dos dois vetores. Cada vetor pode ser preenchido tantas vezes
 * quantas for
 * necessário.
 */