package kenumeracao.teste;

import kenumeracao.dominio.Cliente;
import kenumeracao.dominio.TipoCliente;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURÍDICA);
        Cliente cliente4 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURÍDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);


        // Cliente cliente1 = new Cliente("Tsubasa", "PESSOA_FISICA");
        // Cliente cliente2 = new Cliente("Tsubasa", "PESSOA_JURÍDICA");
        // Cliente cliente3 = new Cliente("Tsubasa", "pessoa fisica");
        // Cliente cliente4 = new Cliente("Tsubasa", "pessoa juridica");
        
        // System.out.println(cliente1);
        // System.out.println(cliente2);
        // System.out.println(cliente3);
        // System.out.println(cliente4);
    }
}
