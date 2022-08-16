public class EstruturasRepeticaoForWhile {
    public static void main(String[] args){
        // while, do while, for

        // Dentro dos parênteses do while precisa resultar em uma expressão boleana.
        // Se tiver apenas uma expressão no while, as chaves podem ser omitidas. No do-while e no For tambám.
        int count = 0;
        while(count < 10){
            System.out.println(count);
            count ++;
        }

        // do while, executa, pelo menos, uma vez.
        count = 0; // Como a variável foi utilizada em cima, é necessário igualá-la novamente a zero. 
        do{
            System.out.println("Dentro do do-while " + count);
            count ++;
        }while(count < 10);

        // For (variável que será incrementada; condição; incremento da variável)

        for(int i = 0; i<10; i++){
            System.out.println("For " + i);
        }

        count = 0; //count recebe zero novamente
        for(count = 0; count<10; count++){
            System.out.println("For count: " + count);
        }// É necessário associar sempre um valor da variável dentro do for, por exemplo, count = 0.

        // Exercício
        // Imprimir números pares de zero a 100

        for (int i = 0; i <= 100; i += 2){
            System.out.println("Números pares (For): " + i);
        }

        int numPar = 0;

        while(numPar <=100) {
            System.out.println("Números Pares (while): " + numPar);
            numPar += 2;
        }

        numPar = 0;
        do{
            System.out.println("Números Pares(do-while): " + numPar);
            numPar += 2;
        }while(numPar <= 100);

        // Outra forma de fazer mais segura, caso o valor de i mude
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                System.out.println("Números pares (Outra Forma): " + i);
            }
        }

        // Break - Para a interação, sai do loop.

        // Imprimir os primeiros 25 números.

        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25){
                break;
            } // O break dentro do if precisa estar dentro do switch ou dentro do loop. 
            System.out.println("Primeiros 25 números: " + i);
        }

        // Exercício
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
        // Condição valorParcela >= 1000.

        int valorTotal = 30000;

        for (int parcela = 1; parcela <= valorTotal; parcela ++){
            double valorParcela = valorTotal/parcela;
            if(valorParcela >= 1000){
                System.out.println("Parcela " + parcela + " R$: " + valorParcela);
            }
            else{
                break;
            }
        }

        // Outra forma de ser feita

        valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela ++){
            double valorParcela = valorTotal/parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Parcela (Outra Forma) " + parcela + " R$: " + valorParcela);
        }

        // Continue

        double valorCarro = 30000;
        for (int parcela = (int)valorTotal; parcela >= 1; parcela--){
            double valorParcela = valorCarro/parcela;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " R$: " + valorParcela);
        }

    }    
}
