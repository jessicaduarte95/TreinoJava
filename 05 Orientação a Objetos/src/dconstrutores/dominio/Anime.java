package dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;

    // Os construtores forçam a criação de algumas regras.
    // O objeto está sendo todo inicializado no construtor.

    public Anime(String nome, String tipo, int episodios, String genero){
        this(); // Para chamar um construtor dentro de outro construtor, precisa ser a primeira linha executável.
        System.out.println("Construtor com argumentos: é sempre inicializado primeiro, antes dos métodos.");
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios; 
        this.genero = genero; // No momento da crição da classe, a existência do nome, tipo, episodios e genero será obrigatória. 
    }

    public Anime(String nome, String tipo, int episodios, String genero, String estudio){
        this(nome, tipo, episodios, genero); // Só é possível usar essas sintaxes dentro de construtores.
        this.estudio = estudio;
    }

    // Sobrecarga de construtores.
    public Anime(){
        System.out.println("Dentro do construtor sem argumentos!");
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

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
