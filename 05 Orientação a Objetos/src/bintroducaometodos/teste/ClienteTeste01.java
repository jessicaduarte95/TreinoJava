package bintroducaometodos.teste;

import bintroducaometodos.dominio.Cliente;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setNome("Jéssica");
        cliente.setIdade(27);
        cliente.setEmail("email@gmail.com");

        System.out.println(cliente.getNome());
        System.out.println(cliente.getIdade());
        System.out.println(cliente.getEmail());
    }
}
