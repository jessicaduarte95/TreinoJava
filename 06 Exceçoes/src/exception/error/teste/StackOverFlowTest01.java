package exception.error.teste;

public class StackOverFlowTest01 {
    public static void main(String[] args) {
    recursividade();
    }

    // Chamou diversas vezes, causando erro por ter estourado a memória.
    public static void recursividade(){
        recursividade();
    }

    // Existem exceções checadas e não checadas.
}
