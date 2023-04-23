public class Mes {

    Dia[] dias;

    public Mes() {
        dias = new Dia[31];
        for (int i = 0; i < dias.length; i++) {
            dias[i] = new Dia();
        }
    }

    public void addCompromisso(Compromisso c, int dia, int hora) {
        dias[dia].addCompromisso(c, hora);
        System.out.println("\nCompromisso agendado com sucesso");
    }

    public void addCompromissoDiario(Compromisso c, int hora) {
        for (int i = 1; i < dias.length; i++) {
            dias[i].addCompromisso(c, hora);
        }
    }

    public void desmarcarCompromisso(int dia, int hora) {
        dias[dia].desmarcarCompromisso(hora);
    }

    public void desmarcarCompromissos(int dia) {
        dias[dia].desmarcarCompromissos();
    }

    public void remarcarCompromisso(int diaOrigem, int horaOrigem, int diaDestino, int horaDestino) {
    }

    public void listarAgenda() {
        for (int i = 0; i < dias.length; i++) {
            if (dias[i].getTemCompromisso()) {
                System.out.println("\nDia " + i);
                dias[i].listarDia();
            }
        }
    }

}
