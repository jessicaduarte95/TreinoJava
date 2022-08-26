package bintroducaometodos.teste;

import bintroducaometodos.dominio.FuncionarioExercicio;

public class FuncionarioExercicioTeste {
    public static void main(String[] args) {
        FuncionarioExercicio funcionario = new FuncionarioExercicio();

        double[] numeros = {34000, 30000, 40000};

        funcionario.setNome("João");
        funcionario.setIdade(55);
        funcionario.setSalarios(numeros);

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getIdade());
        System.out.println(funcionario.getSalarios());

    }
}
