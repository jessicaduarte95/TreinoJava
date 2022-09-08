package minterfaces.dominio;

public interface DataLoader {
    // Na interface não pode ser colocada a palavra final. Pois a interface é como se fosse um contrato.
    // Pode-se criar métodos.

    // Pode-se colocar atributos em uma interface e por padrão são constantes:
    public static final int MAX_DATA_SIZE = 10;

    void load(); // É um método abstrado, não precisa colocar public abstract. Por padrão eles são públicos.
    //public abstract void checkPermission(); // Quando se utiliza método abstrato você é obrigado a prover implementação
    // em todas as classes que estão fazendo a implementação. Para isso, ao invés de colocar public abstract, coloca-se
    // default.

    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões.");
    }

    // Pode-se adicionar métodos estáticos, que não poderam ser sobrecrito, pois pertence a interface:
    public static void retriveMaxDataSize(){
        System.out.println("Dentro do retriveMaxDataSize na interface.");
    }

}

