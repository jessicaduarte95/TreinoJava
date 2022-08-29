package gassociacao.teste;

import gassociacao.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Cafu");

        // Colocando os jogadores dentro de um array.
        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        for(Jogador jogador: jogadores){
            jogador.imprime();
        }
    }
}
