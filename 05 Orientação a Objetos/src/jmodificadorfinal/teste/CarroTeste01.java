package jmodificadorfinal.teste;

import jmodificadorfinal.dominio.Carro;
// import jmodificadorfinal.dominio.Comprador;
// import jmodificadorfinal.dominio.Ferrari;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        // Comprador comprador2 = new Comprador();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("João");
        System.out.println(carro.COMPRADOR);
        // Ferrari ferrari = new Ferrari();
        // ferrari.setNome("Teste nome");
        // ferrari.imprime();
    }
}
