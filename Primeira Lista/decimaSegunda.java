import java.util.Scanner;

public class decimaSegunda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        byte opcao = 1; // Inicializando a variavel de opções

        int CL = 0; // Inicializando a varivel do candidato Cleiton
        int PR = 0; // Inicializando a varivel do candidato Pires
        int XD = 0; // Inicializando a varivel do candidato Xandinho
        int LD = 0; // Inicializando a varivel da candidata Lídia
        int N = 0; // Inicializando a varivel de votos nulos
        int B = 0; // Inicializando a varivel de votos brancos

        while (opcao != 0) {
            System.out.println("**************");
            System.out.println("1 - Candidato: Cleiton");
            System.out.println("2 - Candidato: Pires");
            System.out.println("3 - Candidato: Xandinho");
            System.out.println("4 - Candidata: Lídia");
            System.out.println("5 - Voto nulo");
            System.out.println("6 - Voto Branco");     
            System.out.println("7 - Mostrar resultados");         
            System.out.println("**************");
            System.out.print("Digite a opção: \n");
            opcao = scan.nextByte();

            switch (opcao) {
                case 0:
                    System.out.println("Você saiu do programa\n");
                    break;

                case 1:
                    System.out.println("\tOpção escolhida: Você votou no candidato Cleiton!\n");
                    CL++;
                    break;

                case 2:
                    System.out.println("\tOpção escolhida: Você votou no candidato Pires!\n");
                    PR++;
                    break;

                case 3:
                    System.out.println("\tOpção escolhida: Você votou no candidato Xandinho!\n");
                    XD++;
                    break;

                case 4:
                    System.out.println("\tOpção escolhida: Você votou na candidata Lídia!\n");
                    LD++;
                    break;

                case 5:
                    System.out.println("\tOpção escolhida: Você votou nulo!\n");
                    N++;
                    break;

                case 6:
                    System.out.println("\tOpção escolhida: Você votou branco!\n");
                    B++;
                    break;

                case 7:
                    System.out.println("\t Quantidade de votos - Cleiton: " + CL);
                    System.out.println("\t Quantidade de votos - Pires: " + PR);
                    System.out.println("\t Quantidade de votos - Xandinho: " + XD);
                    System.out.println("\t Quantidade de votos - Lídia: " + LD);
                    System.out.println("\t Quantidade de votos - Nulos: " + N);
                    System.out.println("\t Quantidade de votos - Brancos: " + B);
                    break;

                default:
                    System.out.println("ERROR, você digitou um número não reconhecido no sistema");
                }
            }
            
        scan.close();
    }
}

/*
Em uma eleição majoritária existem quatro candidatos. Os votos são informados através de códigos. Os dados utilizados para a contagem dos 
votos obedecem à seguinte codificação: 
1,2,3,4 = voto para os respectivos candidatos; 
5 = voto nulo; 
6 = voto em branco; 
Elabore um algoritmo que leia o código do candidato em um voto. Calcule e escreva: 
total de votos para cada candidato; 
total de votos nulos; 
total de votos em branco; 
Como flag do conjunto de votos, tem-se o valor 0
 */