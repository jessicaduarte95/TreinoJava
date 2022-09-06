package kenumeracao.dominio;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;
    // private String tipo;
    // public static final String PESSOA_FISICA = "PESSOA_FISICA";
    // public static final String PESSOA_JURÍDICA = "PESSOA_JURÍDICA";


    public Cliente(String nome, TipoCliente tipoCliente){
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString(){
        return "Cliente " + nome + " " + tipoCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }






    // public Cliente(String nome, String tipo){
    //     // Comparar string tem que ser via equals.
    //     // equalsIgnoreCase -> Ignora diferença entre minúscula e maiúscula.
    //     if(!tipo.equals(PESSOA_FISICA) && !tipo.equals(PESSOA_JURÍDICA)){
    //         return;
    //     }
    //     this.nome = nome;
    //     this.tipo = tipo;
    // }

    // @Override
    // public String toString(){
    //     return "Cliente " + nome + " " + tipo;
    // }

    // public String getNome() {
    //     return nome;
    // }

    // public void setNome(String nome) {
    //     this.nome = nome;
    // }

    // public String getTipo() {
    //     return tipo;
    // }

    // public void setTipo(String tipo) {
    //     this.tipo = tipo;
    // }

}
