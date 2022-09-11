package npolimorfismoexercicio.servico;

import npolimorfismoexercicio.repositorio.Repositorio;

public class RepositorioBancoDaDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados.");
    }
}
