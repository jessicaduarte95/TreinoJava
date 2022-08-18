public class Arrays {
    public static void main(String[] args) throws Exception {
        // Arrays (Vetores)

        int [] idades = null; // Essa variável não é do tipo primitivo, mas do tipo references. Pode ser feito int idades [].
        // Variáveis do tipo primitivo não podem ser inicializadas nulo, mas de referências sim.
        System.out.println(idades);
        // Arrays são considerados objetos, na memória.
        int[] idadesNew = new int[3]; // Contém 3 espaços.
        idadesNew[0] = 21;
        idadesNew[1] = 15;
        idadesNew[2] = 11;

        System.out.println(idadesNew[0]);
        System.out.println(idadesNew[1]);
        System.out.println(idadesNew[2]);

        // Tipos de Arrays

        // Padrões de Inicializações
        // byte, sort, int, long, double, float => 0
        // char => Espaço em branco.
        // booleano => Padrão de inicialização -> false
        //  String => null
        
        String[] nomes = new String[4];
        nomes[0] = "Maria";
        nomes[1] = "José";
        nomes[2] = "João";
        nomes[3] = "Joaquina";
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome: " + nomes[i]);
        }

        nomes =  new String[5]; // Passa a receber 5.

        // Formas de Inicialização

        int[] numeros = new int[3];
        System.out.println(numeros);

        int[] numeros2 = {1,2,3,4,5}; // Inicializando diretamente com os valores.
        for(int i = 0; i < numeros2.length; i++){
            System.out.println("Numeros2: " + numeros2[i]);
        }

        // Outra forma de inicializar já com os valores
        int[] numeros3 = new int[] {1,2,3,4,5};
        for(int i = 0; i < numeros3.length; i++){
            System.out.println("Numeros3: " + numeros3[i]);
        }

        // Forecach

        int[] numeros4 = new int[] {1,2,3,4,5};
        // num é uma variável local
        for(int num : numeros4){
            System.out.println(num);
        }

        // O tipo tem que ser o mesmo do array, por exemplo, se o num é int, o array precisa ser int.
        // Esse for de cima não dá os índices específicos. É apenas uma versão simplificada do for.
        
    }
}
