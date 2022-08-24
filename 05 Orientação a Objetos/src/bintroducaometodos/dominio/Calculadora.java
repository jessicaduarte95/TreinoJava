package bintroducaometodos.dominio;

public class Calculadora {
    // Métodos precisam de um modificador (public), além disso, os métodos ou retornam algo ou não retornam nada.
    // Retorno é diferente de saída.
    // Método sem retorno -> usa-se void.

    // Método sem retorno
    // Nome do método -> somaDoisNumeros. Primeira letra minúscula.
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(21-2);
    }

    // No método abaixo é necessário mandar uma variável do tipo inteiro. Passagem de parâmetros e argumentos.
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    // Método com retorno
    // Retornar um double.
    // É necessário retornar algo, por exemplo, usando o return.
    public double divideDoisnumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1/num2;
    }

    public double divideDoisnumeros2(double num1, double num2){
        if (num2 != 0){
            return num1/num2;
        }
        return 0;
    }

    // O return pode ser usado para métodos void.
    public void imprimeDivisaoDeDoisNumeros(double num1, double num2){
        if(num2 == 0){
            System.out.println("Não existe divisão por zero!");
        }
        else{
           System.out.println(num1/num2);
        }

    }

    public void imprimeDivisaoDeDoisNumeros2(double num1, double num2){
        if(num2 == 0){
            System.out.println("Não existe divisão por zero!");
            return; // Retorna para a Calculadora teste 3.
        }
        System.out.println(num1/num2);
    }

    // Passagem de parâmetros do tipo primitivos.

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    // VarArgs

    // Se usar VarArgs não se pode ter atributos depois.
    // Se usar atributos antes, os primeiros números passados (domínio.Calculadora, por exemplo) serão usados
    // no atributos passados e o resto dos números serão usados no VarArgs. 
    public void somaVarArgs(int...numeros){ // Funciona como um Array, VarArgs foi criado para mais simples.
        int soma = 0;
        for (int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
