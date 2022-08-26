package dconstrutores.teste;

import dconstrutores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 12, "Ação", "Production IG"); // Terá que passar o nome.
        anime.imprime();

        // Segundo construtor.
        // Anime anime2 = new Anime();
        // anime2.imprime();

        // O init não está sendo utilizado.
    }
}
