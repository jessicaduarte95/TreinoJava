package bintroducaometodos.teste;

import bintroducaometodos.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
    
        estudante01.nome = "Joana";
        estudante01.idade = 18;
        estudante01.sexo = 'F';
    
        estudante02.nome = "Joaquina";
        estudante02.idade = 17;
        estudante02.sexo = 'F';
    
        estudante01.imprime();
        estudante02.imprime();   
    }
}
