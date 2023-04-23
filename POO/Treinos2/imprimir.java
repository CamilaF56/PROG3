import javax.swing.JOptionPane;

public class imprimir {
    public static void main(String[] args) {
        String N = JOptionPane.showInputDialog("Quer imprimir até que número?");
        int n2 = Integer.parseInt(N);

        for(int x=1; x < n2+1; x++){
            System.out.println("[ "+x+" ]");
        }

    }
}
