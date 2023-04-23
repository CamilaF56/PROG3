import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número para saber se é primo ou não: ");
        int n = ler.nextInt();

        boolean primo=true;

        for (int j = 2; j < n; j++) {
            if (n % j == 0){
                primo=false;
            }
        }

        if(primo){
            System.out.println("O número é primo");
        }else{
            System.out.println("Não é um número primo");
        }

        ler.close();
    }
}
