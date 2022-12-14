public class App {
    public static void main(String[] args) {

        // Operadores Aritméticos (utilização de matemática com os números, +, *, /,-)
        int numero01 = 10;
        int numero02 = 20;
        System.out.println(numero02 - numero01);
        System.out.println(numero02+numero01);
        System.out.println("Valor: " + numero02 + numero01); // Por ter colocado uma string, irá haver uma concatenação.
        System.out.println(numero02+numero01 + "Teste" + numero02 + numero01);

        int resultado = numero01 + numero02;
        System.out.println(resultado);

        int multi = numero02*numero01;
        System.out.println(multi);

        int div = numero02/numero01;
        System.out.println(div);

        int div02 = numero01/numero02; //Sempre resultará um valor inteiro.
        System.out.println(div02);  // Resultará zero.

        double div03 = numero01/numero02; // Nesse caso o resultado também será zero, pois é necessário que uma variável seja double.
        System.out.println(div03);

        int numero03 = 10;
        double numero04 = 20;
        double div04 = numero03/numero04;
        System.out.println(div04);


        // Operadores Relacionais
        // Resto da divisão %
        int resto = 20%2;
        System.out.println(resto);

        int resto02 = 21%2;
        System.out.println(resto02);

        
        // Operadores Lógicos (sempre retornam valores booleanos, <, >, <=, >=, == (operador de comparação), !=)
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println(isDezMaiorQueVinte);
        
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println(isDezMenorQueVinte);

        boolean isDezIgualVinte = 10 == 20;
        System.out.println(isDezIgualVinte);

        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println(isDezDiferenteVinte);


        // Operadores Lógicos (AND -> &&)
        // São usados em estruturas condicionais.
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario > 4612;
        System.out.println("Está dentro da Lei (Maior que trinta)? " + isDentroDaLeiMaiorQueTrinta); 
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3300;
        System.out.println("Está dentro da Lei (Menor que trinta)? " + isDentroDaLeiMenorQueTrinta); 
        // Para ser verdade todas as condições precisam ser verdade
        boolean isTudoVerdadeiro = idade > 30 && salario <= 3500;
        System.out.println("Obtendo um resultado verdadeiro: " + isTudoVerdadeiro);


        // Operadores Lógicos (OU -> ||)
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("É possível comprar o playstation? " + isPlaystationCincoCompravel);


        // Operadores de Atribuição (=, +=, -=, *=, /=, %=)
        double bonus = 1800;
        //bonus = bonus + 1000;
        bonus += 1000;
        bonus *= 2;
        System.out.println("Bônus: " + bonus);

        int contador = 0;
        contador += 1; // contador = contador + 1
        contador ++; // contador = contador + 1
        contador --; // contador = contador - 1
        // Existe diferença entre colocar os sinais de ++ ou de -- na frente ou atrás.
        ++ contador;
        -- contador;
        System.out.println("Contador: " + contador);
        // Quando é colocado depois.
        int contador2 = 0;
        System.out.println("Contador2: " + contador2++); // Valor zero, pois primeiro imprime a variável e depois incrementa.
        System.out.println("Contador2PassaASerUm: " + contador2); // Passa a ser um, pois foi incrementado depois.
        // Quando é colocado antes.
        int contador3 = 0;
        System.out.println("Contador3: " + ++contador3); // Valor igual a um, primeiro incrementa e depois executa.
        System.out.println("Contador3ContinuaUm: " + contador3);
    }
}
