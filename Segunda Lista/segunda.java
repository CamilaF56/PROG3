import java.util.Scanner;

public class segunda {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = 1, i = 0, acima = 0, abaixo = 0;
        float media = 0f;

        while (n != 0) {
            System.out.println("Digite o tamanho do seu conjunto de números");
            n = ler.nextInt();
            float num[] = new float[n];

            for (i = 0; i < num.length; i++) {
                System.out.println("Digite um valor [" + (i + 1) + "]");
                num[i] = ler.nextInt();
                media = media + num[i];
            }

            media = media / n;

            for (i = 0; i < num.length; i++) {
                if (num[i] > media)
                    acima++;
                else
                    abaixo++;
            }
            break;

        }

        System.out.println("a média foi de " + media);
        System.out.println("acima da media " + acima + " valores");
        System.out.println("abaixo da media " + abaixo + " valores");

        ler.close();
    }
}

/*
 * Faça um programa que leia um conjunto de N números reais e indique quantos
 * valores ficaram acima e quantos ficaram abaixo da média dos valores lidos.
 */