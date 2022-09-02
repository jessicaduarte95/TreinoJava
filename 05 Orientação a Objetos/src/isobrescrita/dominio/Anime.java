package isobrescrita.dominio;

public class Anime{
    private String nome;

    // O nome precisa ser o mesmo, tem que ser exatamente a mesma classe.
    @Override  // Para ter certeza que está sobrescrevendo.
    public String toString(){
        return "Anime: " + this.nome;
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
