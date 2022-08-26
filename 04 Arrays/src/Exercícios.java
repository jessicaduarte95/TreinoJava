public class Exercícios {
    public static void main(String[] args) {
        // Exercícios

        /*Criar um código que inicializa um array com 5 valores e também um segundo array que
        vai receber os mesmo valores do primeiro utilizando atribuição. B[0] = A[0]. Deve-se
        usar um laço de Repetição e não atribuir de forma direta os valores.*/

        int[] arrayA = {1,2,3,4,5};

        int[] arrayB = new int[5];

        for (int i = 0; i < arrayA.length; i++){
            arrayB[i] = arrayA[i];
            System.out.println(arrayB[i]);
        }

        System.out.println("[" + arrayB[0] + ", " + arrayB[1] + ", " + arrayB[2] + ", " + arrayB[3] + ", " + arrayB[4] + "] ");
        System.out.println("------------------");

        /*Criar um array de 10 posições de tipo inteiro que vai receber 10 valores. Criar também
        um segundo array de tipo String que vai receber o valor do primeiro multiplicado por 5
        com a seguinte descrição: "O valor multiplicado por 5 é:"*/

        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] arrayResult = new int[10];

        for(int i = 0; i < array.length; i++){
            arrayResult[i] = array[i] * 5;
            System.out.println(arrayResult[i]);
        }
        System.out.println("--------------------------");

        /*Criar dois arrays de tipo inteiro de tamanho 10 e inicializar os dois com valores
        diferentes. Criar também um  array de 10 posições que vai receber como valor
        para cada posição a subtração do array A pelo array B.
        C = A - B */

        int[] A = {3,10,9,18,16,18,29,26,28,50}; 
        int[] B = {3,6,9,12,15,18,21,24,27,30};

        int[] resultadoDeC = new int[10];

        for(int i = 0; i < A.length; i++){
            resultadoDeC[i] = A[i] - B[i];
            System.out.println(resultadoDeC[i]);
        }


        /*Criar e inicializar um array de inteiros de tamanho 10. Criar também um fluxo que vai ler
        os dados desse array e ao final dizer quantos valores são pares e quantos são ímpares.*/



        /*Criar e inicializar um array de 10 posições que vai receber 10 valores inteiros. Criar
        também um fluxo que vai ler o array e ao final exibir os seguintes dados:
        a. Quantos valores são maiores que 15
        b. Quantos valores são negativos
        c. Quantos valores são múltiplos de 5
        d. Qual a soma total dos valores.*/



        /*Criar um array do tipo String de 10 posições e inicializar. Para cada iteração do for, o
        valor da posição deve ser concatenado ao valor da variável ex:
        a. Nome
        b. Nome nome
        c. Nome nome casa*/



        /*Criar um array de tipo inteiro de 100 posições que vai receber valores de 0 a 100.
        Inicializar esse valores usando um laço de Repetição. E utilizando o foreach, printar
        todos os valores multiplicando por 2.*/

        
    }
}
