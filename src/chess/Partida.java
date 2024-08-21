package chess;

import tabuleiro.Campo;

public class Partida {
    private Campo campo;

    public Partida(){
        campo = new Campo(8, 8);
    }

    public PecaDeXadrez[][] getPecas(){
        PecaDeXadrez[][] mate = new PecaDeXadrez[campo.getLinhas()][campo.getColunas()];
        for (int i=0; i< campo.getLinhas(); i++) {
            for (int j=0; j< campo.getColunas(); j++) {
                mate[i][j] = (PecaDeXadrez) campo.pecas(i, j);
            }
        }
        return mate;
    }
}
