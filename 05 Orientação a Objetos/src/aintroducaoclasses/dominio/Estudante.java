package aintroducaoclasses.dominio;


// A parte do domínio geralmente representa a parte de negócio, o que geralmente vai para o banco de dados.

public class Estudante {
    public String nome = "Sandy"; // Pode ser inicializado com um valor.
    public int idade;
    public char sexo;

    // Nome, idade e sexo são atributos da Classe Pessoa.

    // Coesão -> Propósito das classes. Essa classe é relacionada a Estudante somente, ou seja, é coesa.
    // Não é recomendado colocar o public static void main aqui.
}
