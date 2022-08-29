package fmodificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    //public static double velocidadeLimite = 250; // Modificador estático -> static
    // Modificador estático: pertence a classe em si, não mais ao objeto.
    private static double velocidadeLimite = 250;

    public Carro(String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("----------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
        System.out.println("Velociade Limite: " + Carro.velocidadeLimite);
        // Velocidade limite foi adicinado um modificador estático, não será necessário usar o this, mas usar o nome da classe.
    }

    // Método Estático: pertence a classe

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
        // Não será usado o this, mas sim Carro, pois será usado o nome da classe.
    }

    public static double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


    // public double getVelocidadeLimite() {
    //     return velocidadeLimite;
    // }

    // public void setVelocidadeLimite(double velocidadeLimite) {
    //     this.velocidadeLimite = velocidadeLimite;
    // }

}
