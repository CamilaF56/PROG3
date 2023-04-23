package funcionarios;

public class Funcionario {
    
    public String nome;
    public double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public double aumento(){
        return salario +=100;
    }

    public String imprimir(){
        return "Nome: " + nome + ", Salário: R$" + salario;
    }

}
