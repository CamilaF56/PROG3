import java.util.Scanner;

public class oneSlideVet{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a quantidade de números que deseja armazenar: ");
        byte qtt = ler.nextByte();

        byte x[] = new byte[qtt];

        for(byte y=0;y<x.length;y++){
            System.out.println(y);
        }

        ler.close();
    }
}

//Faça um programa Java para ler a quantidade e os números que deseja
//armazenar em um vetor e ao final imprimir em qual posição cada número
//foi lido.