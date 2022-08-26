package bintroducaometodos.dominio;

public class FuncionarioExercicio {
    private String nome;
    private int idade;
    private double[] salarios;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setSalarios(double[] salarios){
        this.salarios = salarios;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public double[] getSalarios(){
        return salarios;
    }
}
