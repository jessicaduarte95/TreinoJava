package fmodificadorestatico.teste;

import fmodificadorestatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);
        // c1.setVelocidadeLimite(180); // Mudará a velocidade de todos os carros, pois foi adicionado 
        //o modificador estático.

        // Mudando velocidadeLimite para public, pode ser acessado.
        // Carro.velocidadeLimite = 180; // Passa a ter 180, afetando todos os objetos da classe.
        // System.out.println(Carro.velocidadeLimite);

        c1.imprime();
        c2.imprime();
        c3.imprime();

        // Após usar o método estático
        Carro.setVelocidadeLimite(180);
        System.out.println("---------------");
        System.out.println("Velocidade Limite: " + Carro.getVelocidadeLimite());
    }
}
