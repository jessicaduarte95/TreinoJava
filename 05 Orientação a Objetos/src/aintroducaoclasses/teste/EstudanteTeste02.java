package aintroducaoclasses.teste;

import aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante(); // Primeiro objeto -> estudante.
        Estudante estudante2 = new Estudante(); // Segundo objeto -> estudante2.
        
        estudante.nome = "José"; // Mesmo já tendo inicializado com um arquivo, pode-se mudar o nome.
        estudante.idade = 50;
        estudante.sexo = 'M';
        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);
        System.out.println("--------------");
        System.out.println("Nome2: " + estudante2.nome); // Foi inicializado anteriormente, no arquivo da classe.
    }
}
