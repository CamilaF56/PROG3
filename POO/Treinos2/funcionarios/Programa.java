package funcionarios;

public class Programa {

    public static void main(String[] args) {

        Funcionario f = new Funcionario("Andres", 1000.0);

        System.out.println(f.imprimir());

        f.aumento();

        System.out.println(f.imprimir());

        f.aumento();

        System.out.println(f.imprimir());

        Gerente g = new Gerente("Lucca", 2000.0);

        System.out.println(g.imprimir());

        g.aumento();

        System.out.println(g.imprimir());

    }

}