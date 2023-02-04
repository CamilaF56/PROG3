import java.util.Scanner;

public class primeira {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x = 1, i;
        boolean controlTwo = false;

        while (x != 0) {
            System.out.println("Digite o número do valor do seu conjunto -- Digite 0 para sair do programa");
            x = ler.nextInt();

            int n[] = new int[x];

            for (i = 0; i < x; i++) {
                System.out
                        .println("Digite o primeiro valor do conjunto [" + (i + 1)
                                + "] -- Digite 0 para reiniciar o programa");
                n[i] = ler.nextInt();

                if (n[i] == 0) {
                    System.out.println("Você reiniciou o programa");
                    controlTwo = true;
                    break;
                } else if (n[i] < 0) {
                    System.out.println("Registro descondiderado, pois o valor foi negativo");
                    i--;
                }
            }

            if (!controlTwo) {
                for (int j = n.length - 1; j >= 0; j--) {
                    System.out.println("\n" + n[j]);
                }
            }
        }

        ler.close();
    }
}

/*
 * Desenvolva um programa que leia um conjunto de números inteiros e positivos.
 * Ao
 * final imprima os números na ordem inversa ao que foram lidos. O flag de
 * parada é a
 * leitura do valor zero. Caso o usuário digite um valor negativo ele deve ser
 * desconsiderado.
 */