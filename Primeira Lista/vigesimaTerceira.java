import java.util.Scanner;

public class vigesimaTerceira {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int tent = 0, v = 1;
        double sort = Math.random() * 100;
        sort = (int) sort;

        while (v != 0) {
            System.out.println("ADVINHAÇÃO DE NÚMEROS SORTIDOS");
            System.out.println("Digite um número para adivinhar");
            v = ler.nextInt();

            if (v > sort) {
                System.out.println("O valor é maior ao sorteado");
            } else if (v < sort) {
                System.out.println("O valor é menor ao sorteado");
            } else if (v == sort) {
                System.out.println("O valor é igual ao sorteado");
            }

            tent++;
        }
        System.out.println("Foram feitas " + (tent - 1) + " tentativas");

        ler.close();
    }
}

/*
 * Desenvolva um programa em Java que realize o sorteio de um número inteiro
 * pertencente ao intervalo de 1 a 100,
 * e que solicite ao usuário qual o valor que foi sorteado. O algoritmo
 * deve informar se o valor que o usuário digitou é maior, menor ou igual ao
 * valor sorteado. O algoritmo deve
 * parar quando o usuário acertar o valor sorteado e deve informar ao final
 * a quantidade de tentativas que o usuário utilizou para acertar o número.
 * Utilize o comando Math.Random()*100
 * para sortear o valor.
 */