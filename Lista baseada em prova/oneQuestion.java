import java.util.Scanner;

class oneQuestion {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("COMPORTAMENTO DA CLIENTELA - PADARIA");
        int cliente25 = 0;
        int clientes = 0;
        int totalPao=0;
        int total = 1;
        double media = 0;
        double per25 = 0;
        double perPao = 0;

        while (total!=0) {
            System.out.println("Digite o seu total gasto na padaria: - Digite 0 para informar que todos os clientes foram registrados");
            int valor = ler.nextInt();
            total = total + valor;

            if(valor==0){
                break;
            }else if(valor > 25){
                cliente25++;
            }

            System.out.println("Digite o seu total gasto somente com pães: ");
            int valorPao = ler.nextInt();
            totalPao = totalPao + valorPao;

            clientes++; // Total de clientes

            if(totalPao > total){
                total = total - valor;
                totalPao = totalPao - valorPao;
                clientes--; 
            }
        }
        
        media = (float) (total-1) / clientes;
        per25 = (float) (cliente25 / clientes)*100;
        perPao = (float) totalPao / (total-1)*100;
        
        String resultPerPao = String.format("%.02f", perPao);

        System.out.println("A média de gasto por cliente é de " + media);
        System.out.println("O percentual de clientes que gastam mais que R$25,00 é de " + per25 + "%");
        
        System.out.println("O percentual gasto apenas com pão pelos clientes é de "+ resultPerPao + "%");
        

        ler.close();

    }
}

/*
 * O dono de uma padaria está querendo saber como é o comportamento de sua
 * clientela. Para isso
 * resolveu tentar responder as seguintes perguntas:
 * a) Qual a média de gasto por cliente
 * b) Qual o percentual de clientes que gastam mais que R$ 25,00
 * c) Qual o percentual gasto apenas com pão pelos clientes
 * Para isso, no sistema da registradora, foram coletadas as informações sobre
 * os gastos de cada cliente.
 * Faça um programa em Java que simule essa coleta (lendo os dados pelo
 * teclado). Os dados lidos devem
 * ser total gasto pelo cliente e total gasto com pão. O flag de parada é a
 * leitura do valor zero no total do
 * cliente.
 * Obs. Se o valor de total gasto com pão for maior que o total gasto pelo
 * cliente, o registro deve ser
 * desconsiderado.
 */