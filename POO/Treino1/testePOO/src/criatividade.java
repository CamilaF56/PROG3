public class criatividade {

    vizinho[] vizinhos;

    public void criarVizinhos(){
        vizinhos = new vizinho[4];

        vizinhos[0] = new vizinho();
        vizinhos[0].name = "Vini";
        vizinhos[0].idade = 20;
        vizinhos[0].calistenico = false;

        vizinhos[1] = new vizinho();
        vizinhos[1].name = "Marly";
        vizinhos[1].idade = 36;
        vizinhos[1].calistenico = true;

        vizinhos[2] = new vizinho();
        vizinhos[2].name = "Miguel";
        vizinhos[2].idade = 90;
        vizinhos[2].calistenico = false;

        vizinhos[3] = new vizinho();
        vizinhos[3].name = "Nadson";
        vizinhos[3].idade = 37;
        vizinhos[3].calistenico = false;
    }
    public static void main(String[] args){
        System.out.println("Bem vindo ao jogo sem criatividade");
        criatividade jogo = new criatividade();

        jogo.criarVizinhos();

        for(int i =0; i<4;i++){
            jogo.vizinhos[i].mortal();
        }
    }
}
