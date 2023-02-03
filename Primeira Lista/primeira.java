import java.util.Scanner;

public class primeira{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

		int soma = 0;

		System.out.print("Digite o primeiro valor: ");
		int valor = scan.nextInt();
        soma += valor;

		System.out.print("Digite o segundo valor: ");
		valor = scan.nextInt();
        soma += valor;

		System.out.print("Digite o terceiro valor: ");
		valor = scan.nextInt();
        soma += valor;

		double media = soma / 3;
        System.out.println("a média do valores é de " + media);

        scan.close();
    }
}