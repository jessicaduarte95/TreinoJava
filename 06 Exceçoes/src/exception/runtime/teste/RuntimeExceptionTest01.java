package exception.runtime.teste;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // Checked e Unchecked
        // Exceções checadas (checked): são filhas da classe exception diretamente. E se não tratadas lançarão
        // um erro em tempo de compilação, ou seja, não se consegue compilar o código.

        // Exceções não checadas (unchecked): são exceções que são filhas ou incluindo a classe exception.

        // RuntimeException: é uma exceção que vai ocorrer em tempo de execução. É erro do programador e que
        // não precisam ser tratadas.
        Object object = null;
        System.out.println(object); // Exceção: não foi encontrado um objeto.

        int[] nums = {1,2};
        System.out.println(nums[2]); // Não existe a posição 2.

        // Error não é uma exceção, pois não é filha de exceotion. Error é um throwable.

    }
}
