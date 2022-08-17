public class Exercícios {
    public static void main(String[] args) {
        // Exercícios

        /*Crie um algoritmo que leia um número diferente de zero e diga se este número é
        positivo ou negativo.*/

        int num = -1;
        if(num != 0){
            if(num < 0){
                System.out.println("Esse número é negativo.");
            }else {
                System.out.println("Esse número é positivo.");
            }
        }

        /*Crie um algoritmo que receba 3 números e informe qual o maior entre eles.*/

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        


        /*Criar um código que verifica se um valor de uma variável é igual a 100. Caso
        verdadeiro, escrever no console: “Verdadeiro”.*/

        int numVariavel = 100;
        if(numVariavel == 100){
            System.out.println("Verdadeiro.");
        }

        /*Criar um código que verifica se um valor de uma variável é igual a cem. Caso
        verdadeiro, escrever no console: “Verdadeiro”. Caso falso, escrever no console: “Falso”.*/

        int numVariavel2 = 100;
        if(numVariavel2 == 100){
            System.out.println("Verdadeiro.");
        }else{
            System.out.println("Falso.");
        }

        /*Criar um código que verifica 3 vezes (IF) se o valor de uma variável é igual a um valor
        qualquer, não atendendo em nenhum momentos as 3 condições e finalizando o fluxo
        no ELSE.*/

        int numero = 10;

        if(numero == 5){
            System.out.println("O número é igual a 5.");
        }else if(numero == 7){
            System.out.println("O número é igual a 7.");
        }else if(numero == 9){
            System.out.println("O número é igual a 9.");
        }else if(numero == 11){
            System.out.println("O número é igual a 11.");
        }else {
            System.out.println("O número fornecido é " + numero);
        }

        /*Criar um código que verifica 3 vezes (IF) se o valor de uma variável é igual a um valor
        qualquer, sendo atendida na segunda condição, não executando a terceira e nem um
        ELSE.*/


        /*Criar um código com uma estrutura SWITCH que verifica se o valor de uma variável é
        igual ao case (1, 2, 3). Os cases devem escrever quando o valor for igual ao seu
        próprio. Mostrando apenas a frase do case referente ao valor.*/


        /*Criar um código com uma estrutura SWITCH que verifica se o valor de uma variável é
        igual ao case (a, b, c e default). O código deve executar apenas o default com a
        mensagem: “O valor não é compatível”.*/
    }
}
