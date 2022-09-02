package hhereanca.dominio;

public class Funcionario extends Pessoa{
    // Um funcionário é uma pessoa, ele estende a funcionalidade pessoa.
    // Quando eu uso extends Pessoa, o Funcionario passará a ter todos os atributos e métodos que a Pessoa tem.

    private double salario;

    // Sobrescrita -> Escreve o método com a mesma assinatura que a classe pai, nesse caso a classe pessoa.
    // super -> refere-se ao objeto mais genérico, nesse caso Pessoa.
    // Herança múltipla não existe no java, não se pode estender mais de uma classe.
    // protected -> dá acesso a todos os atributos, como se o atributo estivesse na própria classe.

    static {
        System.out.println("Dentro do bloco de inicialização estático de funcionário.");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático de funcionário 1.");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático de funcionário 2.");
    }

    // Construtor de Herança
    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionário.");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome + " recebi o salário de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
