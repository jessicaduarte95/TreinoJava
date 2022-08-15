public class EstruturasCondicionais {
    // Bloco da Classe
    public static void main(String[] args){
        /*  Todas as variáveis que estão dentro de métodos, ou seja, entre essas chaves após public static,
        são chamadas de escopo local e essas variáveis precisam ser inicializadas, antes de serem executadas (adicinar um número, 
        fazer multiplicação), se não fizer isso haverá um erro de compilação.*/

        // Estruturas Condicionais IF
        // Dentro dos parênteses precisa ser um booleano
        if(true){
            System.out.println("Dentro do IF.");
        }
        System.out.println("Fora do IF.");

        int idade = 20;
        if(idade >= 18){
            System.out.println("Autorizado a comprar.");
        }

        boolean autorizadoAComprar = idade >= 18;
        if(autorizadoAComprar){
            System.out.println("Autorizado");
        }
        if(!autorizadoAComprar){
            System.out.println("Não está autorizado.");
        }
        boolean c = false;
        if(c == true){
            System.out.println("Não está correto.");
        }


        // Estruturas Condicionais ELSE IF
        if(autorizadoAComprar){
            System.out.println("Autorizado");
        }else {
            System.out.println("Não está autorizado.");
        }

        // idade < 15 Categoria Infantil
        // idade >= 15 && idade < 18 Categoria Juvenil
        // idade >=18 Categoria Adulto
        int idade2 = 17;
        String categoria;

        if(idade2 < 15){
            categoria = "Categoria Infantil";
        }else if(idade2 >=15 && idade2 < 18){
            categoria = "Categoria Juvenil";
        }else{
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);


        // Operador Ternário
        double salario = 6000;
        String mensagemDoar = "Vou doar 500 reais.";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter";
        // String resultado = (condicao) ? verdadeiro : falso;

        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println("Resultado: " + resultado);

        // Pode ser feito da forma abaixo, porém não é recomenado.
        categoria = idade2 < 15 ? "Categoria Infantil" : idade2 >=15 && idade2 < 18 ? "Categoria Juvenil" : "Categoria Adulto";
        System.out.println("Categoria com Ternário: " + categoria);

        // Tabela Verdade
        /* E => Para ser verdadeiro todas as condições precisam ser verdadeiras. Falso é mais forte.
           OU => Para ser falso todas as condições precisam ser falsa. Verdadeiro é mais forta.
         */

        // Exercício
        double salarioAnual = 70000;
        double primeiraFaixa = 9.7/100;
        double segundaFaixa = 37.35/100;
        double terceiraFaixa = 49.5/100;
        double valorImposto;
        
        if (salarioAnual <= 34712){
            valorImposto = salarioAnual*primeiraFaixa;
        }else if (salarioAnual > 34712 && salarioAnual <= 68508){
            valorImposto = salarioAnual*segundaFaixa;
        }else{
            valorImposto = salarioAnual*terceiraFaixa;
        }

        System.out.println(valorImposto);

    }
}
