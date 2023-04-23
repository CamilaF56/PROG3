import java.util.Scanner;

public class DVD extends Midia{

    Scanner ler = new Scanner(System.in);
    
    private int nFaixas;

    public DVD(int codigo, double preco, String nome, int nFaixas){
        super(codigo, preco, nome);
        this.nFaixas = nFaixas;     
    }

    public void setFaixas(int nFaixas){
        System.out.println("Digite o número de Faixas que deseja cadastrar");
        nFaixas = ler.nextInt();
    }

    @Override
    public String getTipo() {
        return Thread.currentThread().getStackTrace()[1].getClassName();
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() +" Número de Faixas contidas: " + nFaixas;
    }

    @Override
    public void inserirDados(){
        super.inserirDados();
        System.out.println("Digite o número de Faixas que deseja cadastrar");
        nFaixas = ler.nextInt();
    }

}