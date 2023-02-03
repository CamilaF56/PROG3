import java.util.Scanner;

public class decimaQuinta {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("----PESO DO TOTAL DE CAIXAS----");

        int soma = 0;
        
        for(int i = 0; i < 25; i++){
            System.out.println("\nDigite o peso da caixa [" + (i+1) +"]");
            int p = ler.nextInt();
            soma = soma + p;
        }

        System.out.println("\nO total de peso das caixas é de "+soma);

        ler.close();
    }
}




/*Construa um programa em Java que apresente o peso total que será carregado por um caminhão. Sabe-se que esse caminhão carrega 25 caixas, com pesos diferentes. Será entrada do 
programa o peso (P) de cada uma das caixas. 
 */