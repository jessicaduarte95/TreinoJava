package bintroducaometodos.teste;

import bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String... args) { // public static void main pode ser usado três pontos depois de String.
        Calculadora calculadora = new Calculadora();

        int[] numeros = {1,2,3,4,5};

        calculadora.somaArray(numeros);
        calculadora.somaArray(new int[] {1,2,3});

        calculadora.somaVarArgs(numeros);
        // VarArgs pode ser passado da forma abaixo.
        calculadora.somaVarArgs(1,2,3,4,5,6,7);
    }
}
