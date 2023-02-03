import java.util.Scanner;

public class decimaOitava {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int ent, sai, total = 0, exc = 0;

        System.out.println("Digite o numero de andares do prédio");
        int nAnd = ler.nextInt();

        for (int x = 0; x < nAnd; x++) {
            System.out.println("quantas pessoas entraram no elevador? - andar [" + (x + 1) + "]");
            ent = ler.nextInt();
            total = total + ent;

            if (total > 15) {
                if (exc > total) {
                    exc = (exc - total) - 15;
                } else {
                    exc = (total - exc) - 15;
                }

                System.out.println("EXCESSO DE PASSAGEIROS. DEVEM SAIR " + exc + " pessoas");
                break;
            } else if (ent < 0) {
                System.out.println("ERRO, número negativo de passageiros, digite novamente");
                ent = ler.nextInt();
            }

            System.out.println("quantas pessoas sairam do elevador?");
            sai = ler.nextInt();
            if (sai > total) {
                System.out.println("ERRO, número a mais de passageiros, digite novamente");
                sai = ler.nextInt();
            } else if (sai < 0) {
                System.out.println("ERRO, número negativo de passageiros, digite novamente");
                sai = ler.nextInt();
            }
            total = total - sai;

        }

        if (total <= 15) {
            System.out.println("Devem sair no último andar " + total + " pessoas");
        }

        ler.close();
    }
}

/*
 * Faça um programa em Java que leia o número de andares de um prédio e, a
 * seguir, para cada andar do prédio, leia o número de pessoas que
 * entraram e saíram do elevador. Considere que o elevador está vazio e está
 * subindo, os dados se referem a apenas uma “subida” do elevador e
 * que o número de pessoas dentro do elevador sempre será maiores ou iguais a 0.
 * Se o número de pessoas, após a entrada e saída for maior que 15,
 * deve ser mostrada a mensagem “EXCESSO DE PASSAGEIROS. DEVEM SAIR" em seguida,
 * o número de pessoas que
 * devem sair do elevador, de modo que seja obedecido o limite de 15
 * passageiros. Após a entrada de pessoas no último andar o algoritmo deve
 * mostrar quantas pessoas irão descer.
 */