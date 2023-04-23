public class Circulo extends Figura{

    private double raio;
    
    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double getDiametro() {
        return raio*2;
    }

    public Circulo(double raio, String cor){
        setCor(cor);
        this.raio = raio;
    }

    public double area(){
        return 3.14*(raio*raio);
    }

    @Override
    public String toString() {
        return "Circulo [área do círculo= " + area() + " raio= " + raio + " cor= "+ cor +"]";
    }  

}
