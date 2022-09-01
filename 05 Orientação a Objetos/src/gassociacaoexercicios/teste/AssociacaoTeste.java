package gassociacaoexercicios.teste;

import gassociacaoexercicios.dominio.Aluno;
import gassociacaoexercicios.dominio.Local;
import gassociacaoexercicios.dominio.Professor;
import gassociacaoexercicios.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");
        Aluno aluno = new Aluno("João", 17);
        Professor professor = new Professor("José", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Onde achar one piece", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
