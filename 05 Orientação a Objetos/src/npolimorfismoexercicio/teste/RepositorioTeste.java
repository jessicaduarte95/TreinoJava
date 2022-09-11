package npolimorfismoexercicio.teste;

import npolimorfismoexercicio.repositorio.Repositorio;
import npolimorfismoexercicio.servico.RepositorioMemoria;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();

        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);
    }
}
