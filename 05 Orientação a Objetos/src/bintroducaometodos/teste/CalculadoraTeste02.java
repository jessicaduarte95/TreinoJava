package bintroducaometodos.teste;

import bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicaDoisNumeros(10, 20);
        System.out.println("Finalizando Multiplicação!");
    }
}
