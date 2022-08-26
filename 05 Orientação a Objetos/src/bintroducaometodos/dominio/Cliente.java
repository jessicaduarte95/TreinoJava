package bintroducaometodos.dominio;

public class Cliente {
    private String nome;
    private int idade;
    private String email;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getEmail(){
        return email;
    }
}
