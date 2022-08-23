package aintroducaoclasses.teste;

import aintroducaoclasses.dominio.Carro;

public class CarroTeste {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
    
        carro1.nome = "Fusca Bala";
        carro1.modelo = "Sport";
        carro1.ano = 1969;
    
        carro2.nome = "Mustang";
        carro2.modelo = "GT 500";
        carro2.ano = 1968;

        // Pode-se fazer referência a outro objeto.
        // Exemplo:
        carro1 = carro2; // carro1 faz referência ao mesmo objeto de carro2. 
        // O nome, modelo e ano terão os mesmos valores.
        // Só se pode fazer com objetos do mesmo tipo.
    
        System.out.println("Nome1: " + carro1.nome + "\nModelo1: " + carro1.modelo + "\nAno1: " + carro1.ano);
        System.out.println("Nome2: " + carro2.nome + "\nModelo2: " + carro2.modelo + "\nAno2: " + carro2.ano);  
    }
}
