package teste;

import dominio.Calculadora;
import java.util.Scanner;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora");
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int numerosOpcao = scanner.nextInt();

        System.out.println("Qual seria o primeiro número para realizar o cálculo?");
        double numero1 = scanner.nextDouble();
        System.out.println("Qual seria o segundo número para realizar o cálculo?");
        double numero2 = scanner.nextDouble();

        switch (numerosOpcao){
            case 1:
                double resultadoSoma = calculadora.soma(numero1,numero2);
                System.out.println("Resultado da Soma: " + resultadoSoma);
                break;
            case 2:
                double resultadoSubtracao = calculadora.subtracao(numero1,numero2);
                System.out.println("Resultado da Subtração: " + resultadoSubtracao);
                break;
            case 3:
                double resultadoMultiplicacao = calculadora.multiplicacao(numero1,numero2);
                System.out.println("Resultado da Multiplicação: " + resultadoMultiplicacao);
                break;
            case 4:
                double resultadoDivicao = calculadora.divicao(numero1,numero2);
                System.out.println("Resultado da Divisão: " + resultadoDivicao);
        }
    }
}
