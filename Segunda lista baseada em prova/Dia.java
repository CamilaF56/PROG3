public class Dia {
    Compromisso[] horarios;
    int qtdCompromisso;

    public Dia() {
        horarios = new Compromisso[24];
        qtdCompromisso = 0;
    }

    public void addCompromisso(Compromisso c, int hora) {
        horarios[hora] = c;
        qtdCompromisso++;
    }

    public boolean getTemCompromisso() {
        return qtdCompromisso > 0;
    }

    public void listarDia() {
        for (int i = 0; i < horarios.length; i++) {
            if (horarios[i] != null) {
                System.out.println("\nHora " + i + ":00");
                System.out.println("Título: " + horarios[i].titulo);
                if (horarios[i] instanceof Videoconferencia) {
                    System.out.println("\nLink: " + ((Videoconferencia) horarios[i]).link);
                }
            }
        }
    }

    public void desmarcarCompromissos() {
        for (int i = 0; i < horarios.length; i++) {
            horarios[i] = null;
        }
        qtdCompromisso = 0;
    }

    public void desmarcarCompromisso(int hora) {
        if (horarios[hora] != null) {
            horarios[hora] = null;
            qtdCompromisso--;
            System.out.println("\nO compromisso foi desmarcado com sucesso");
        } else {
            System.out.println("\nNão tem compromisso nesse horário");
        }
    }

}
