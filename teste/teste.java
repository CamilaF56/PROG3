package teste;
import java.util.Scanner;

public class teste {

    public static void somar(){
            Scanner ler = new Scanner(System.in);
            System.out.printf("Informe o primeiro valor: ");
            int n = ler.nextInt();

            System.out.printf("Informe o segundo valor: ");
            int n2 = ler.nextInt();

            System.out.printf("%d + %d = %3d\n", n, n2, (n + n2));

            ler.close();
    }

    public static void sub(){
        Scanner ler = new Scanner(System.in);
        System.out.printf("Informe o primeiro valor: ");
        int n = ler.nextInt();

        System.out.printf("Informe o segundo valor: ");
        int n2 = ler.nextInt();

        int resul;

        if(n>n2){
            resul = n-n2;
        }else{
            resul = n2-n;
        }

        System.out.printf("%d - %d = %3d\n", n, n2, (resul));

        ler.close();
    }

    public static void calc(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite 'b' para calculadora de subtração  ou 'a' para calculadora de soma");
            char op=ler.next().charAt(0);

            switch(op){
                case 'b': sub();

                case 'a': somar();

                default: System.out.println("ERRO");
            }

            ler.close();
    }
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        calc();
        System.out.println("Deseja utilizar novamente a calculadora?(1=sim e 0=não)");
        int resp=ler.nextInt();

        if(resp==1){
            calc();
        }else{
            System.out.println("Programa acabou por aqui!");
        }

        ler.close();
    }
}
