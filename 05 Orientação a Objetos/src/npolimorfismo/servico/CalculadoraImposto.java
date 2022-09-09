package npolimorfismo.servico;

import npolimorfismo.dominio.Computador;
import npolimorfismo.dominio.Produto;
import npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatório de Imposto do Computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador " + computador.getNome());
        System.out.println("Valor " + computador.getValor());
        System.out.println("Imposto a ser pago " + imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatório de Imposto do Tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate " + tomate.getNome());
        System.out.println("Valor " + tomate.getValor());
        System.out.println("Imposto a ser pago " + imposto);
    }

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de Imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

        // Verifica se o produto é uma instância de Tomate.
        // O objeto que o produto está fazendo uma refeência é uma instância de tomate.
        if(produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
//            System.out.println(((Tomate) produto).getDataValidade()); -> Forma mais simplificada.
        }
    }
}
