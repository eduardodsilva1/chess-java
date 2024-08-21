package tabuleiro;

public class Campo {
    private int linhas;
    private int colunas;
    private Pecas [][] pecas;

    public Campo(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Pecas[linhas][colunas];
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }
    public Pecas pecas(int linhas, int colunas){
        return pecas [linhas][colunas];
    }
    public Pecas pecas(Posicao posicao){
        return pecas [posicao.getLinha()][posicao.getColuna()];
    }
}
