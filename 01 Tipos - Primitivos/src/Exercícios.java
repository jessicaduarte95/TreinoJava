public class Exercícios {
    public static void main(String[] args) {
        // Exercícios

        /*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
        mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
        (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.) */
        
        int idadeAnos = 10;
        int idadeMeses = 2;
        int idadeDias = 30;

        int idade = idadeAnos * 365 + idadeMeses * 30 + idadeDias;

        System.out.println("Idade expressa em dias: " + idade);


        /*Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
        números 4, 5 e 6. A soma das duas médias. A média das médias. */

        double media1 = (8 + 9 +7)/3;
        double media2 = (4 + 5 + 6)/3;
        double somaMedias = media1 + media2;

        System.out.println("Soma das Médias: " + somaMedias);

        /*Informar um saldo e imprimir o saldo com reajuste de 1%.*/

        double saldo = 1000;
        double saldoReajuste = saldo * 99/100;

        System.out.println("Saldo (Reajuste): " + saldoReajuste);

        /*Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
        calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
        (1SM=R$1288,00) */

        double salarioMinimo = 1288;
        double salarioUsuario = 6000;
        double qtdSalarioMinimo = salarioUsuario/salarioMinimo;

        System.out.println("Quantidade de Salários Mínimos: " + qtdSalarioMinimo);

        /*Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
        antecessor e seu sucessor. */

        int num = 10;
        int antecessor = num - 1;
        int sucessor = num + 1;

        System.out.println("Antecessor: " + antecessor + " Sucessor: " + sucessor);
    }
}
