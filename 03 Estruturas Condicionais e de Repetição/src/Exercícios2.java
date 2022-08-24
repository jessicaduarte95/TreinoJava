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
        for (int i = 0; i < idade.length; i++){
            sumIdade += idade[i];
        }
        System.out.println("Média das Idades: " + sumIdade/idade.length);

        /*Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.*/

        int somaMaiorIdade = 1;
        for(int i = 0; i < idade.length; i++){
            if(idade[i] >= 18){
                somaMaiorIdade = somaMaiorIdade + 1;
            }
        }
        System.out.println("Quantidade de pessoas maiores de idade: " + somaMaiorIdade);

        /*Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.*/



        /*Crie um algoritmo leia um número do usuário e exiba a sua tabuada de
        Multiplicação.*/

        int numUsuario = 2;

        for(int i = 1; i <= 10; i++){
            System.out.println("Resultado Tabuada: " + numUsuario * i);
        }

        /*Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são
        maiores do que 8.*/

        int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int maiorNum = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] > 8){
                maiorNum += 1;
            }
        }
        System.out.println("Quantidade de números maiores que oito: " + maiorNum);

        /*Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são
        Pares.*/

        int numPar = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2 == 0){
                numPar += 1;
            }
        }
        System.out.println("Quantidade de números pares: " + numPar);

        /*Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
        100.*/

        int quant = 0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] < 100 & numeros[i] > 0){
                quant += 1;
            }
        }
        System.out.println("Quantidade de números entre 0 e cem: " + quant);

        /*Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
        100, quantos estão entre 101 e 200 e quantos são maiores de 200.*/

        int[] numerosNovo = {10,201,3,4,5,160,7,800,9,10,110,120,13,14,15,16,17,18,19,20};
        int ateCem = 0;
        int maiorQueCem = 0;
        int maiorQueDuzentos = 0;
        for (int i = 0; i < numerosNovo.length; i++) {
            if(numerosNovo[i] > 0 & numerosNovo[i] < 100){
                ateCem += 1;
            }else if(numerosNovo[i] > 100 & numerosNovo[i] < 200){
                maiorQueCem += 1;
            }else if(numerosNovo[i] > 200){
                maiorQueDuzentos += 1;
            }
        }
        System.out.println("Quantidade entre 0 e 100: " + ateCem);
        System.out.println("Quantidade entre 0 e 100: " + maiorQueCem);
        System.out.println("Quantidade entre 0 e 100: " + maiorQueDuzentos);

        /*Escreva um algoritmo que leia uma sequência de números do usuário e realize a
        soma desses números. Encerre a execução quando um número negativo for digitado.*/

        int[] numerosSequencia = {1,2,3,4,5,-6,7};
        int somandoValores = 0;

        for(int i = 0; i < numerosSequencia.length; i++){
            if (numerosSequencia[i] < 0){
                break;
            }else{
                somandoValores = somandoValores + numerosSequencia[i];
            }
        }

        System.out.println("Soma dos números: " + somandoValores);

    }
}
