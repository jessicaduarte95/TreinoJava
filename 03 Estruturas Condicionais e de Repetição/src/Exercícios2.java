public class Exercícios2 {
    public static void main(String[] args) {

        // Exercícios

        /*Escreva um algoritmo que exiba 20 vezes a mensagem “Eu gosto de estudar
        Algoritmos!”.*/
       
        for(int i = 1; i <= 20; i++){
            System.out.println(i + " - Eu gosto de estudar algoritmos!");
        }

        /*Escreva um algoritmo que calcule a soma dos números de 1 a 15.*/

        int algoritmo = 0;
        for(int i = 1; i <= 15; i++){
            algoritmo = algoritmo + i;
        }
        System.out.println("Soma dos números: " + algoritmo);

        /*Leia o nome do usuário e escreva o nome dele na tela 10 vezes.*/

        String nomeUsuario = "Jéssica";
        for(int i = 0; i < 10; i++){
            System.out.println(i + " - " + nomeUsuario);
        }

        /*Leia o nome um número do usuário um número N e escreva o nome dele na tela N
        vezes.*/

        String usuarioNome = "João";
        int num = 5;
        for(int i = 0; i < num; i++){
            System.out.println(usuarioNome);
        }

        /*Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses
        números.*/

        int[] numero = {1,2,3,4,5,6,7,8,9,10};
        int soma = 0;

        for(int i = 0; i < 10; i++){
            soma = soma + numero[i];
        }

        System.out.println("A soma dos números é igual a " + soma);

        /*Leia a idade de 20 pessoas e exiba a soma das idades.*/

        int[] idade = {1,10,3,20,5,12,7,14,15,16,55,8,9,10,11,10,1,30,27,40};
        int somaIdade = 0;

        for(int i = 0; i < idade.length; i++){
            somaIdade += idade[i];
        }

        System.out.println("Soma das Idades: " + somaIdade);

        /*Leia a idade de 20 pessoas e exiba a média das idades.*/

        int sumIdade = 0;
        for (int i = 0; i < idade.length; i++) {
            sumIdade += idade[i];
        }
        System.out.println("Média das Idades: " + sumIdade/idade.length);

        /*Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.*/



        /*Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.*/



        /*Crie um algoritmo leia um número do usuário e exiba a sua tabuada de
        Multiplicação.*/



        /*Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são
        maiores do que 8.*/



        /*Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são
        Pares.*/


        /*Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
        100.*/



        /*Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
        100, quantos estão entre 101 e 200 e quantos são maiores de 200.*/



        /*Escreva um algoritmo que leia uma sequência de números do usuário e realize a
        soma desses números. Encerre a execução quando um número negativo for digitado.*/

    }
}
