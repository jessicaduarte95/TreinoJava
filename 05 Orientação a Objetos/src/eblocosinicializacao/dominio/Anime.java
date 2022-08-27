package eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios = {1,2,3,4,5,6,7,8,9,10,11,12};

    // 01 - Alocado espaço em memória p o objeto;
    // 02 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado;
    // 03 - Bloco de inicialização é executado;
    // 04 - Construtor é executado.

    // Bloco de Inicialização: é executado antes do construtor.
    {
        System.out.println("Dentro do Bloco de Inicialização!");
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime(){
        for(int episodio: this.episodios){
            System.out.println(episodio + " ");
        }
    }

    public String getNome(){
        return nome;
    }

    public int[] getEpisodios(){
        return episodios;
    }
}
