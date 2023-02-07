import java.util.Scanner;

public class fourQuestion {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int soma1 = 0, soma2 = 0;
        int div1 = 0, div2 = 0;
        int n1 = 0, n2 = 0;

        while (n1 < 1000 && n2 < 1000) {
            System.out.println("Digite um número maior que 1000");
            n1 = ler.nextInt();

            if (n1 <= 1000) {
                System.out.println("Erro, você digitou um número menor que 1000");
                break;
            }

            System.out.println("Digite outro número maior que 1000");
            n2 = ler.nextInt();

            if (n2 <= 1000) {
                System.out.println("Erro, você digitou um número menor que 1000");
                break;
            }

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

            if (soma1 == soma2) { // Útima verificação
                System.out.println(n1 + " e " + n2 + " são amigos entre si");
            } else {
                System.out.println(n1 + " e " + n2 + " não são amigos entre si");
            }
        }

        ler.close();

    }
}

/*
 * Questão desafio: encontre dois números amigos que sejam maiores que 1000.
 */