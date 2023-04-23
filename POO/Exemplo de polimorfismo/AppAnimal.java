public class AppAnimal {

    public static void funcao(Animal a) {
        a.nadar();
    }

    public static void main(String[] args) {
        Animal a = new Mamifero();

        a.irPara("rua");
        ((Cachorro) a).latir();

    }
}
