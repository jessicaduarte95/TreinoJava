package lclassesabstratas.teste;

import lclassesabstratas.dominio.Desenvolvedor;
import lclassesabstratas.dominio.Funcionario;
import lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        //Funcionario funcionario = new Funcionario("Zoro", 2000); Passou a ser abstrata, não se pode ter um objeto
        // do tipo funcionario.
        // Criar um funcionario, não tem como saber o que ele exerce, seu cargo.
        // Para isso não ocorrer deve-se colocar a classe funcionário como abstrato.
        Gerente gerente = new Gerente("Nami", 5000);
        //System.out.println(funcionario);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Jéssica", 5500);
        System.out.println(desenvolvedor);

        gerente.imprime();
        desenvolvedor.imprime();
    }
}
