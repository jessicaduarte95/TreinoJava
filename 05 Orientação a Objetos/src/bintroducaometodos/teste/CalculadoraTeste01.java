package bintroducaometodos.teste;

import bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando Calculadora!");
        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando Subtração!");
    }
}
