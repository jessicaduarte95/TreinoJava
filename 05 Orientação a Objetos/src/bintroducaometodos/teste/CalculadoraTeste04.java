package bintroducaometodos.teste;

import bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1, num2);  //Permanece com os valores que estavam dentro alteraDoisNumeros;
        System.out.println("Dentro do CalculadoraTeste04:");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);

        // Quando se passa tipos primitivos para o mesmo método, não passa a referência da variável.
    }
}
