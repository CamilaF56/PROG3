import javax.swing.JOptionPane;

public class quinta {
    public static void main(String[] args) {
        String leitura = JOptionPane.showInputDialog("Valor - 0 finaliza");
        int valor = Integer.parseInt(leitura);
        int maior = 0;
        int menor = 0;
        while (valor != 0) {
            if (valor < 0) {
                System.out.println("O valor digitado é menor que zero");
            }
            if (valor > maior)
                maior = valor;
            if (valor < menor)
                menor = valor;
            leitura = JOptionPane.showInputDialog("Valor - 0 finaliza");
            valor = Integer.parseInt(leitura);
            JOptionPane.showMessageDialog(null, "O maior valor lido foi: " + maior);
            JOptionPane.showMessageDialog(null, "O menor valor lido foi: " + menor);
        }

    }
}

/*
 * Faça um programa que receba um conjunto de valores inteiros e positivos e
 * que
 * calcule e mostre o maior e o menor valor do conjunto. Considere que:
 *  Para encerrar a entrada de dados, deve ser digitado o valor zero;
 *  Para valores negativos, deve ser enviada uma mensagem;
 *  Os valores negativos ou iguais a zero não entrarão nos cálculos.
 */