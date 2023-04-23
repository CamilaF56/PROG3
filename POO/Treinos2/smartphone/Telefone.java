
public class Telefone {
    private String numero;

    public Telefone(String numero){
        this.numero = numero;
    }

    public void ligar(){

    }

    public void aumentarVolume(){

    }

    public void efetuarChamada(String numero){
        this.numero = numero;
    }

    public void desligar(){
        System.out.println("Desligando o telefone");
    }

}
