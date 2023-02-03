import java.util.Scanner;

public class decimaSexta {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int zVinte = 0, vCinq = 0, cSetent = 0, sCem = 0, n;

        do {
            System.out.println("Digite um número");
            n = ler.nextInt();

            if (n >= 0) {
                if (n <= 25) {
                    zVinte++;
                } else if (n <= 50) {
                    vCinq++;
                } else if (n <= 75) {
                    cSetent++;
                } else if (n <= 100) {
                    sCem++;
                }
            }

        } while (n > 0);

        System.out.println("\n [0,25], [26,50], [51,75] e [76,100]");
        System.out.println("   " + zVinte + "        " + vCinq + "        " + cSetent + "         " + sCem);

        ler.close();
    }
}

/*
 * Escreva um programa em Java que leia uma quantidade desconhecida de números e
 * conte quantos deles estão nos seguintes intervalos: [0,25], [26,50], [51,75]
 * e [76,100].
 * A entrada de dados deve terminar quando for lido um número negativo.
 */