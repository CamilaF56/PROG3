import java.util.Scanner;

public class vigesimaQuarta {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número");
        int i,j,n = ler.nextInt();
        System.out.println("\n");

        if(n>1 && n<=20){
            for(i = 1;i<=n;i++){
                for(j=1;j<=i;j++){
                    System.out.print(j);
                }
            System.out.print("\n");
            }
            for(i = n-1;i >= 1; i--){
                for(j = 1;j<=i;j++){
                    System.out.print(j);
                }
            System.out.print("\n");
            }
        } else{
            System.out.println("Número digitado não reconhecido");
        }
        ler.close();
    }
}

/*
 * Crie um programa que leia um número entre 2 e 20 e mostre uma tela com a
 * seguinte configuração:
 * Digite um número:
 * 4
 * Saída do programa:
 * 1
 * 12
 * 123
 * 1234
 * 123
 * 12
 * 1
 */