import java.util.Scanner;

public class decimaSetima {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int n=23;
        double soma=0;

        for(int i = 1; i<=n; i++){
            soma= soma + (double)(1/i);
            System.out.println("[" +i+"] - 1/"+i);
        }

        System.out.println("o valor final de da equação dada é de "+(soma));

        ler.close();
    }
}

/*
 * Escreva um programa em Java que lê um valor n inteiro e positivo e que
 * calcula a seguinte soma:
 * 
 * S := 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
 * 
 * O programa deve escrever cada termo gerado e o valor final de S.
 * 
 */