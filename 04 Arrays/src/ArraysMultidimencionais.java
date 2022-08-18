public class ArraysMultidimencionais {
    public static void main(String[] args) {
        // Arrays Multidimencionais (Arrays de Arrays)

        // 1,2,3,4,5 ... Representando os meses do ano (janeiro, fevereiro...).
        // 31, 28, 31, 30 ... Representando os dias de cada mês.

        int[][] exemplo = new int[12][]; // O primeiro array precisa ter o tamnho definido.
        
        int[][] diasExemplo = new int[3][3];
        System.out.println("Dias Exemplo: " + diasExemplo[0]); // Aparecerá o endereço de memória.

        int[][] dias = new int [3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;

        for(int i = 0; i < dias.length; i++){
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        // FOREACH

        for(int[] arrBase : dias){
            for (int num : arrBase) {
                System.out.println("Foreach: " + num);
            }
        }

    }
}
