import java.util.Scanner;

public class vigesima {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double s=0;
        for(double x=1; x<=10;x++){
            s = s + x/(x*2);
            s = s - (x+1)/(x*(2+1));
            
        }

        System.out.println("s = "+s);
        ler.close();
    }
}
/*  Crie um programa em Java para calcular e exibir o valor de S, dado por 

S=1- 2/4 + 3/9 - 4/16 + 5/25 - ... - 10/100

*/