public class Triangulo extends Figura{

    private double base;
    
    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    private double altura;
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Triangulo(double base, double altura, String cor){
        this.base = base;
        this.altura = altura;
        setCor(cor);
    }

    public double area(){
        return (base*altura)/2;
    }

    @Override
    public String toString() {
        return "Triangulo [base= " + base + ", altura= " + altura + " área= " + area() + " cor= " + cor + "]";
    }
    
}
