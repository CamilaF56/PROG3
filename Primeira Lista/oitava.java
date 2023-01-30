import java.util.Scanner;

public class oitava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        byte opcao = 1;

        while (opcao != 0) {
            System.out.println("**************");
            System.out.println("1 - somar");
            System.out.println("2 - substrair");
            System.out.println("3 - multiplicar");
            System.out.println("4 - dividir");
            System.out.println("**************");
            System.out.print("Digite a opção: ");
            opcao = scan.nextByte();

            switch (opcao) {
                case 0:
                    System.out.println("Você saiu do programa");
                    break;
                case 1:
                    System.out.println("\tOpção escolhida: SOMA");
                    System.out.println("Digite um número para somar");
                    int n1 = scan.nextInt();
                    System.out.println("Digite outro número para somar");
                    int n2 = scan.nextInt();
                    System.out.println("A soma dos números é " + (n1 + n2));
                    break;

                case 2:
                    System.out.println("\tOpção escolhida: SUBTRAÇÃO");
                    System.out.println("Digite o número que deseja");
                    int n3 = scan.nextInt();
                    System.out.println("Digite outro número para subtrair do anterior");
                    int n4 = scan.nextInt();
                    System.out.println("A subtração de " + n3 + " por " + n4 + " é de " + (n3 - n4));
                    break;

                case 3:
                    System.out.println("\tOpção escolhida: MULTIPLICAÇÃO");
                    System.out.println("Digite o número que deseja multiplicar");
                    int n5 = scan.nextInt();
                    System.out.println("Digite o outro número que deseja multiplicar pelo digitado anteriormente");
                    int n6 = scan.nextInt();
                    System.out.println("A multiplicação de " + n5 + " por " + n6 + " é " + (n5 * n6));
                    break;

                case 4:
                    System.out.println("\tOpção escolhida: DIVISÃO");
                    System.out.println("Digite o número que deseja dividir");
                    int n7 = scan.nextInt();
                    System.out.println("Digite o divisor");
                    int n8 = scan.nextInt();
                    System.out.println("A divisão de " + n7 + " por " + n8 + " é " + (n7 / n8));
                    break;

                default:
                    System.out.println("ERROR, você digitou um número não reconhecido no sistema");
            }
        }

        scan.close();
    }
}

// Altere o programa a seguir para permitir que o usuário digite dois valores e
// mostre o resultado da operação escolhida.
// O flag de parada é a escolha do valor zero pelo usuário.
