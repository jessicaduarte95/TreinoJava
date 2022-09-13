package exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException{
        criarNovoArquivo();
        criarNovoArquivo2();
    }

    public static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt");
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
    }

    // Geralmente quando o método é privado usa-se o try/catch.
    // Porém quando é criado quando público, geralmente usa-se throws IOException.

    private static void criarNovoArquivo2() throws IOException{
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e) {
            e.printStackTrace(); // Trabalha a exceção no console.
            throw e; // Relançar a exceção.
        }
    }
}
