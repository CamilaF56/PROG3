package figura;

public class Quadrado extends Figura {
    int lado;

    public Quadrado(int lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado * lado;
    }
}
