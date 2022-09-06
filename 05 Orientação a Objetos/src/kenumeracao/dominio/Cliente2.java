package kenumeracao.dominio;

public class Cliente2 {
    // Enumeração pode ficar dentro de uma classe.
    public enum TipoPagamento {
        DEBITO, CREDITO
        // enum pode ser public, private, protected ou sem nada, que quer dizer que é um modificador de acesso de pacote
        // em que qualquer classe dentro do mesmo pacote pode acessar diretamente esse atributo.
    }
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipopagamento;

    public Cliente2(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento){
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipopagamento = tipoPagamento;
    }

    @Override
    public String toString(){
        return "Cliente " + nome + " " + tipoCliente.getNomeRelatorio() + " " + tipoCliente.getValor() + " " + tipopagamento;
    }

}
