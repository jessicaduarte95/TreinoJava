public class CondicionaisSwitch {
    public static void main(String[] args) {
        //Imprima o dia da semana, considerando 1 como domingo.

        byte dia = 5;
        
        // Valores que podem ser usados: char, int, byte, short, num, String. Não são permitidos double e float.
        switch (dia){
            case 1: 
                System.out.println("Domingo");
                break;
            case 2: 
                System.out.println("Segunda");
                break;
            case 3: 
                System.out.println("Terça");
                break;
            case 4: 
                System.out.println("Quarta");
                break;
            case 5: 
                System.out.println("Quinta");
                break;
            case 6: 
                System.out.println("Sexta");
                break;
            case 7: 
                System.out.println("Sábado");
                break;
        }
        
        // Pode-se utilizar a chave após os dois pontos.
        char sexo = 'M';

        switch (sexo){
            case 'M': {
                System.out.println("Masculino");
                break;
            }
            case 'F': {
                System.out.println("Feminnino");
                break;
            }
        }
    }
    
}
