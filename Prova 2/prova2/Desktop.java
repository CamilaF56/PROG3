// Camila Fontes Santos

package prova2;

public class Desktop {
    private HD hd;

    public Desktop(String nomedoHD, int tamanho) {
        this.hd = new HD(nomedoHD, tamanho);
    }

    public Desktop(HD hd) {
        this.hd = new HD(hd.getNome(), hd.getTamanho());
    }

    public void instalar(SO so) {
        hd.instalar(so);

    }

    public void instalar(Programa programa) {
        hd.instalar(programa);

    }

    public void listar() {
        hd.listar();
    }

    public void formatar() {
        hd.formatar();
    }

}