import java.util.Scanner;

public class segundaSlide2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double x;

        System.out.println("Digite o fatorial do número desejado: ");
        x = ler.nextDouble();

        double f = x;

        while(x>1){
            f = f *(x-1);
            x--; 
        }
        
        System.out.println(f);

        ler.close();
    }
}
