import java.util.Scanner;

public class decimaTerceira {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int x , y;

        while(true){
            System.out.println("digite a coordenada x | digite 0 para encerrar");
            x = scan.nextInt(); 

            if(x==0){
                System.out.println("Programa encerrado...");
                break;
            }

            System.out.println("\ndigite a coordenada y | digite 0 para encerrar");
            y = scan.nextInt(); 
            
            if(y==0){
                System.out.println("Programa encerrado...");
                break;
            }
            
            if( x > 0 && y > 0 ){
                System.out.println(x + " " + y + " primeiro quadrante");
            } else if ( x > 0 && y < 0 ){
                System.out.println(x + " " + y + " quarto quadrante");
            } else if ( x < 0 && y > 0){
                System.out.println(x + " " + y + " segundo quadrante");
            } else {
                System.out.println(x + " " + y + " terceiro quadrante");
            }

        };

        scan.close();
    }
}




/*
Escreva um programa Java para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. 
O programa será encerrado quando o usuário informar zero para a coordenada X (nesta situação sem fazer a leitura da coordenada Y). 
[Para os dados de entrada abaixo] [Deve ser gerada a seguinte saída] 

2    2		primeiro
3   -2		quarto
4    7		primeiro
-8  -1		terceiro
-7   1		segundo
0


 */