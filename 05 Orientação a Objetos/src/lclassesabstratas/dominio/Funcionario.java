package lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa{
    // Classes abstratas -> funcionario em si não existe, o que exite são os cargos. Ou seja, funcionário seria um
    // template, algo abstrato.

    // Criar um funcionario, não tem como saber o que ele exerce, seu cargo.
    // Para isso não ocorrer deve-se colocar a classe funcionário como abstrato.

    // Colocar abstrato em uma classe é como se ela passasse a ser um template. Não se poderá criar algo concreto.
    // O contrutor continua existindo pois estamos trabalhando com herança.

    // Uma classe abstrata foi criada para ser extendida. Não se pode usar o final, pois ela deve ser extendida.
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    public abstract void calculaBonus(); // Calculará com base em cada objeto.
    // É um método abstrato que obrigatoriamente precisa ser implementado em todas as subclasses de funcionário.
    // Não se pode ter um método abstrato em uma classe concreta.

    @Override
    public void imprime() {
        System.out.println("Imprimindo");
    }

//    public void calculaBonus(){
//        this.salario = salario + salario * 0.1;
//    } // Aplica para todo mundo.

    // O toString pode ser removido dessa classe, e ser colocado na subclasse(Gerente).
//    @Override
//    public String toString() {
//        return "Funcionario{" +
//                "nome='" + nome + '\'' +
//                ", salario=" + salario +
//                '}';
//    }
}
