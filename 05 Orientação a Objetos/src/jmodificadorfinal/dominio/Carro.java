package jmodificadorfinal.dominio;

public final class Carro {
    // Ao colocar final na classe, significa que eu não quero que ela seja estendida.
    // A class String no java é colocada como final.
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250; // É uma constante.
    // Contantes são colocadas em uppercase e se tiver mais de uma palavra são separadas por underline (_).
    // No java, a constante é definida através da palavra final.
    public final Comprador COMPRADOR = new Comprador();
    // A referência que comprador tem para esse objeto nunca poderá ser alterada.

    // static {
    //     VELOCIDADE_LIMITE = 250;
    // }
    
    // public Carro(){
    //     VELOCIDADE_LIMITE = 250;
    // }

    public final void imprime(){
        // final -> esse método nunca poderá ser sobrescrito.
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
