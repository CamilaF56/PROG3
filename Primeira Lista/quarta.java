import javax.swing.JOptionPane;

public class quarta {
    public static void main(String[] args) {
        String leitura = JOptionPane.showInputDialog("Valor");

        int lado1 = Integer.parseInt(leitura);
        leitura = JOptionPane.showInputDialog("Valor");

        int lado2 = Integer.parseInt(leitura);
        leitura = JOptionPane.showInputDialog("Valor");

        int lado3 = Integer.parseInt(leitura);

        if (lado1 == lado2 && lado2 == lado3) {
            JOptionPane.showMessageDialog(null, "Triângulo equilátero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
            JOptionPane.showMessageDialog(null, "Triângulo isósceles");
        } else {
            JOptionPane.showMessageDialog(null, "Triângulo escaleno");
        }
    }
}
/*
 * Implemente um programa em Java que leia as medidas dos lados de um triângulo
 * e
 * escreva se ele é equilátero, isósceles ou escaleno. Sendo que:
 *  Triângulo Equilátero: possui os 3 lados iguais.
 *  Triângulo Isósceles: possui 2 lados iguais.
 *  Triângulo Escaleno: possui 3 lados diferentes.
 */