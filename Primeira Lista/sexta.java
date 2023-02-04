import javax.swing.JOptionPane;

public class sexta {
    public static void main(String[] args) {
        String N = JOptionPane.showInputDialog("Quer imprimir até que número?");
        int n2 = Integer.parseInt(N);

        for (int x = 1; x < n2 + 1; x++) {
            System.out.println("[ " + x + " ]");
        }

    }
}

/*
 * Faça um programa Java que imprima todos os números de 1 até N. O valor de N
 * deverá ser lido usando JOptionPane.
 */
