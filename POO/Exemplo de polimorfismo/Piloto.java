public class Piloto {
    private Veiculo veiculo;

    public void prepararParaDirigir(Veiculo veiculo) {
        System.out.println("Subindo no veículo");
        this.veiculo = veiculo;
    }

    public void irPara(String lugar) {
        System.out.println("Indo para " + lugar);
        veiculo.andarParaFrente();
    }

    public void chegouAoLugar() {
        veiculo.estacionar();
    }
}