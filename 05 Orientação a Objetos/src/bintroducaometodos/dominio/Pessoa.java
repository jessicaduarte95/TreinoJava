package bintroducaometodos.dominio;

public class Pessoa {

    // Modificadores de Acesso -> Existe o público e o privado.
    private String nome;
    private int idade;

    // Um modificador de acesso privado só serão acessados pelo objeto, por exemplo, nesse caso Pessoa.
    
    // Acoplamento: o quanto uma classe conhece da outra. Está conectada com a outra.

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    // Quando se cria atributos privados, deve-se criar um metódo para conseguir acessá-los.
    // Esse método deve começar com a palavra set (Trata-se de convenção).
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        if(idade < 0){
            System.out.println("Idade Inválida!");
            return;
        }
        this.idade = idade;
    }

    // Para pegar o valor (que está em memória), nesse caso  deve começar com a palavra get (Trata-se de convenção)

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
}
