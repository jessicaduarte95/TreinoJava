package npolimorfismo.teste;

import npolimorfismo.dominio.Computador;
import npolimorfismo.dominio.Televisao;
import npolimorfismo.dominio.Tomate;
import npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 10000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao televisao = new Televisao("Samsung 50\" ",5000 );

        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("-------------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
        System.out.println("--------------------------------");

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------------------------");
        CalculadoraImposto.calcularImposto(televisao);

    }
}
