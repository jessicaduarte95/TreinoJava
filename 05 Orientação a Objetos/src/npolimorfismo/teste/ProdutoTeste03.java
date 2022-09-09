package npolimorfismo.teste;

import npolimorfismo.dominio.Computador;
import npolimorfismo.dominio.Produto;
import npolimorfismo.dominio.Tomate;
import npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------------------");
        CalculadoraImposto.calcularImposto(produto);

    }
}
