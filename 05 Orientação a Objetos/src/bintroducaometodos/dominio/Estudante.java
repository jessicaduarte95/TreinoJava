package bintroducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){  // Está dentro do objeto Estudante.
        System.out.println(this.nome); // this é usado para se referir a algo que está dentro do objeto.
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
