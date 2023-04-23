import javax.swing.JOptionPane;

public class desconto {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o seu nome");

        String sal = JOptionPane.showInputDialog("Digite o seu salário bruto");
        int sall = Integer.parseInt(sal);

        String des = JOptionPane.showInputDialog("Digite o valor total dos descontos de um funcionário");
        int dess = Integer.parseInt(des);

        JOptionPane.showMessageDialog(null, nome+" recebe R$"+(sall-dess)+",00 reais");
    }
}
