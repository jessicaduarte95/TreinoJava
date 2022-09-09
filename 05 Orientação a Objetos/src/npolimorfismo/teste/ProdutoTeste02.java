package npolimorfismo.teste;

import npolimorfismo.dominio.Computador;
import npolimorfismo.dominio.Produto;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        // Tipo mais genérico (produto), fazendo referência para um tipo mais específico (Computador).
        Produto produto = new Computador("Ryzen 9", 3000);

        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
    }
}
