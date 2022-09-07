package kenumeracao2.dominio;

public enum TipoPagamento {
    DEBITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        } // Dentro de DEBITO eu estou sobescrevendo calcularDesconto, que foi declarado fora.
    }, CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calcularDesconto(double valor); // É abstrato, ele em si não existe, o que existe é a implementação
    // do método calcular desconto feito acima. Método abstrato não pode ter corpo.

//    public double calcularDesconto(double valor){
//        return 0; // Esse método não está sendo utilizado.
//    }
}
