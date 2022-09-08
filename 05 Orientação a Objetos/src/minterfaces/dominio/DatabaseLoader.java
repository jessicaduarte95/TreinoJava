package minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{
    // Essa classe foi feita para carregar dados do banco de dados.
    // Quando se está trabalhando com interface, por exemplo em DataLoader, não se utiliza o extends, mas sim o implements.
    // Pode-se implementar várias interfaces.
    // Interfaces podem ter métodos com implementação.

    // Modificador de acesso do mais restritivo para o mais liberal:
    // private -> default -> protected -> public
    @Override // Implementar método
    public void load() {
        System.out.println("Carregando dados do banco de dados.");
    }
    @Override
    public void remove() {
        System.out.println("Deletando do banco de dados.");
    }
    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados.");
    }
}
