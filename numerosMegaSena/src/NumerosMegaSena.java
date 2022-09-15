import java.util.Random;
import java.util.Scanner;

public class NumerosMegaSena {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a quantidade de números que devem ser sorteados?");
        int numerosQuant = scanner.nextInt();

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Todos os números.");
        System.out.println("2 - Somente pares.");
        System.out.println("3 - Somente ímpares.");
        int numerosOpcao = scanner.nextInt();

        int contPar = 0;
        int contImpar = 0;

        switch (numerosOpcao) {
            case 1:
                for (int i = 0; numerosQuant > i; i++) {
                    int numeroSorteados = random.nextInt(60);
                    System.out.print(numeroSorteados + " ");
                }
                break;
            case 2:
                while (contPar < numerosQuant){
                    int numeroSorteados = random.nextInt(60);
                    if(numeroSorteados%2 == 0){
                        System.out.print(numeroSorteados + " ");
                        contPar ++;
                    }
                }
                break;
            case 3:
                while (contImpar < numerosQuant){
                    int numeroSorteados = random.nextInt(60);
                    if(numeroSorteados%2 == 1){
                        System.out.print(numeroSorteados + " ");
                        contImpar ++;
                }
                }
        }
    }
}
