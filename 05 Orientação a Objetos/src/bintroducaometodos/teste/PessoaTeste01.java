package bintroducaometodos.teste;

import bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jéssica");
        pessoa.setIdade(27);
        // pessoa.imprime();

        // Não se pode colocar um void dentro System.out.println().
        // Por isso é criado um outro tipo, nesse caso usa-se como nome o get.
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
