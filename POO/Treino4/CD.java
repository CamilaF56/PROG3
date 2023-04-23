import java.util.Scanner;

public class CD extends Midia{

    Scanner ler = new Scanner(System.in);

    private int nMusicas;

    public CD(int codigo, double preco, String nome, int nMusicas){
        super(codigo, preco, nome);
        this.nMusicas = nMusicas;      
    }

    public void setMusica(int nMusicas){
        System.out.println("Digite o número de músicas que deseja cadastrar");
        nMusicas = ler.nextInt();
    }

    @Override
    public String getTipo() {
        return Thread.currentThread().getStackTrace()[1].getClassName();
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes() +" Número de músicas contidas: " + nMusicas;
    }

    @Override
    public void inserirDados(){
        super.inserirDados();
        System.out.println("Digite o número de músicas que deseja cadastrar");
        nMusicas = ler.nextInt();
    }
}
