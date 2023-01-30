import java.util.Scanner;

public class decima {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int soma = 0;
        byte idade = 1;
        int count = 0;

        while(idade != 0){
            System.out.println("Digite a sua idade");
            idade = ler.nextByte();
            soma = soma + idade;
            count++;
        }

        int media = soma / (count-1);
        System.out.println("A média da idade das pessoas que foram lidas foi "+ media);

        ler.close();
    }
}



//Faça um programa Java que leia a idade de um conjunto de pessoas e a seguir calcule e média das idades. 
//O flag de parada é a leitura de zero para idade. 
