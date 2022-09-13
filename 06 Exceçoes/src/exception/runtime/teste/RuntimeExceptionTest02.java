package exception.runtime.teste;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(1,0));
        // Terá uma AritmeticException (é uma runtime exception), pois não se pode dividir 1 por 0.
    }

    private static int divisao(int a, int b){
        if(b == 0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser zero.");
            // IllegalArgumentException: método recebeu um argumento inapropriado.
            // throw new: é usado quando faz um lançamento de exceção, geralmente será do tipo runtime.
        }
        return a/b;
//        try{
//            return a/b;
//        }catch (ArithmeticException e){
//            e.printStackTrace();
//        }
//        return 0;
    }
}
