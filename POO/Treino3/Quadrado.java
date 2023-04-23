/**
 * Quadrado
 */
public class Quadrado extends Retangulo {

    public Quadrado(double lado1, String cor){
        super(lado1, lado1, cor);
    }

    @Override
    public String toString() {
        return "Área do Quadrado ["+ getLado1()*getLado1() +" Cor do Quadrado = " + cor +"]";
    }
}