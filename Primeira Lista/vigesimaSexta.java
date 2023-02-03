import java.util.Scanner;

public class vigesimaSexta {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um valor");
        int v = ler.nextInt();

        System.out.println("Digite outro valor");
        int v2 = ler.nextInt();

        if(v>=0 && v2>=0){
            System.out.println("O resultado é de "+(v*v2));
        } else {
            System.out.println("erro, você digitou algum valor negativo");
        }

        ler.close();
    }
}

/*
 * Escreva um programa Java que leia dois números inteiros e positivos e calcule
 * o primeiro elevado ao segundo. Neste exercício pode ser usando somente o
 * operador de multiplicação.
 */