package tabuleiro;

public class Pecas {
        protected Posicao posicao;
        private Campo campo;

    public Pecas(Campo campo) {
        this.campo = campo;
        posicao = null;
    }

    public Campo getCampo() {
        return campo;
    }
}
