import java.util.Scanner;

public class vigesimaQuinta {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n=0, soma=0;

        while(true){
            System.out.println("CALCULADORA DE SOMA - DIGITE 0 PARA SAIR");
            System.out.println("Digite um número para somar");
            n = ler.nextInt();

            if(n==0){
                System.out.println("Saiu da calculadora");
                break;
            }
            soma = soma + n;
        }

        if(soma!=0){
            System.out.println("\nO resultado da soma é "+ soma);
        }
        ler.close();
    }
}
/*
 * Elabore um programa que leia um número qualquer e encontre a soma dos seus
 * algarismos. Por exemplo, o número 3251 vai dar como resultado 11 (3 + 2 + 5 +
 * 1).
 */
