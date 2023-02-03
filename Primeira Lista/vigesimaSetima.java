import java.util.Scanner;

public class vigesimaSetima {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int v = 1;

        while(true){
            System.out.println("Digite um valor");
            v = ler.nextInt();

            if(v<=0){
                System.out.println("Erro, número digitado foi negativo ou zero");
                break;
            }

            if(Math.sqrt(v) == (int)Math.sqrt(v)){
                System.out.println("é quadrado perfeito");
            } else {
                System.out.println("não é quadrado perfeito");
            }
        }
        ler.close();
    }
}

/*
 * Escreva um programa Java que leia vários números e verifique se eles são ou
 * não quadrados perfeitos. O programa termina a execução quando for digitado um
 * número menor ou
 * igual a 0. Um número é quadrado perfeito quando tem um número inteiro como
 * raiz quadrada.
 */
