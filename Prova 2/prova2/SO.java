// Camila Fontes Santos

package prova2;

public class SO extends Programa {

    private String tipo;

    public SO(String nome, int tamanho, String tipo) {
        super(nome, tamanho);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
