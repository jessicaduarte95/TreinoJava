package bintroducaometodos.teste;

import bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // É necessário igualar a uma variável, por exemplo, double result.
        double result = calculadora.divideDoisnumeros(20, 2);
        System.out.println(result);

        double result2 = calculadora.divideDoisnumeros2(30, 2);
        System.out.println(result2);

        System.out.println("------------------------");
        calculadora.imprimeDivisaoDeDoisNumeros(86, 0);

        calculadora.imprimeDivisaoDeDoisNumeros(100, 4);
    }
}
