package kenumeracao.dominio;

public enum TipoCliente {
    // TipoCliente é uma enumeração.
    // Pode-se criar atributos dentro de uma enumeração.
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURÍDICA(2, "Pessoa Jurídica");

    private int valor;  // Tem que vir depois das enumerações
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio){
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public String getNomeRelatorio(){
        return nomeRelatorio;
    }

    public int getValor(){
        return valor;
    }
}
