import java.util.Scanner;

public class decimaPrimeira {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int soma = 0;
        byte idade = 0;
        int count = 0;
        String resp = " ";

        while(resp != "fim"){
            System.out.println("Digite a sua idade \t- Digite fim para parar de digitar as idades - ");
            soma = soma + idade;
            count++;
        }

        int media = soma / (count);
        System.out.println("A média da idade das pessoas que foram lidas foi "+ media);

        ler.close();
    }
}







// Faça um programa Java que lê o nome e a idade de um conjunto de pessoas e imprime o nome da pessoa mais velha. 
// O flag de parada é a leitura do nome “fim”. 
