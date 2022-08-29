package fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios = {1,2,3,4,5,6,7,8,9,10,11,12}; // Pertence a Classe e não mais a instância/ao objeto.

    // 00 - Bloco de inicialização (estático) é executado quando a classe é carregada.
    // 01 - Alocado espaço em memória p o objeto;
    // 02 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado;
    // 03 - Bloco de inicialização é executado;
    // 04 - Construtor é executado.


    // Bloco de Inicialização estático: será inicializado apenas uma vez. Basta colocar a palavra static antes do bloco de inicialização.
    static {
        System.out.println("\nDentro do Bloco de Inicialização estático 1!");
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
    }

    // Se existir mais de um bloco de inicialização estático, eles serão executados na ordem em que aparecem.

    static {
        System.out.println("\nDentro do Bloco de Inicialização estático 2!");
    }

    static {
        System.out.println("\nDentro do Bloco de Inicialização estático 3!");
    }

    // Bloco de Inicialização não estático: é executado todas as vezes que o objeto é criado.

    {
        System.out.println("\nDentro do Bloco de Inicialização não estático!");
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime(){
        for(int episodio: Anime.episodios){
            System.out.print(episodio + " ");
        }
    }

    public String getNome(){
        return nome;
    }

    public int[] getEpisodios(){
        return episodios;
    }
}
