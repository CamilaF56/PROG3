import java.util.Scanner;

public class threeQuestion {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int soma1 = 0, soma2 = 0;
        int div1 = 0, div2 = 0;

        System.out.println("Digite um número");
        int n1 = ler.nextInt();

        System.out.println("Digite outro número");
        int n2 = ler.nextInt();

        // Verificar os divisores
        for (int i = 1; i < n1; i++) {
            if (n1 % i == 0) {
                div1 = (n1 / i);
                soma1 = soma1 + div1;
            }
            if (n2 % i == 0) {
                div2 = (n2 / i);
                soma2 = soma2 + div2;
            }
        }

        if (soma1 == soma2) {
            System.out.println(n1 + " e " + n2 + " são amigos entre si");
        } else {
            System.out.println(n1 + " e " + n2 + " não são amigos entre si");
        }

        ler.close();
    }
}

/*
 * Dois números inteiros e positivos são amigos entre si quando a soma dos
 * divisores próprios do
 * primeiro número for igual ao segundo, e a soma dos divisores próprios do
 * segundo for igual ao primeiro.
 * Faça um programa em Java que leia dois números e verifique se são amigos.
 * 
 *  Ex.: valor 220 tem como divisores próprios: 1, 2, 4, 5 ,10, 11, 20, 22, 44,
 * 55 e 110, cuja soma é
 * soma 284
 *  Valor2 284 tem como divisores próprios: 1, 2, 4, 71, 142, cuja soma é
 * soma2 220 Portanto, 220 e
 * 284 são amigos entre si.
 */