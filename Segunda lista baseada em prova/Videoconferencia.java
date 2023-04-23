public class Videoconferencia extends Compromisso {

    public String link;

    public Videoconferencia(String titulo) {
        super(titulo);
    }

    public Videoconferencia(String titulo, String convidado) {
        super(titulo, convidado);
    }

    public Videoconferencia(String titulo, String convidado, String link) {
        super(titulo, convidado);
        this.link = link;
    }

}