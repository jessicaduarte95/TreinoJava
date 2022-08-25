package bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private int somaSalario;

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios == null){
            return;
        }
        for (int i = 0; i < salarios.length; i++) {
            System.out.print(salarios[i] + " ");
        }
        System.out.println("\n-------------------------");
    }

    public void imprimeMediaSalarial(){
        
        if (salarios == null){
            return;
        }
        for (int i = 0; i < salarios.length; i++) {
            somaSalario += salarios[i];
        }

        System.out.println("\nMédia Salarial: " + somaSalario/3);
    }

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

    public int getSomaSalario(){
        return somaSalario;
    }
}
