package npolimorfismoexercicio.servico;

import npolimorfismoexercicio.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em arquivo.");
    }
}
