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

        int[] numArrays = {1,2,3,4,5,6,7,8,9,11}; 

        int par = 0;
        int impar = 0;

        for (int i =0; i < numArrays.length; i++){
            if(numArrays[i] % 2 ==  0){
                par += 1;
            }else if(numArrays[i] % 2 == 1){
                impar += 1;
            }
        }

        System.out.println("Quantidade de Números pares: " + par);
        System.out.println("Quantidade de Números ímpares: " + impar);

        /*Criar e inicializar um array de 10 posições que vai receber 10 valores inteiros. Criar
        também um fluxo que vai ler o array e ao final exibir os seguintes dados:
        a. Quantos valores são maiores que 15
        b. Quantos valores são negativos
        c. Quantos valores são múltiplos de 5
        d. Qual a soma total dos valores.*/

        int[] numeros = {20, 30, 40, 12, -6, -7, 3, 8, -9, 10};

        int maiorQueQuinze = 0;
        int numNegativos = 0;
        int multiplosDeCinco =0;
        int somaValores = 0;

        for(int i =0; i < numeros.length; i++){

            somaValores = somaValores + numeros[i];
            if (numeros[i] > 15){
                maiorQueQuinze += 1;
            } 
            if(numeros[i] < 0){
                numNegativos += 1;
            } 
            if(numeros[i] % 5 == 0){
                multiplosDeCinco += 1;
            }
        }

        System.out.println("Quantidade de números maiores que quinze: " + maiorQueQuinze);
        System.out.println("Quantidade de números negativos: " + numNegativos);
        System.out.println("Quantidade de números múltiplos de cinco: " + multiplosDeCinco);
        System.out.println("Soma total: " + somaValores);


        /*Criar um array do tipo String de 10 posições e inicializar. Para cada iteração do for, o
        valor da posição deve ser concatenado ao valor da variável ex:
        a. Nome
        b. Nome nome
        c. Nome nome casa*/

        String[] arrayWord = {"caneta", "lapis", "estojo", "caderno", "livro", "cadeira", "mesa", "quadro", "giz", "apagador"};
        String[] arrayResultado = new String[10];

        for (int i = 0; i < arrayWord.length; i++) {
            arrayResultado[i] = arrayWord[i];
            switch(i){
                case 0: {
                    System.out.println(arrayResultado[i]);
                    break;
                }
                case 1: {
                    System.out.println(arrayResultado[0] + " " + arrayResultado[i]);
                    break;
                }
                case 2: {
                    System.out.println(arrayResultado[0] + " " + arrayResultado[1] + " " + arrayResultado[2]);
                    break;
                }
                case 3: {
                    System.out.println(arrayResultado[0] + " " + arrayResultado[1] + " " + arrayResultado[2]+ " " + arrayResultado[3]);
                    break;
                }
                case 4: {
                    System.out.println(arrayResultado[0] + " " + 
                    arrayResultado[1] + " " + 
                    arrayResultado[2]+ " " + 
                    arrayResultado[3]+ " " +
                    arrayResultado[4]);
                    break;
                }
                case 5: {
                    System.out.println(arrayResultado[0] + " " + 
                    arrayResultado[1] + " " + 
                    arrayResultado[2]+ " " + 
                    arrayResultado[3]+ " " +
                    arrayResultado[4]+ " " +
                    arrayResultado[5]);
                    break;
                }
                case 6: {
                    System.out.println(arrayResultado[0] + " " + 
                    arrayResultado[1] + " " + 
                    arrayResultado[2]+ " " + 
                    arrayResultado[3]+ " " +
                    arrayResultado[4]+ " " +
                    arrayResultado[5]+ " " + 
                    arrayResultado[6]);
                    break;
                }
                case 7: {
                    System.out.println(arrayResultado[0] + " " + 
                    arrayResultado[1] + " " + 
                    arrayResultado[2]+ " " + 
                    arrayResultado[3]+ " " +
                    arrayResultado[4]+ " " +
                    arrayResultado[5]+ " " + 
                    arrayResultado[6]+ " " +
                    arrayResultado[7]);
                    break;
                }
                case 8: {
                    System.out.println(arrayResultado[0] + " " + 
                    arrayResultado[1] + " " + 
                    arrayResultado[2]+ " " + 
                    arrayResultado[3]+ " " +
                    arrayResultado[4]+ " " +
                    arrayResultado[5]+ " " + 
                    arrayResultado[6]+ " " +
                    arrayResultado[7]+ " " +
                    arrayResultado[8]);
                    break;
                }
                case 9: {
                    System.out.println(arrayResultado[0] + " " + 
                    arrayResultado[1] + " " + 
                    arrayResultado[2]+ " " + 
                    arrayResultado[3]+ " " +
                    arrayResultado[4]+ " " +
                    arrayResultado[5]+ " " + 
                    arrayResultado[6]+ " " +
                    arrayResultado[7]+ " " +
                    arrayResultado[8]+ " " +
                    arrayResultado[9]);
                    break;
                }
            }
        }


        /*Criar um array de tipo inteiro de 10 posições que vai receber valores de 0 a 10.
        Inicializar esse valores usando um laço de Repetição. E utilizando o foreach, printar
        todos os valores multiplicando por 2.*/

        int[] numVezesDois = {1,2,3,4,5,6,7,8,9,10};

        for (int i : numVezesDois) {
            System.out.print(i * 2 + " ");  
        } 

    }
}
