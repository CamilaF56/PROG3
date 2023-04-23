package prova2;

public class HD {

    private String nome;
    private int tamanho;
    private Programa p = null;
    private SO so;
    private int ocupado = 0;
    private int[] vetorT;
    private String[] vetorS;
    private int x = 1;
    private boolean temSO = false;
    private boolean temProg = false;

    public HD(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
        vetorT = new int[this.tamanho];
        vetorS = new String[this.tamanho];
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void instalar(SO so) {
        if (this.so != null) {
            formatar();
            System.out.println("Sistema operacional será substituído por " + so.getNome() + " (" + so.getTipo() + ") "
                    + "e todos os programas serão removidos");
        } else {
            System.out.println("Sistema operacional " + so.getNome() + " (" + so.getTipo() + ") " + "instalado");
        }
        this.so = so;
        p = null;
        temSO = true;
        ocupado = so.getTamanho();

    }

    public void instalar(Programa p) {
        this.p = p;
        System.out.println("Programa " + p.getNome() + " instalado com sucesso");
        ocupado += p.getTamanho();
        vetorT[x] = p.getTamanho();
        vetorS[x] = p.getNome();
        x++;
    }

    public void listar() {
        if (temSO) {
            System.out.println("Nome do disco: " + getNome());
            System.out.println("Tamanho: " + ocupado + "Mb (ocupado)" + " de " + tamanho + "Mb");
            System.out.println("Sistema operacional: " + so.getNome() + " (" + so.getTipo() + ")");
        } else {
            System.out.println("O disco ainda não possui sistema operacional instalado");
        }

        for (int i = 1; i < x; i++) {
            if (vetorS[i] != null && vetorT[i] != 0) {
                temProg = true;
                break;
            }
        }

        if (temProg && ocupado != 0) {
            System.out.println("Programas Instalados");
            int i = x - 1;
            while (i > 0) {
                if (vetorS[i] != null && vetorT[i] != 0) {
                    System.out.println(vetorS[i] + " " + vetorT[i] + "Mb");
                }
                i--;
            }
        } else {
            System.out.println("Sem programas instalados");
        }
    }

    public void formatar() {
        if (temSO) {
            for (int a = 0; a < vetorT.length - 1; a++) {
                vetorT[a] = 0;
                vetorS[a] = "";
            }
            ocupado = 0;
            p = null;
            temSO = false;
        } else
            System.out.println("Sistema já formatado");
    }

}
