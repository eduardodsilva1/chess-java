package chess;

import tabuleiro.Campo;
import tabuleiro.Pecas;

public class PecaDeXadrez extends Pecas {
    private Cor cor;

    public PecaDeXadrez(Campo campo, Cor cor) {
        super(campo);
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }
}
