package minterfaces.teste;

import minterfaces.dominio.DataLoader;
import minterfaces.dominio.DatabaseLoader;
import minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
        databaseLoader.remove();
        fileLoader.remove();
        databaseLoader.checkPermission();
        fileLoader.checkPermission();
        DataLoader.retriveMaxDataSize();

        // Não se pode criar objetos de interface. Não pode -> new DataLoader();
    }
}
