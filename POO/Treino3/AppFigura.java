public class AppFigura {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(5,8,"Amarelo");
        System.out.println(triangulo);

        Circulo circulo = new Circulo(5,"Roxo");
        System.out.println(circulo);

        Retangulo retangulo = new Retangulo(40, 20, "Vermelho");
        System.out.println(retangulo);

        Quadrado quadrado = new Quadrado(10, "Vermelho");
        System.out.println(quadrado);
    }
}
