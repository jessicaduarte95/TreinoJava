package hhereanca.teste;

import hhereanca.dominio.Endereco;
import hhereanca.dominio.Funcionario;
import hhereanca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep(012345-209);

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Toyohisa Shimazu");
        pessoa.setCpf("11111111");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Oda Obunaga");
        funcionario.setCpf("222222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        System.out.println("------------");
        funcionario.imprime();        
    }
}
