package application;

import chess.Partida;
import tabuleiro.Campo;

public class Programa {
    public static void main (String[] args) {
        Partida partida = new Partida();
        UI.printCampo(partida.getPecas());
    }
}
