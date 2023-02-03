import java.util.Scanner;

public class exProva {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    
        System.out.println("digite a quantidade de numeros que deseja ler");
        int qntt = ler.nextInt();

        int x[]=new int[qntt];

        for(int y=0;y<x.length;y++){
            System.out.println("digite os numeros do vetor");
            x[y] = ler.nextInt();
        }

        for(int y=0;y<x.length;y++){
            x[y] = x[y+1];
        }

        ler.close();
    }
}

/*
As posições que contém o elemento -1 estão "vazias", ou seja, não são elementos válidos do vetor. Crie um programa em java que leia um vetor qualquer 
com N elementos inteiros e faça a sua compactação, isto é, removendo as posições que estão vazias. Aplicando o programa no vetor anterior teriamos o 
seguinte resultado: A=[87,21,75,9,4,18,30]
usar somente o vetor lido
 */
