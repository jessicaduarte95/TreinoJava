package hhereanca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    // protected -> dá acesso a todos os atributos dessa classe, como se o atributo estivesse na própria classe (Funcionario).

    static {
        System.out.println("Dentro do bloco de inicialização estático de pessoa.");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático de pessoa 1.");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático de pessoa 2.");
    }

    public Pessoa(String nome){
        System.out.println("Dentro do construtor de pessoa.");
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
