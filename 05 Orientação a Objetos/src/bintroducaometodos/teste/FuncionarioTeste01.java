package bintroducaometodos.teste;

import bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {

        // Usando os atributos públicos

        // Funcionario funcionario1 = new Funcionario();
        // Funcionario funcionario2 = new Funcionario();
        // Funcionario funcionario3 = new Funcionario();

        // funcionario1.nome = "Maria";
        // funcionario1.idade = 30;
        // funcionario1.salarios = new double[] {10000, 20000, 30000};

        // funcionario2.nome = "João";
        // funcionario2.idade = 60;
        // funcionario2.salarios = new double[] {200000, 155000, 136000};

        // funcionario3.nome = "Joaquina";
        // funcionario3.idade = 25;
        // funcionario3.salarios = new double[] {2000, 1500, 3000};

        // funcionario1.imprimir();
        // funcionario2.imprimir();
        // funcionario3.imprimir();

        // funcionario1.imprimeMediaSalarial();
        // funcionario2.imprimeMediaSalarial();
        // funcionario3.imprimeMediaSalarial();



        // Usando os atributos privados
        
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Maria");
        funcionario.setIdade(44);
        funcionario.setSalarios(new double[] {1200, 987.32, 2000});
        funcionario.imprimir();
        System.out.println("Média: " + funcionario.getSomaSalario());

    }
}
