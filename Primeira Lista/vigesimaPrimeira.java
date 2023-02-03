import java.util.Scanner;

public class vigesimaPrimeira {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número de dias");
        int n = ler.nextInt();

        System.out.println("Digite o volume final da bactéria");
        float vI = 0f, vF = ler.nextFloat();

        for(int i=0; i<n; i++){
            vI = (float)(vF/(Math.pow(n, n)));
        } 
        
        System.out.println("O volume inicial da bactéria deve ser de "+vI);

        ler.close();
    }
}

/* Sabe-se que a cultura de uma certa bactéria dobra seu volume a cada dia. Dados um número de dias n (inteiro)
 e um volume v (ponto flutuante), qual deve ser o volume inicial 
para que em N dias se obtenha, pelo menos, um volume v desta cultura?  
*/
