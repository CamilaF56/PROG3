public class locadora {
    public static void main(String[] args) {
      int[] quantidadeFilmes = new int[50];
      int[] locacoesGratis = new int[50];
      int totalLocacoesGratis = 0;
  
      // Inicializa o vetor de quantidade de filmes
      for (int i = 0; i < quantidadeFilmes.length; i++) {
        quantidadeFilmes[i] = (int)(Math.random() * 100);
      }
  
      // Calcula a quantidade de locacoes gratis para cada cliente
      for (int i = 0; i < quantidadeFilmes.length; i++) {
        locacoesGratis[i] = quantidadeFilmes[i] / 10;
        totalLocacoesGratis += locacoesGratis[i];
      }
  
      // Imprime a quantidade de locacoes gratis para cada cliente
      System.out.println("Quantidade de locacoes gratis para cada cliente:");
      for (int i = 0; i < quantidadeFilmes.length; i++) {
        System.out.println("Cliente " + (i + 1) + ": " + locacoesGratis[i]);
      }
  
      // Imprime o total de locacoes gratis da locadora
      System.out.println("\nTotal de locacoes gratis da locadora: " + totalLocacoesGratis);
    }
  }
  