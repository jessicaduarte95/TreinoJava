package exception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");
        //file.createNewFile(); // Erro de compilação do tipo check, que não está sendo tratada. É necessário
        // oferecer um tratamento para exceção.

        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        }catch (IOException e){
            e.printStackTrace(); // Imprime tudo o que aconteceu, o programa não vai parar de funcionar pois
            // foi feita a tratativa.
            // Lógica de negócio não deve ser colocada no catch.
        }
    }
}
