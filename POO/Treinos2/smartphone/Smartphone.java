
public class Smartphone extends Telefone{
    private String numero;

    public Smartphone(String numero){
        super(numero);
    }

    public String verificarEspacoLivre(){
        return "Possui espaço";
    }

    public void desligar(){
        System.out.println("Desligando smartphone");
    }

    public void instalarApp(App app1){

    }
}
