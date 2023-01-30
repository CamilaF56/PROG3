import java.util.Scanner;

public class nona {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int soma = 0;

        for(int x = 0; x < 10; x++){
            System.out.println("Digite a sua idade");
            byte idade = ler.nextByte();
            soma = soma + idade;
        }

        int media = soma / 10;
        System.out.println("A média da idade das pessoas que foram lidas foi "+ media);

        ler.close();
    }
}

//Crie um programa Java que leia a idade de 10 pessoas e a seguir calcule a média das idades que foram lidas. 

