public class AppPiloto {
    public static void main(String[] args) {
        Piloto hamilton = new Piloto();
        hamilton.prepararParaDirigir(new Carro());
        hamilton.irPara("vaquejada");
        hamilton.chegouAoLugar();
    }
}