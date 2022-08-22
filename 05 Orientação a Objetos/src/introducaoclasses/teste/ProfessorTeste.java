package introducaoclasses.teste;

import introducaoclasses.dominio.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "João";
        professor.idade = 35;
        professor.sexo = 'M';
        System.out.println("Nome: " + professor.nome + ". Idade: " + professor.idade + ". Sexo: " + professor.sexo);
    }
}
