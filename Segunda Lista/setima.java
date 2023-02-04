import java.util.Scanner;

public class setima {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um valor para o tamanho do vetor");
        int tam = ler.nextInt();
        boolean control = false;

        int vetor[] = new int[tam];

        // atribuindo valores ao vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um valor pra o vetor [" + (i + 1) + "]");
            vetor[i] = ler.nextInt();
        }

        // verificando
        for (int i = 0; i < vetor.length - 1; i++) {
            for(int j = i + 1; j < vetor.length; j++){
                if(vetor[i] > vetor[j]){
                    control = true;
                    break;
                }
            }
        }

        if (control)
            System.out.println("Vetor não está ordenado");
        else
            System.out.println("Vetor está ordenado");

        ler.close();
    }
}

/*
 * Faça um programa em Java que leia um vetor com N números inteiros e ao final
 * indique se o vetor está ordenado ou não. Testar somente ordem crescente.
 */