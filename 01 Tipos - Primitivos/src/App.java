public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Testando");

        // Tipos Primitivos (int, double, float, char, byte, short, long, boolean)

        // Para se criar uma variável é necessário colocar o tipo dela.
        int idadeTeste = 10; // Equivale a 4 bytes;
        long numeroGrande = 100000; // Equivale a 8 bytes;
        double salarioDouble = 2000; // Equivale a 8 bytes, serve para números decimais;
        float salarioFloat = 2500.0f; // Equivale a 4 bytes, serve para números decimais; Tem que colocar o "f" para especificar que é um float;
        float salFloat = 2500;
        byte idadeByte = 10; // Até 127, equivale a um byte;
        short idadeShort = 10; // Equivale a dois bytes, até 32767;
        boolean verdadeiro = true; // Equivale a um byte;
        boolean falso = false; // Equivale a um byte;
        char caractere = 'A'; // Equivale a 2 bytes;
        char valorCaractere = 65; // Esse valor decimal corresponde a um caractere, por exemplo, o 65 corresponde a "A";

        System.out.println("IdadeByte: "+ idadeByte);
        System.out.println("IdadeShort: "+ idadeShort);
        System.out.println("IdadeInt: " + idadeTeste);
        System.out.println("NumeroGrande: "+ numeroGrande);
        System.out.println("SalarioFloat: " + salarioFloat + " ou " + salFloat);
        System.out.println("SalarioDouble: " + salarioDouble);
        System.out.println("Boolean: " + verdadeiro + " ou " + falso);
        System.out.println("Caractere: " + caractere);
        System.out.println("ValorCaractere: " + valorCaractere);

        // Casting: coloca um valor dentro de outro, mesmo que não seja correspondente;
        int idade = (int)10000000000L; // É um long, mas eu quero colocar dentro de um int; isso é um casting;
        System.out.println("Teste Casting: " + idade); // Ele irá cortar alguns bytes para fazer caber na força;
        // Não é uma prática muito boa.

        // String não é um tipo primitivo, é uma classe e no java elas começam com letras maiúsculas. As apresentadas acima
        // são tipos primitivos e, por isso, escreve-se com letra minúculo.

        String nomeString = "um grande texto"; // Caracter escreve-se com aspas simples e, String com aspas duplas. Não há um limite de tamanho.
        System.out.println("String: "+ nomeString);

        // Exercício

        String nome = "Jéssica";
        String endereco = "Condomínio NH, conjunto D, casa 1";
        double salario = 3500;
        String dataRecebimento = "5 de agosto de 2022.";

        System.out.println("Eu " + nome + ", " + "morando no endereço " + endereco + ", " + "confirmo que recebi o salário de " + 
        salario + ", " + "na data " + dataRecebimento);

        String relatorio = "Eu " + nome + ", " + "morando no endereço " + endereco + ", " + "confirmo que recebi o salário de " + 
        salario + ", " + "na data " + dataRecebimento;

        System.out.println(relatorio);
    }
}
