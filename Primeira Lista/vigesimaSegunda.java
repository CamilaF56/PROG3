import java.util.Scanner;

public class vigesimaSegunda {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float valor1 = 0f, total1 = 0f, valor2 = 0f, total2 = 0f;
        byte op = 4;

        while (op != 0) {
            System.out.println("Loja online");
            System.out.println("À vista - digite 1");
            System.out.println("A prazo - digite 2");
            System.out.println("Resultados - digite 3");
            op = ler.nextByte();

            switch (op) {
                case 1:
                    System.out.println("Digite o valor da transação");
                    valor1 = ler.nextFloat();

                    break;

                case 2:
                    System.out.println("Digite o valor da transação");
                    valor2 = ler.nextFloat();

                    break;

                case 3:
                    System.out.println("O valor total das vendas a vista foi de");
                    System.out.println(total1);

                    System.out.println("O valor total das vendas a prazo foi de");
                    System.out.println(total2);

                    System.out.println("O valor total das vendas a prazo e à vista foi de " + (total1 + total2));

                    break;

                default:
                    System.out.println("ERRO, foi encontrado o número da opção digita");
                    break;
            }
            total1 = total1 + valor1;
            total2 = total2 + valor2;
        }
        ler.close();
    }
}

/*
 * Uma loja utiliza o código V para transação a Vista e P para transação a
 * prazo. Faça um programa que receba
 * o código e o valor das transações e mostre:
 * o valor total das vendas a vista
 * o valor total das vendas a prazo
 * o valor total das vendas efetuadas
 */
