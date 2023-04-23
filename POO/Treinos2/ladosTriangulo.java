import javax.swing.JOptionPane;

public class ladosTriangulo {
    public static void main(String[] args) {
        String leitura = JOptionPane.showInputDialog("Valor");

        int lado1 = Integer.parseInt(leitura);
        leitura = JOptionPane.showInputDialog("Valor");

        int lado2 = Integer.parseInt(leitura);
        leitura = JOptionPane.showInputDialog("Valor");

        int lado3 = Integer.parseInt(leitura);

        if (lado1 == lado2 && lado2 == lado3) {
            JOptionPane.showMessageDialog(null, "Triângulo equilátero");
        } else if ( lado1 == lado2 || lado2 == lado3 || lado3 == lado1 ) {
            JOptionPane.showMessageDialog(null, "Triângulo isósceles");
        } else {
            JOptionPane.showMessageDialog(null, "Triângulo escaleno");
        }
    }
}