import java.util.Scanner;

public class quinta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu nome");

        String nome = scan.next();
        char vetor[] = new char[nome.length()];

        for (int i = 0; i < nome.length(); i++) {
            vetor[i] = nome.charAt(i);
            System.out.println(nome.charAt(i));
        }

        scan.close();
    }
}

/*
 * Sabendo que charAt(i) retorna um char, complete o programa para que o nome
 * lido seja
 * colocado em um vetor de char.
 */