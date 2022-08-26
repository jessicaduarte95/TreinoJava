package csobrecargametodos.teste;

import csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        // anime.setNome("Akudama Drive");
        // anime.setTipo("TV");
        // anime.setEpisodios(12);

        // Ao invés de usar as três de cima, pode-se utilizar a de baixo.
        anime.init("Akudama Drive", "TV", 12);

        // Inclusão de um novo atributo.

        anime.init("Akudama Drive", "TV", 12, "Ação");

        // Pode-se executar os dois init's, porém o segundo sobescreve o primeiro.

        anime.imprime();
    }
}
