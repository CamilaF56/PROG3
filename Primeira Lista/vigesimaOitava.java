import java.util.Scanner;

public class vigesimaOitava {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        byte m = 0, h = 0, s = 0, i = 0, per = 1;

        float a = 0f, totalA = 0f, aM = 0f, aH = 0f;
        int aux = 0, totalI = 0, totalId = 0;

        while (true) {
            System.out.println(
                    "PESQUISA DE UMA REGIÃO DE 1000 HABITANTES - Digite 0 para sair do programa ou outro numero para rodar o programa");
            per = ler.nextByte();

            if(per==0){
                System.out.println("Você saiu do programa");
                break;
            }

            System.out.println("Digite o seu sexo (0 - feminino, 1 - masculino)");
            s = ler.nextByte();

            if (s == 0) {
                m++;
            } else if (s == 1) {
                h++;
            } else {
                System.out.println("Erro, genero não cadastrado");
                break;
            }

            System.out.println("Digite a sua idade");
            i = ler.nextByte();
            totalI = totalI + i;

            if (i >= 18 && i <= 35) {
                totalId++;
            }

            System.out.println("Digite a sua altura");
            a = ler.nextFloat();
            totalA = totalA + a;

            if (s == 0) {
                aM = aM + a;
            } else if (s == 1) {
                aH = aH + a;
            }

            aux++;

        }
        
        float perc = (totalId*100)/aux;

        System.out.println("RESULTADOS");
        System.out.println("A média da idade do grupo é de " + (totalA / aux));
        System.out.println("A média da altura das mulheres do grupo é de " + (aM / m));
        System.out.println("A média da altura dos homens do grupo é de " + (aH / h));
        System.out.println("O percentual das pessoas com a idade de 18 a 35 anos do grupo é de "
                + perc + "%");

        ler.close();
    }
}

/*
 * Foi feita uma pesquisa entre os 1000 habitantes de uma região para coletar os
 * seguintes dados: sexo (0-feminino, 1-masculino), idade e altura. Faça um
 * programa Java que leia
 * as informações coletadas e mostre as seguintes informações:
 * média da idade do grupo;
 * média da altura das mulheres;
 * média da idade dos homens;
 * percentual de pessoas com idade entre 18 e 35 anos (inclusive).
 */