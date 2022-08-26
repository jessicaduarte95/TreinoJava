package csobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public void init(String nome, String tipo, int episodios){ // Esse método faz a inicialização de todos os atributos. init -> Inicialização.
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    // Sobrecarga de Métodos: é ter o método com o mesmo nome, porém o tipo ou a quantidade dos parâmetros são diferentes.
    // Pode-se ter o mesmo nome. 

    public void init(String nome, String tipo, int episodios, String genero){ // Esse método faz a inicialização de todos os atributos. init -> Inicialização.
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    // Construtores não possuem nenhum tipo de retorno
    // Anime -> Representa o nome da classe, o construtor terá o mesmo nome.
    public Anime(){

    }

    // Caso você não escreva um construtor no meio da classe, o java adiciona um no meio da compilação.
    // Pois é necessário ter um construtor para dar origem a um objeto.

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getGenero(){
        return genero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public int getEspisodios(){
        return episodios;
    }
}
