import java.util.Scanner;

public class setima {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número");
        int n = ler.nextInt();
        
        for(int x = n; x < (n+n) ;x--){
            if(x % 4 == 0){
                System.out.println(x);
            }else if(x<0){
                break;
            }
        }

        ler.close();

    }
}
