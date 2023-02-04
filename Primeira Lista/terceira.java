import java.util.Scanner;

public class terceira {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite a sua nota");
        float nota = 0.0f;
        nota = leitura.nextFloat();

        if (nota >= 7) {
            System.out.println("Passou direto!");
        } else if (nota >= 5) {
            System.out.println("Pode fazer recuperação");
        } else {
            System.out.println("Reprovado");
        }

        leitura.close();
    }
}
/*
 * Crie um programa que recebe uma nota (pela classe Scanner) e checa se você
 * passou direto, ficou de recuperação ou foi reprovado na matéria. A regra é a
 * seguinte:
 *  Nota 7 ou mais: passou direto
 *  Entre 5 e 7: tem direito de fazer uma prova de recuperação
 *  Abaixo de 5: reprovado direto
 */