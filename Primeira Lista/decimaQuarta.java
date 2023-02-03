import java.util.Scanner;

public class decimaQuarta {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("----SOMA----");
        System.out.println("digite um valor:");
        int a = ler.nextInt();

        System.out.println("\ndigite um outro valor:");
        int n = ler.nextInt();

        if(n <= 0){
            System.out.println("\nnúmero não reconhecido, digite um valor maior que 0:");
            n = ler.nextInt();
        }
        
        if(n > 0){
            int soma = (a+n); 
            System.out.println("\nA - N - SOMA");
            System.out.println(a + "   " + n + "    " + soma);
        }     

        ler.close();
    }
}

/*Faça um programa Java para ler um valor A e um valor N. Imprimir a soma dos N números a partir de A (inclusive). Caso N seja negativo ou ZERO, deverá ser lido um novo N 
(apenas N). 
Valores para teste: 
A 	N 	SOMA
3 	2 	7 (3+4)
4 	5 	30 (4+5+6+7+8) 
 */