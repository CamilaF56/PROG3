public class Carro extends Veiculo {

    @Override
    public void andarParaFrente() {
        System.out.println("passando a marcha e andando para frente");
    }

    @Override
    public void estacionar() {
        System.out.println("fazendo baliza");
    }
}