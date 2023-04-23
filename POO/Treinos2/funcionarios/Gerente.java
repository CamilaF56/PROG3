package funcionarios;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double aumento() {
        return salario += 400;
    }

    @Override
    public String imprimir() {
        return "Nome: " + nome + ", Salário: R$" + salario + ", Cargo: Gerente";
    }
}