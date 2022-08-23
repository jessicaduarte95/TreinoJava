package aintroducaoclasses.teste;

import aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        //Para criar objetos é necessário usar a palavra new.
        // estudante -> É um objeto. (minúsculo)
        Estudante estudante = new Estudante();
        estudante.nome = "Maria";
        estudante.idade = 21;
        estudante.sexo = 'F';

        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo: " + estudante.sexo);
    }
}
