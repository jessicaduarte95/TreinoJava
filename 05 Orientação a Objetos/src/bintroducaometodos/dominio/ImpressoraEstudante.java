package bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        System.out.println(estudante.nome + " " + estudante.idade + " " + estudante.sexo);
        
        estudante.nome = "José"; // É capaz de alterar o nome.

        System.out.println(estudante.nome + " " + estudante.idade + " " + estudante.sexo);
    }
}
