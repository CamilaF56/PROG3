import java.util.Scanner;

/**
 * Midia
 */
public class Midia {

    Scanner ler = new Scanner(System.in);

    private int codigo;
    private double preco;
    private String nome;

    public Midia(int codigo, double preco, String nome){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo(){
        return Thread.currentThread().getStackTrace()[1].getClassName();
    }

    public String getDetalhes(){
        return "Codigo: " + codigo + " Preço: " + preco + " Nome da Faixa: " + nome + " ";
    }

    public void inserirDados(){
        System.out.println("Digite o codigo de cadastramento da mídia");
        codigo = ler.nextInt();

        System.out.println("Digite o nome de cadastramento da mídia");
        nome = ler.next();

        System.out.println("Digite o preco de cadastramento da mídia");
        preco = ler.nextDouble();
    }

    public void printDados(){
        System.out.println(getDetalhes() + getTipo());
    }

}