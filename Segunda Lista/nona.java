import java.util.Scanner;

public class nona {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] filmes = new int[50];// quantidade de filmes retirados por cada um de seus clientes durante o ano de
                                   // 2016
        int ret = 0;
        int gratuito = 0;
        boolean control = false;

        for (int i = 1; i < filmes.length - 1; i++) {
            System.out.println("Quantidade de filmes que deseja retirar");
            ret = ler.nextInt();
            filmes[i] = ret;
            gratuito = 0; // reinicia a contagem para outro cliente

            for (int j = 0; j < ret; j++) {
                if (j % 10 == 0) {
                    gratuito++;
                    control = true;
                } else if (ret < 10) {
                    control = false;
                }
            }

            if (control) {
                if (ret > 10 && ret % 10 != 0) {
                    gratuito--;
                }
                System.out.println("Você tem direito a essa quantidade de filmes gratuitas: " + gratuito);
            } else {
                System.out.println("Você não tem direito a locação gratuita");
            }
        }

        ler.close();
    }
}

/*
 * Uma locadora de vídeos tem guardada, em um vetor de 50 posições, a quantidade
 * de
 * filmes retirados por cada um de seus clientes durante o ano de 2016. Agora, a
 * locadora
 * está fazendo uma promoção e, para cada 10 filmes retirados, o cliente tem
 * direito a uma
 * locação grátis. Faça um programa Java que crie outro vetor contendo a
 * quantidade de
 * locações gratuitas a que cada cliente tem direito. Ao final imprima quantos
 * filmes cada
 * cliente tem direito e o número total de locações grátis da locadora.
 */
