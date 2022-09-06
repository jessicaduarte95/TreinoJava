package kenumeracao.teste;

import kenumeracao.dominio.Cliente2;
import kenumeracao.dominio.TipoCliente;
import kenumeracao.dominio.Cliente2.TipoPagamento;

public class ClienteTeste02 {
    public static void main(String[] args) {

    Cliente2 cliente1 = new Cliente2("Tsubasa", TipoCliente.PESSOA_JURÍDICA, TipoPagamento.DEBITO);
    Cliente2 cliente2 = new Cliente2("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);

    System.out.println(cliente1);
    System.out.println(cliente2);
        
    }
}
